package com.example.paradisedesign.tabs.workers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paradisedesign.R;

public class WorkersDetailActivity extends AppCompatActivity {

    private ImageView workers_detail_image_profile;

    private TextView workers_detail_fullname_field, workers_detail_tc_number_field, workers_detail_salary_field,
            workers_detail_mobile_phone_label, workers_detail_mobile_description, workers_detail_date_of_enter,
            workers_detail_date_of_enter_description, workers_detail_age_title, workers_detail_age_label_field,
            workers_detail_city_title, workers_detail_city_label_field, workers_detail_district_title,
            workers_detail_district_label_field, workers_detail_address_title,
            workers_detail_addres_label_field, worekrs_detail_mezuniyet_title, worekrs_detail_mezuniyet_label_field,
            workers_detail_mezuniyet_yili_title, workers_detail_mezuniyet_yili_label_field,
            workers_detail_sgk_title, workers_detail_sgk_label_field, workers_detail_ssk_title,
            workers_detail_ssk_label_field;

    private Button workers_detail_delete_data_button, workers_detail_update_data_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers_detail);


        // New elements
        workers_detail_image_profile = findViewById(R.id.workers_detail_image_profile);

        workers_detail_fullname_field = findViewById(R.id.workers_detail_fullname_field);
        workers_detail_tc_number_field = findViewById(R.id.workers_detail_tc_number_field);
        workers_detail_salary_field = findViewById(R.id.workers_detail_salary_field);
        workers_detail_mobile_phone_label = findViewById(R.id.workers_detail_mobile_phone_label);
        workers_detail_mobile_description = findViewById(R.id.workers_detail_mobile_description);
        workers_detail_date_of_enter = findViewById(R.id.workers_detail_date_of_enter);
        workers_detail_date_of_enter_description = findViewById(R.id.workers_detail_date_of_enter_description);
        workers_detail_age_title = findViewById(R.id.workers_detail_age_title);
        workers_detail_age_label_field = findViewById(R.id.workers_detail_age_label_field);
        workers_detail_city_title = findViewById(R.id.workers_detail_city_title);
        workers_detail_city_label_field = findViewById(R.id.workers_detail_city_label_field);
        workers_detail_district_title = findViewById(R.id.workers_detail_district_title);
        workers_detail_district_label_field = findViewById(R.id.workers_detail_district_label_field);
        workers_detail_address_title = findViewById(R.id.workers_detail_address_title);
        workers_detail_addres_label_field = findViewById(R.id.workers_detail_addres_label_field);
        worekrs_detail_mezuniyet_title = findViewById(R.id.worekrs_detail_mezuniyet_title);
        worekrs_detail_mezuniyet_label_field = findViewById(R.id.worekrs_detail_mezuniyet_label_field);
        workers_detail_mezuniyet_yili_title = findViewById(R.id.workers_detail_mezuniyet_yili_title);
        workers_detail_mezuniyet_yili_label_field = findViewById(R.id.workers_detail_mezuniyet_yili_label_field);
        workers_detail_sgk_title = findViewById(R.id.workers_detail_sgk_title);
        workers_detail_sgk_label_field = findViewById(R.id.workers_detail_sgk_label_field);
        workers_detail_ssk_title = findViewById(R.id.workers_detail_ssk_title);
        workers_detail_ssk_label_field = findViewById(R.id.workers_detail_ssk_label_field);


        workers_detail_delete_data_button = findViewById(R.id.workers_detail_delete_data_button);
        workers_detail_update_data_button = findViewById(R.id.workers_detail_update_data_button);

        workers_detail_delete_data_button.setOnClickListener(view -> {

        });

        workers_detail_update_data_button.setOnClickListener(view -> {

        });



    }
}