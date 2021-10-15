package com.example.calorietracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.text.Html;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Daily extends AppCompatActivity{

    Button breakfast;
    Button lunch;
    Button dinner;
    Button snack;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.daily);

            getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.MOTD) + "</font>"));

            breakfast = findViewById(R.id.breakfast);
            lunch = findViewById(R.id.lunch);
            dinner = findViewById(R.id.dinner);
            snack = findViewById(R.id.snack);

            breakfast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openCaloriesActivity();
                }
            });

            lunch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openCaloriesActivity();
                }
            });

            dinner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openCaloriesActivity();
                }
            });

            snack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openCaloriesActivity();
                }
            });


        }

        public void openCaloriesActivity() {
            Intent intent = new Intent(this, InputCalorie.class);
            startActivity(intent);
        }

}
