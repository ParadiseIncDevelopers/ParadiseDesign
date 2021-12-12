package com.example.paradisedesign.tabs.workers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputLayout;

public class WorkersProfileActivity extends AppCompatActivity {

    TextInputLayout workers_profile_name, workers_profile_tc_no, workers_profile_address,
            workers_profile_position, workers_profile_salary;

    AutoCompleteTextView workers_profile_city_auto, workers_profile_ilce_auto,
            workers_profile_sgk_auto;

    TextView workers_profile_summation_data_tv;

    Button workers_profile_submit_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers_profile);


        workers_profile_name = findViewById(R.id.workers_profile_name);
        workers_profile_tc_no = findViewById(R.id.workers_profile_tc_no);
        workers_profile_address = findViewById(R.id.workers_profile_address);
        workers_profile_position = findViewById(R.id.workers_profile_position);
        workers_profile_salary = findViewById(R.id.workers_profile_salary);

        workers_profile_city_auto = findViewById(R.id.workers_profile_city_auto);
        workers_profile_ilce_auto = findViewById(R.id.workers_profile_ilce_auto);
        workers_profile_sgk_auto = findViewById(R.id.workers_profile_sgk_auto);

        workers_profile_summation_data_tv = findViewById(R.id.workers_profile_summation_data_tv);

        workers_profile_submit_button = findViewById(R.id.workers_profile_submit_button);

        workers_profile_submit_button.setOnClickListener(view -> {
            workers_profile_summation_data_tv.setText("Salary is: ");
        });

    }
}