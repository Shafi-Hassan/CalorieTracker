package com.example.calorietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends MainActivity {

    Button edit;
    protected static DailyIntakeStats dailyIntake = MainActivity.dailyIntake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.prof) + "</font>"));

        String name = dailyIntake.getName();
        int age = dailyIntake.getAge();
        int feet = dailyIntake.getFeet();
        int inch = dailyIntake.getInch();
        int weight = dailyIntake.getWeight();

        TextView dis_name = (TextView) findViewById(R.id.dis_name);
        TextView dis_age = (TextView) findViewById(R.id.dis_age);
        TextView dis_ft = (TextView) findViewById(R.id.feet);
        TextView dis_in = (TextView) findViewById(R.id.inches);
        TextView dis_weight = (TextView) findViewById(R.id.weight);

        dis_name.setText(name);
        dis_age.setText(age);
        dis_ft.setText(feet);
        dis_in.setText(inch);
        dis_weight.setText(weight);

        edit = findViewById(R.id.edit);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEditActivity();
            }
        });
    }

    public void openEditActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}