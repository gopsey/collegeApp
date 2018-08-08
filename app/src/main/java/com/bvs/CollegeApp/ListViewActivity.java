package com.bvs.CollegeApp;

import java.util.ArrayList;
import com.bvs.CollegeApp.R;
import com.bvs.CollegeApp.adapter.AndroidListAdapter;
import com.bvs.CollegeApp.util.CalendarCollection;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by JARVIS on 28-Feb-17.
 **/

public class ListViewActivity extends Activity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        CalendarCollection.date_collection_arr=new ArrayList<CalendarCollection>();


        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-06-24","Opening for I years"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-07-21","Investiture ceremony"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-07-22","PTA"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-07-28","Fresher's Day"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-07-26","Ramzan"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-08-05","Sports day"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-08-14","Krishna Jayanti"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-08-15","Independence dsy"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-08-25","Vinayagar Chadurti"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-09-02","Bakrid"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-09-05","Teachers day"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-09-29","Ayudha poojai"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-09-30","Vijaya Dasami"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-10-01","Muharam"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-10-02","Gandhi Jayanti"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-10-18","Diwali"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-11-14","Children's day"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-12-02","Milad-un-Nabi"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-12-25","Christmas"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2018-01-01","English New Year"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2018-01-14","Pongal"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2018-01-26","Republic Day"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2018-03-30","Good Friday"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2018-04-14","Tamil New Year"));

        getWidget();
    }



    public void getWidget(){
        Button btn_calender = (Button) findViewById(R.id.btn_calender);
        btn_calender.setOnClickListener(this);

        ListView lv_android = (ListView) findViewById(R.id.lv_android);
        AndroidListAdapter list_adapter = new AndroidListAdapter(ListViewActivity.this, R.layout.list_item, CalendarCollection.date_collection_arr);
        lv_android.setAdapter(list_adapter);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.btn_calender:
                startActivity(new Intent(ListViewActivity.this, CalendarActivity.class));
                break;

            default:
                break;
        }

    }

}

