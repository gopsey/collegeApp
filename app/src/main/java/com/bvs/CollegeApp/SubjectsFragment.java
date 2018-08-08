package com.bvs.CollegeApp;

/*
  Created by Gopal on 09/02/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import com.bvs.CollegeApp.subjects.ba1;
import com.bvs.CollegeApp.subjects.ba2;
import com.bvs.CollegeApp.subjects.ba3;
import com.bvs.CollegeApp.subjects.bba1;
import com.bvs.CollegeApp.subjects.bba2;
import com.bvs.CollegeApp.subjects.bba3;
import com.bvs.CollegeApp.subjects.bca1;
import com.bvs.CollegeApp.subjects.bca2;
import com.bvs.CollegeApp.subjects.bca3;
import com.bvs.CollegeApp.subjects.bcom1;
import com.bvs.CollegeApp.subjects.bcom2;
import com.bvs.CollegeApp.subjects.bcom3;
import com.bvs.CollegeApp.subjects.bcomcs1;
import com.bvs.CollegeApp.subjects.bcomcs2;
import com.bvs.CollegeApp.subjects.bcomcs3;
import com.bvs.CollegeApp.subjects.bsc1;
import com.bvs.CollegeApp.subjects.bsc2;
import com.bvs.CollegeApp.subjects.bsc3;
import com.bvs.CollegeApp.subjects.bscmat1;
import com.bvs.CollegeApp.subjects.bscmat2;
import com.bvs.CollegeApp.subjects.bscmat3;
import com.bvs.CollegeApp.subjects.bscpsy1;
import com.bvs.CollegeApp.subjects.bscpsy2;
import com.bvs.CollegeApp.subjects.bscpsy3;
import com.bvs.CollegeApp.subjects.bsw1;
import com.bvs.CollegeApp.subjects.bsw2;
import com.bvs.CollegeApp.subjects.bsw3;
import com.bvs.CollegeApp.subjects.ma1;
import com.bvs.CollegeApp.subjects.ma2;
import com.bvs.CollegeApp.subjects.mcom1;
import com.bvs.CollegeApp.subjects.mcom2;
import com.bvs.CollegeApp.subjects.msw1;
import com.bvs.CollegeApp.subjects.msw2;
import com.bvs.CollegeApp.subjects.viscom1;
import com.bvs.CollegeApp.subjects.viscom2;
import com.bvs.CollegeApp.subjects.viscom3;


public class SubjectsFragment extends Activity {

    Spinner spinner;
    Spinner spinner2;
    String[] SPINNERVALUES = {"SELECT","B.C.A","B.SC COMP","B.COM GEN","B.COM CS","B.B.A","B.SC VISCOM","B.A ENG","B.SC MATHS","B.SC PSYCH","B.S.W","M.A ENG","M.S.W","M.COM"};
    String[] SPINNERVALUES2 = {"SELECT","I YEAR","II YEAR","III YEAR"};
    String SpinnerValue;
    String SpinnerValue2;
    Button GOTO;
    Intent intent;
    ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects_layout);

        spinner =(Spinner)findViewById(R.id.spinner);
        spinner2 =(Spinner)findViewById(R.id.spinner2);


        GOTO = (Button)findViewById(R.id.btn_syllabus);
        imgBack =(ImageView)findViewById(R.id.imgback);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SPINNERVALUES);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, SPINNERVALUES2);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);

        //Adding setOnItemSelectedListener method on spinner.
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

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
        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

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

                    intent = new Intent(SubjectsFragment.this, SubjectsFragment.class);
                    startActivity(intent); }

                if(SpinnerValue.equals("B.C.A") && SpinnerValue2.equals("I YEAR")){

                    intent = new Intent(SubjectsFragment.this, bca1.class);
                    startActivity(intent); }

                if((SpinnerValue.equals("B.C.A")) && (SpinnerValue2.equals("II YEAR"))){

                    intent = new Intent(SubjectsFragment.this, bca2.class);
                    startActivity(intent); }

                if((SpinnerValue.equals("B.C.A")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bca3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC COMP")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bsc1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC COMP")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bsc2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC COMP")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bsc3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.COM GEN")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bcom1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM GEN")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bcom2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM GEN")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bcom3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.COM CS")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bcomcs1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM CS")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bcomcs2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.COM CS")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bcomcs3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.B.A")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bba1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.B.A")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bba2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.B.A")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bba3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC VISCOM")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, viscom1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC VISCOM")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, viscom2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC VISCOM")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, viscom3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.A ENG")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, ba1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.A ENG")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, ba2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.A ENG")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, ba3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC MATHS")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bscmat1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC MATHS")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bscmat2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC MATHS")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bscmat3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.SC PSYCH")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bscpsy1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC PSYCH")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bscpsy2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.SC PSYCH")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bscpsy3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("B.S.W")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bsw1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.S.W")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bsw2.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("B.S.W")) && (SpinnerValue2.equals("III YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, bsw3.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("M.A ENG")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, ma1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("M.A ENG")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, ma2.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("M.S.W")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, msw1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("M.S.W")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, msw2.class);
                    startActivity(intent);
                }

                if((SpinnerValue.equals("M.COM")) && (SpinnerValue2.equals("I YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, mcom1.class);
                    startActivity(intent);
                }
                if((SpinnerValue.equals("M.COM")) && (SpinnerValue2.equals("II YEAR"))) {

                    intent = new Intent(SubjectsFragment.this, mcom2.class);
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

    }
}