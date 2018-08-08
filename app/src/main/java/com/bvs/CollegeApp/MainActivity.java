/**
 * Created by Gopal on 09/02/2017.
 **/

package com.bvs.CollegeApp;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.ProgressBar;

import com.bvs.CollegeApp.activity.LoginActivity;
import com.bvs.CollegeApp.gpa.GpaFragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(toolbar);

        //get firebase auth instance
        auth = FirebaseAuth.getInstance();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        if (progressBar != null) {
            progressBar.setVisibility(View.GONE);
        }

        /**
         * Setup the DrawerLayout and NavigationView
         **/

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.navstuff);

        /**
         * Inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         **/

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();

        /**
         * Setup click events on the Navigation View Items.
         **/

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if (menuItem.getItemId() == R.id.main_activity) {
                    FragmentTransaction dfragmentTransaction = mFragmentManager.beginTransaction();
                    dfragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();
                }

                if (menuItem.getItemId() == R.id.nav_item_syllabus) {
                    Intent i = new Intent(MainActivity.this, SubjectsFragment.class);
                    startActivity(i);

                }

                if (menuItem.getItemId() == R.id.nav_item_calendar) {
                    Intent i = new Intent(MainActivity.this, ListViewActivity.class);
                    startActivity(i);

                }

                if (menuItem.getItemId() == R.id.nav_item_gpa) {
                    Intent i = new Intent(MainActivity.this, GpaFragment.class);
                    startActivity(i);
                }

                if (menuItem.getItemId() == R.id.nav_item_results) {
                    Intent i = new Intent(MainActivity.this, ResultsFragment.class);
                    startActivity(i);

                }

                if (menuItem.getItemId() == R.id.nav_item_about) {
                    FragmentTransaction afragmentTransaction = mFragmentManager.beginTransaction();
                    afragmentTransaction.replace(R.id.containerView, new AboutTab()).commit();

                }


                if (menuItem.getItemId() == R.id.nav_item_website) {
                    Intent i = new Intent(MainActivity.this, WebsiteFragment.class);
                    startActivity(i);
                }

                if (menuItem.getItemId() == R.id.nav_item_feedback) {
                    Intent i = new Intent(MainActivity.this, FeedbackActivity.class);
                    startActivity(i);
                }

                if (menuItem.getItemId() == R.id.nav_item_rateus) {
                    Uri uri = Uri.parse("market://details?id=" + getPackageName());
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    // To count with Play market backstack, After pressing back button,
                    // to taken back to our application, we need to add following flags to intent.
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                    }
                }

                if (menuItem.getItemId() == R.id.nav_item_logout) {
                    logoutUser();
                }


                if (menuItem.getItemId() == R.id.nav_item_exit) {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }

                return false;
            }

        });


        /**
         * Setup Drawer Toggle of the Toolbar.
         **/


        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();
    }

    /**
     * Options Menus Controls.
     **/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            AlertDialog.Builder about = new AlertDialog.Builder(this);
            about.setTitle("About the app");
            about.setMessage("PCAS the College App is an android app developed by B.Gopalakrishnan");
            about.create().show();
            about.setCancelable(true);
        }

        if (item.getItemId() == R.id.action_logout) {
            logoutUser();
        }

        if (item.getItemId() == R.id.action_exit) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }
        return true;
    }

    //sign out method
    public void logoutUser() {
        FirebaseAuth.getInstance().signOut();
    }

    /*@Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }*/

    @Override
    public void onStart() {
        super.onStart();
        auth.addAuthStateListener(authListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (authListener != null) {
            auth.removeAuthStateListener(authListener);
        }
    }

    /**
     * Back button actions
     */
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed(); // used to operate default back button
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

}
