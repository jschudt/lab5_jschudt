package com.cse60333.jschudt.lab1_jschudt;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.name;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String[]> schedule = new ArrayList<String[]>();

        schedule.add(new String[]{"floridastate", "Florida State", "Feb 11"});
        schedule.add(new String[]{"bostoncollege", "Boston College", "Feb 14"});
        schedule.add(new String[]{"northcarolinastate", "North Carolina State", "Feb 18"});
        schedule.add(new String[]{"georgiatech", "Georgia Tech", "Feb 26"});
        schedule.add(new String[]{"bostoncollege", "Boston College", "March 1"});
        schedule.add(new String[]{"louisville", "Louisville", "March 4"});
        schedule.add(new String[]{"acctournament", "ACC Tournament", "March 7"});
        schedule.add(new String[]{"ncaatournament", "NCAA Tournament", "March 16"});

        ListView ScheduleListView = (ListView) findViewById(R.id.ScheduleListView);

        ScheduleAdapter scheduleAdapter = new ScheduleAdapter(getApplicationContext(),schedule);

        ScheduleListView.setAdapter(scheduleAdapter);
        };
    }


