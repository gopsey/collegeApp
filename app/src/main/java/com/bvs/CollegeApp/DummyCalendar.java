package com.bvs.CollegeApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by JARVIS on 14-Mar-17.
 */

public class DummyCalendar extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dummycalendar, container, false);

        Button newPage = (Button)v.findViewById(R.id.click);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListViewActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }
}
