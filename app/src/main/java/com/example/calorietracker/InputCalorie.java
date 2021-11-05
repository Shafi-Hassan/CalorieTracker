package com.example.calorietracker;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InputCalorie extends MainActivity{
       /* public static final String EXTRA_NUMBER1 = "com.example.application.CalorieTracker.EXTRA_NUMBER1";
        public static final String EXTRA_NUMBER2 = "com.example.application.CalorieTracker.EXTRA_NUMBER2";
        public static final String EXTRA_NUMBER3 = "com.example.application.CalorieTracker.EXTRA_NUMBER3";
        public static final String EXTRA_NUMBER4 = "com.example.application.CalorieTracker.EXTRA_NUMBER4";*/

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
            String calString = editText1.getText().toString();
            if(!calString.equals(""))
                dailyIntake.addCalories(Integer.parseInt(calString));

            EditText editText2 = (EditText) findViewById(R.id.enter_carbs);
            String carbString = editText2.getText().toString();
            if(!carbString.equals(""))
                dailyIntake.addCarbs(Integer.parseInt(carbString));

            EditText editText3 = (EditText) findViewById(R.id.enter_proteins);
            String protString = editText3.getText().toString();
            if(!protString.equals(""))
                dailyIntake.addProteins(Integer.parseInt(protString));

            EditText editText4 = (EditText) findViewById(R.id.enter_fats);
            String fatString = editText4.getText().toString();
            if(!fatString.equals(""))
                dailyIntake.addFats(Integer.parseInt(fatString));

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
}
