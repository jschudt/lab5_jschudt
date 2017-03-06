package com.cse60333.jschudt.lab1_jschudt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.cse60333.jschudt.lab1_jschudt.Team;

import java.io.Serializable;
import java.util.ArrayList;

import static com.cse60333.jschudt.lab1_jschudt.R.layout.activity_detail;

/**
 * Created by JoeS on 2/16/2017.
 */

public class DetailActivity extends Activity {

    @Override
    public void onCreate (Bundle bundle) {
        super.onCreate(bundle);
        setContentView(activity_detail);

        Team awayteam = (Team) getIntent().getSerializableExtra("team");
        String[] ndstring = { "Notre Dame", "notredame", "(21-5)", "Fighting Irish", "0", "Error"};
        Team notreDame = new Team(ndstring);
        Team hometeam = notreDame;

        ImageView HomeTeamLogo = (ImageView) findViewById(R.id.HomeTeamLogo);
        String mDrawableName = hometeam.getTeamLogo();
        int resID = getResources().getIdentifier(mDrawableName, "mipmap", getPackageName());
        HomeTeamLogo.setImageResource(resID);

        ImageView AwayTeamLogo = (ImageView) findViewById(R.id.AwayTeamLogo);
        String mDrawableName1 = awayteam.getTeamLogo();
        int resID1 = getResources().getIdentifier(mDrawableName1, "mipmap", getPackageName());
        AwayTeamLogo.setImageResource(resID1);

        TextView HomeScore = (TextView) findViewById(R.id.HomeScore);
        HomeScore.setText(hometeam.getTeamScore());

        TextView AwayScore = (TextView) findViewById(R.id.AwayScore);
        AwayScore.setText(awayteam.getTeamScore());

        TextView HomeTeamName = (TextView) findViewById(R.id.HomeTeamName);
        HomeTeamName.setText(hometeam.getTeamName());

        TextView AwayTeamName = (TextView) findViewById(R.id.AwayTeamName);
        AwayTeamName.setText(awayteam.getTeamName());

        TextView HomeTeamMascot = (TextView) findViewById(R.id.HomeTeamMascot);
        HomeTeamMascot.setText(hometeam.getTeamMascot());

        TextView AwayTeamMascot = (TextView) findViewById(R.id.AwayTeamMascot);
        AwayTeamMascot.setText(awayteam.getTeamMascot());

        TextView HomeRecord = (TextView) findViewById(R.id.HomeRecord);
        HomeRecord.setText(hometeam.getTeamRecord());

        TextView AwayRecord = (TextView) findViewById(R.id.AwayRecord);
        AwayRecord.setText(awayteam.getTeamRecord());

        TextView TipOff = (TextView) findViewById(R.id.TipOff);
        TipOff.setText(awayteam.getGameDate());
    }
        public void startCamera(View view) {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cameraIntent);
        }




}

