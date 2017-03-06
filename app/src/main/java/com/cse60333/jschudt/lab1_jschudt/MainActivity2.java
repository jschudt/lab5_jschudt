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
import static android.R.attr.resource;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Team> teams = new ArrayList<Team>();
        MyCsvFileReader file = new MyCsvFileReader(getApplicationContext());
        ArrayList<String[]> rawteamlist = file.readCsvFile(R.raw.schedule);

        Team floridaState = new Team(rawteamlist.get(0));
        Team bostonCollege = new Team(rawteamlist.get(1));
        Team northCarolinaState = new Team(rawteamlist.get(2));
        Team georgiaTech = new Team(rawteamlist.get(3));
        Team bostonCollege2 = new Team(rawteamlist.get(4));
        Team louisVille = new Team(rawteamlist.get(5));
        Team accTournament = new Team(rawteamlist.get(6));
        Team ncaaTournament = new Team(rawteamlist.get(7));

        teams.add(floridaState);
        teams.add(bostonCollege);
        teams.add(northCarolinaState);
        teams.add(georgiaTech);
        teams.add(bostonCollege2);
        teams.add(louisVille);
        teams.add(accTournament);
        teams.add(ncaaTournament);


        ListView ScheduleListView = (ListView) findViewById(R.id.ScheduleListView);

        ScheduleAdapter scheduleAdapter = new ScheduleAdapter(getApplicationContext(), teams);

        ScheduleListView.setAdapter(scheduleAdapter);


/**
        final Team floridaState = new Team("Florida State", "floridastate", "(21-7)", "Seminoles", "0",
                "Saturday, February 11, 6:00 PM");
        final Team bostonCollege = new Team("Boston College", "bostoncollege", "(9-18)", "Eagles", "0",
                "Tuesday, February 14, 7:00 PM");
        final Team northCarolinaState = new Team("North Carolina State", "northcarolinastate", "(21-7)", "Wolfpack", "0",
                "Saturday, February 18, 12:00 PM");
        final Team georgiaTech = new Team("Georgia Tech", "georgiatech", "(15-11)", "Yellow Jackets", "0",
                "Sunday, February 26, 6:30 PM");
        final Team louisVille = new Team("Louisville", "louisville", "(22-5)", "Cardinals", "0",
                "Saturday, March 4, 2:00 PM");
        final Team bostonCollege2 = new Team("Boston College", "bostoncollege", "(9-18)", "Eagles", "0",
                "Wednesday, March 1, 8:00 PM");
        final Team accTournament = new Team("ACC Tourney", "acctournament", " ", " ", "0",
                "March 7, TBD");
        final Team ncaaTournament = new Team("NCAA Tourney", "ncaatournament", " ", " ", "0",
                "March 16, TBD");
**/


        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                // Old String Arrays
                /**
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
                **/

                Intent intent = new Intent(MainActivity2.this, DetailActivity.class);
                intent.putExtra("team", teams.get(position));
                startActivity(intent);
            }
        };
        ScheduleListView.setOnItemClickListener (clickListener);
    }

    ;
}


