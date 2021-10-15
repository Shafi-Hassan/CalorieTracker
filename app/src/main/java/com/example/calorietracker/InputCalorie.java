package com.example.calorietracker;

import android.os.Bundle;
import android.text.Html;

import androidx.appcompat.app.AppCompatActivity;

public class InputCalorie extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.input_calorie);

            getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.CAM) + "</font>"));

        }
}
