package com.bvs.CollegeApp.gpa;

/**
 * Created by JARVIS on 23-Feb-17.
 **/

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.DialogInterface;

import com.bvs.CollegeApp.R;

public class GpaFragment extends Activity implements OnClickListener {
    private String[] creditHourItem = {"1","2","3","4","5","6"};
    private String[] gradeItem = {"100", "99", "98", "97", "96", "95", "94", "93", "92", "91", "90", "89", "88", "87", "86", "85", "84", "83", "82", "81", "80", "79", "78", "77", "76", "75", "74", "73", "72", "71", "70", "69", "68", "67", "66", "65", "64", "63", "62", "61", "60", "59", "58", "57", "56", "55", "54", "53", "52", "51", "50", "49", "48", "47", "46", "45", "44", "43", "42", "41", "40", "39", "38", "37", "36", "35", "34", "33", "32", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};

    private Button[] subj = new Button[7];
    private Button[] grade = new Button[7];
    private Button calculate;

    private int z = 0;
    private View temp;

    private TextView result;

    Subject[] sub = new Subject[7];

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gpa_tab);

        subj[0] = (Button)findViewById(R.id.subject1);
        subj[1] = (Button)findViewById(R.id.subject2);
        subj[2] = (Button)findViewById(R.id.subject3);
        subj[3] = (Button)findViewById(R.id.subject4);
        subj[4] = (Button)findViewById(R.id.subject5);
        subj[5] = (Button)findViewById(R.id.subject6);
        subj[6] = (Button)findViewById(R.id.subject7);

        grade[0] = (Button)findViewById(R.id.grade1);
        grade[1] = (Button)findViewById(R.id.grade2);
        grade[2] = (Button)findViewById(R.id.grade3);
        grade[3] = (Button)findViewById(R.id.grade4);
        grade[4] = (Button)findViewById(R.id.grade5);
        grade[5] = (Button)findViewById(R.id.grade6);
        grade[6] = (Button)findViewById(R.id.grade7);

        calculate = (Button)findViewById(R.id.ok);
        calculate.setOnClickListener(this);

        result = (TextView)findViewById(R.id.result);

        int i = 0;
        while (i<7)
        {

            sub[i] = new Subject();

            subj[i].setOnClickListener(this);
            grade[i].setOnClickListener(this);
            i++;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);

        MenuItem item = menu.add("About");
        MenuItem help = menu.add("Help");

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getTitle() == "About")
        {
            AlertDialog.Builder about = new AlertDialog.Builder(this);
            about.setTitle("About");
            about.setMessage("GPA Calculator v1.0. Developed by Lowt.");
            about.create().show();
            about.setCancelable(true);

        }
        else if(item.getTitle() == "Help")
        {
            AlertDialog.Builder help = new AlertDialog.Builder(this);
            help.setTitle("Help");
            help.setMessage("This application supports calculation of upto 7 subjects. If you want to calculate less than 7 subjects, just ignore the other buttons.");
            help.create().show();
            help.setCancelable(true);
        }
        return true;
    }

    public void onClick(View v)
    {
        for(int s = 0; s < 7; s++)
        {
            if(v == subj[s])
            {
                temp = v;

                AlertDialog.Builder chList = new AlertDialog.Builder(this);
                chList.setTitle("Set credit hour");

                chList.setItems(creditHourItem, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int item)
                    {
                        Toast.makeText(getApplicationContext(), creditHourItem[item], Toast.LENGTH_SHORT).show();
                        z = item;
                        for(int j = 0; j < subj.length; j++ )
                        {
                            if(temp == subj[j])
                            {
                                subj[j].setText("CREDIT : " + creditHourItem[z]);
                                double ch = 0;
                                if(creditHourItem[z] == "1")
                                    ch = 1;
                                else if(creditHourItem[z] == "2")
                                    ch = 2;
                                else if(creditHourItem[z] == "3")
                                    ch = 3;
                                else if(creditHourItem[z] == "4")
                                    ch = 4;
                                else if(creditHourItem[z] == "5")
                                    ch = 5;
                                else if(creditHourItem[z] == "6")
                                    ch = 6;

                                sub[j].setCreditHour(ch);

                            }
                        }
                    }

                });

                chList.show();
            }

            else if(v == grade[s])
            {
                temp = v;

                AlertDialog.Builder gradeList = new AlertDialog.Builder(this);
                gradeList.setTitle("Set Marks");

                gradeList.setItems(gradeItem, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int item)
                    {
                        Toast.makeText(getApplicationContext(), gradeItem[item], Toast.LENGTH_SHORT).show();
                        z = item;
                        for(int j = 0; j < grade.length; j++ )
                        {
                            if(temp == grade[j])
                            {
                                grade[j].setText("MARKS : " + gradeItem[z] + " ");

                                sub[j].setGrade(gradeItem[item]);
                            }
                        }
                    }

                });
                gradeList.show();
            }
        }

        if(v == calculate)
        {
            Semester sem  = new Semester();
            for(int i = 0; i < 7; i++)
            {
                sem.setCreditHour(sub[i].getCreditHour());
                sem.setGrade(sub[i].getGrade());
                sem.calcTotalCreditHour();
                sem.calcTotalGradePoint();
            }
            sem.calculateGpa();
            double res = sem.getGpa();
            String convertedResultValue = Double.toString(res);
            result.setText(convertedResultValue);
        }
    }

}
