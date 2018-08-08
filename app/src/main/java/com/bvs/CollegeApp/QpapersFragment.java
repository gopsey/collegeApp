package com.bvs.CollegeApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bvs.CollegeApp.qpapers.ba1;
import com.bvs.CollegeApp.qpapers.ba2;
import com.bvs.CollegeApp.qpapers.ba3;
import com.bvs.CollegeApp.qpapers.bba1;
import com.bvs.CollegeApp.qpapers.bba2;
import com.bvs.CollegeApp.qpapers.bba3;
import com.bvs.CollegeApp.qpapers.bca1;
import com.bvs.CollegeApp.qpapers.bca2;
import com.bvs.CollegeApp.qpapers.bca3;
import com.bvs.CollegeApp.qpapers.bcom1;
import com.bvs.CollegeApp.qpapers.bcom2;
import com.bvs.CollegeApp.qpapers.bcom3;
import com.bvs.CollegeApp.qpapers.bcomcs1;
import com.bvs.CollegeApp.qpapers.bcomcs2;
import com.bvs.CollegeApp.qpapers.bcomcs3;
import com.bvs.CollegeApp.qpapers.bsc1;
import com.bvs.CollegeApp.qpapers.bsc2;
import com.bvs.CollegeApp.qpapers.bsc3;
import com.bvs.CollegeApp.qpapers.bscmat1;
import com.bvs.CollegeApp.qpapers.bscmat2;
import com.bvs.CollegeApp.qpapers.bscmat3;
import com.bvs.CollegeApp.qpapers.bscpsy1;
import com.bvs.CollegeApp.qpapers.bscpsy2;
import com.bvs.CollegeApp.qpapers.bscpsy3;
import com.bvs.CollegeApp.qpapers.bsw1;
import com.bvs.CollegeApp.qpapers.bsw2;
import com.bvs.CollegeApp.qpapers.bsw3;
import com.bvs.CollegeApp.qpapers.ma1;
import com.bvs.CollegeApp.qpapers.ma2;
import com.bvs.CollegeApp.qpapers.mcom1;
import com.bvs.CollegeApp.qpapers.mcom2;
import com.bvs.CollegeApp.qpapers.msw1;
import com.bvs.CollegeApp.qpapers.msw2;
import com.bvs.CollegeApp.qpapers.viscom1;
import com.bvs.CollegeApp.qpapers.viscom2;
import com.bvs.CollegeApp.qpapers.viscom3;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Gopal on 09/02/2017.
 **/

public class QpapersFragment extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner2;
    String[] SPINNERVALUES = {"SELECT","B.C.A","B.SC COMP","B.COM GEN","B.COM CS","B.B.A","B.SC VISCOM","B.A ENG","B.SC MATHS","B.SC PSYCH","B.S.W","M.A ENG","M.S.W","M.COM"};
    String[] SPINNERVALUES2 = {"SELECT","I YEAR","II YEAR","III YEAR"};
    String SpinnerValue;
    String SpinnerValue2;
    Button GOTO;
    Intent intent;
    ImageView imgBack;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qpapers_tab);

        spinner =(Spinner)findViewById(R.id.spinner);
        spinner2 =(Spinner)findViewById(R.id.spinner2);


        GOTO = (Button)findViewById(R.id.btn_syllabus);

        imgBack =(ImageView)findViewById(R.id.imgback);

        //getActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SPINNERVALUES);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SPINNERVALUES2);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                SpinnerValue = spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        //Adding setOnItemSelectedListener method on spinner2.
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                SpinnerValue2 = spinner2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(SpinnerValue.equals("SELECT") && SpinnerValue2.equals("SELECT")){

                    intent = new Intent(QpapersFragment.this, QpapersFragment.class);
                    startActivity(intent); }

                if(SpinnerValue.equals("B.C.A") && SpinnerValue2.equals("I YEAR")){

                    intent = new Intent(QpapersFragment.this, bca1.class);
                    startActivity(intent); }

                if((SpinnerValue.equals("B.C.A")) && (SpinnerValue2.equals("II YEAR"))){

                    intent = new Intent(QpapersFragment.this, bca2.class);
                    startActivity(intent); }

                if((SpinnerValue.equals("B.C.A")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bca3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC COMP")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bsc1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC COMP")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bsc2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC COMP")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bsc3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.COM GEN")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bcom1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM GEN")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bcom2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM GEN")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bcom3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.COM CS")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bcomcs1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM CS")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bcomcs2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM CS")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bcomcs3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.B.A")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bba1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.B.A")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bba2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.B.A")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bba3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC VISCOM")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, viscom1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC VISCOM")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, viscom2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC VISCOM")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, viscom3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.A ENG")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, ba1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.A ENG")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, ba2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.A ENG")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, ba3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC MATHS")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bscmat1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC MATHS")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bscmat2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC MATHS")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bscmat3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC PSYCH")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bscpsy1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC PSYCH")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bscpsy2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC PSYCH")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bscpsy3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.S.W")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bsw1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.S.W")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bsw2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.S.W")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(QpapersFragment.this, bsw3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("M.A ENG")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, ma1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("M.A ENG")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, ma2.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("M.S.W")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, msw1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("M.S.W")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, msw2.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("M.COM")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(QpapersFragment.this, mcom1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("M.COM")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(QpapersFragment.this, mcom2.class);
                    startActivity(intent);
                }


            }
        });

        imgBack.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                finish();
            }

        });

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

    }


   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }

}
