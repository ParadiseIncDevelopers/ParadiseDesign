package com.example.paradisedesign.tabs.workers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;

public class WorkersDetailActivity extends AppCompatActivity {

    private TextView companyName, taxNumber, mersis;

    private Button add, find, delete, update;

    private TextView personName, positionOfWorker, age, salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers_detail);


        // Heading elements
        companyName = findViewById(R.id.workers_details_name_of_company);
        taxNumber = findViewById(R.id.workers_details_tax_number);
        mersis = findViewById(R.id.workers_details_mersis_no);


        add =  findViewById(R.id.workers_details_add_button);
        find = findViewById(R.id.workers_details_find_button);
        delete = findViewById(R.id.workers_details_delete_button);
        update = findViewById(R.id.workers_details_update_button);


        // Elements below the buttons. Placeholders for the every bill
        personName = findViewById(R.id.workers_details_name_of_person);
        positionOfWorker = findViewById(R.id.workers_details_position_of_worker);
        age = findViewById(R.id.workers_details_age);
        salary = findViewById(R.id.workers_details_salary);
    }
}