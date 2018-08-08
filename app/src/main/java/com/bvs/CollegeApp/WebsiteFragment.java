package com.bvs.CollegeApp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Gopal on 09/02/2017.
 **/
public class WebsiteFragment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.website_tab);
        Button button = (Button) findViewById(R.id.btn_website);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.patriciancollege.org"));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();  // used to operate default back button
    }
}
