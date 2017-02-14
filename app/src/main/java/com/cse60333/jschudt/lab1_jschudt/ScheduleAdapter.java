package com.cse60333.jschudt.lab1_jschudt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.cse60333.jschudt.lab1_jschudt.R.layout.schedule_item;

/**
 * Created by JoeS on 2/11/2017.
 */

public class ScheduleAdapter extends ArrayAdapter<String[]> {
    ScheduleAdapter (Context context, ArrayList<String[]> schedule){
        super(context, schedule_item, schedule);
    };

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater scheduleInflater = LayoutInflater.from(getContext());
        View scheduleView = scheduleInflater.inflate(schedule_item, parent, false);

        String[] matchItem = getItem(position);

        ImageView TeamLogo = (ImageView) scheduleView.findViewById(R.id.TeamLogo);
        String mDrawableName = matchItem[0];
        int resID = getContext().getResources().getIdentifier(mDrawableName , "drawable", getContext().getPackageName());
        TeamLogo.setImageResource(resID);


        TextView TeamName = (TextView) scheduleView.findViewById(R.id.TeamName);
        TeamName.setText(matchItem[1]);

        TextView GameDate = (TextView) scheduleView.findViewById(R.id.GameDate);
        GameDate.setText(matchItem[2]);

        return scheduleView;
    }
}