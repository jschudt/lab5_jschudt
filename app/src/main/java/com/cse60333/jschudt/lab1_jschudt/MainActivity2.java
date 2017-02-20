package com.cse60333.jschudt.lab1_jschudt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;

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

        ScheduleAdapter scheduleAdapter = new ScheduleAdapter(getApplicationContext(), schedule);

        ScheduleListView.setAdapter(scheduleAdapter);



        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayList<String[]> gameDetail = new ArrayList<String[]>();

                gameDetail.add(new String[]{"notredame", "floridastate", "84", "72", "Notre Dame", "Florida State", "Fighting Irish",
                        "Seminoles", "(21-7)", "(21-5)", "Saturday, February 11, 6:00 PM"});
                gameDetail.add(new String[]{"bostoncollege", "notredame", "76", "84", "Boston College", "Notre Dame", "Eagles",
                        "Fighting Irish", "(9-18)", "(21-5)", "Tuesday, February 14, 7:00 PM"});
                gameDetail.add(new String[]{"northcarolinastate", "notredame", "72", "81", "North Carolina State", "Notre Dame",
                        "Wolfpack", "Fighting Irish", "(21-7)", "(21-7)", "Saturday, February 18, 12:00 PM"});
                gameDetail.add(new String[]{"notredame", "georgiatech", "0", "0", "Notre Dame", "Georgia Tech", "Fighting Irish"
                        , "Yellow Jackets", "(21-7)", "(15-11)", "Sunday, February 26, 6:30 PM"});
                gameDetail.add(new String[]{"notredame", "bostoncollege", "0", "0", "Notre Dame", "Boston College", "Fighting Irish",
                        "Eagles", "(21-7)", "(9-18)", "Wednesday, March 1, 8:00 PM"});
                gameDetail.add(new String[]{"louisville", "notredame", "0", "0", "Louisville", "Notre Dame", "Cardinals",
                        "Fighting Irish", "(22-5)", "(21-7)", "Saturday, March 4, 2:00 PM"});
                gameDetail.add(new String[]{"notredame", "acctournament", "0", "0", "Notre Dame", "ACC Tournament", "Fighting Irish",
                        "TBD", "(21-7)", "(0-0)", "March 7, TBD"});
                gameDetail.add(new String[]{"notredame", "ncaatournament", "0", "0", "Notre Dame", "NCAA Tournament", "Fighting Irish",
                        "TBD", "(21-7)", "(0-0)", "March 16, TBD"});

                Intent intent = new Intent(MainActivity2.this, DetailActivity.class);
                intent.putExtra("gameDetail", gameDetail.get(position));
                startActivity(intent);
            }
        };
        ScheduleListView.setOnItemClickListener (clickListener);
    }

    ;
}


