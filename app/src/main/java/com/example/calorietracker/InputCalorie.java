package com.example.calorietracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InputCalorie extends AppCompatActivity{

        Button back;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.input_calorie);

             back = findViewById(R.id.finish);
             back.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     goBack();
                 }
             });
        }

        private void goBack() {
            Intent intent = new Intent(this, Daily.class);
            startActivity(intent);
        }
}
