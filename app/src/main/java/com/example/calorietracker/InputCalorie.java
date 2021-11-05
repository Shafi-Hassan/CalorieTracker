package com.example.calorietracker;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InputCalorie extends AppCompatActivity{
        public static final String EXTRA_NUMBER1 = "com.example.application.CalorieTracker.EXTRA_NUMBER1";
        public static final String EXTRA_NUMBER2 = "com.example.application.CalorieTracker.EXTRA_NUMBER2";
        public static final String EXTRA_NUMBER3 = "com.example.application.CalorieTracker.EXTRA_NUMBER3";
        public static final String EXTRA_NUMBER4 = "com.example.application.CalorieTracker.EXTRA_NUMBER4";

        Button back;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.input_calorie);

            getSupportActionBar().setTitle(Html.fromHtml("<font color = \"#30cfd0\">" + getString(R.string.CAM) + "</font>"));

             back = findViewById(R.id.finish);
             back.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     goBack();
                 }
             });
        }

        private void goBack() {
            EditText editText1 = (EditText) findViewById(R.id.enter_calories);
            int calories = Integer.parseInt(editText1.getText().toString());

            EditText editText2 = (EditText) findViewById(R.id.enter_carbs);
            int carbs = Integer.parseInt(editText2.getText().toString());

            EditText editText3 = (EditText) findViewById(R.id.enter_proteins);
            int proteins = Integer.parseInt(editText3.getText().toString());

            EditText editText4 = (EditText) findViewById(R.id.enter_fats);
            int fats = Integer.parseInt(editText4.getText().toString());

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(EXTRA_NUMBER1, calories);
            intent.putExtra(EXTRA_NUMBER2, carbs);
            intent.putExtra(EXTRA_NUMBER3, proteins);
            intent.putExtra(EXTRA_NUMBER4, fats);
            startActivity(intent);
        }
}
