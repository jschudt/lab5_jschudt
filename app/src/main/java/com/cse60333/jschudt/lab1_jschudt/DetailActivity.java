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

import java.util.ArrayList;

import static com.cse60333.jschudt.lab1_jschudt.R.layout.activity_detail;

/**
 * Created by JoeS on 2/16/2017.
 */

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(activity_detail);

        String[] stringInfo = getIntent().getStringArrayExtra("gameDetail");

        ImageView HomeTeamLogo = (ImageView) findViewById(R.id.HomeTeamLogo);
        String mDrawableName = stringInfo[0];
        int resID = getResources().getIdentifier(mDrawableName, "mipmap", getPackageName());
        HomeTeamLogo.setImageResource(resID);

        ImageView AwayTeamLogo = (ImageView) findViewById(R.id.AwayTeamLogo);
        String mDrawableName1 = stringInfo[1];
        int resID1 = getResources().getIdentifier(mDrawableName1, "mipmap", getPackageName());
        AwayTeamLogo.setImageResource(resID1);

        TextView HomeScore = (TextView) findViewById(R.id.HomeScore);
        HomeScore.setText(stringInfo[2]);

        TextView AwayScore = (TextView) findViewById(R.id.AwayScore);
        AwayScore.setText(stringInfo[3]);

        TextView HomeTeamName = (TextView) findViewById(R.id.HomeTeamName);
        HomeTeamName.setText(stringInfo[4]);

        TextView AwayTeamName = (TextView) findViewById(R.id.AwayTeamName);
        AwayTeamName.setText(stringInfo[5]);

        TextView HomeTeamMascot = (TextView) findViewById(R.id.HomeTeamMascot);
        HomeTeamMascot.setText(stringInfo[6]);

        TextView AwayTeamMascot = (TextView) findViewById(R.id.AwayTeamMascot);
        AwayTeamMascot.setText(stringInfo[7]);

        TextView HomeRecord = (TextView) findViewById(R.id.HomeRecord);
        HomeRecord.setText(stringInfo[8]);

        TextView AwayRecord = (TextView) findViewById(R.id.AwayRecord);
        AwayRecord.setText(stringInfo[9]);

        TextView TipOff = (TextView) findViewById(R.id.TipOff);
        TipOff.setText(stringInfo[10]);
    }
        public void startCamera(View view) {
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(cameraIntent);
        }




}

