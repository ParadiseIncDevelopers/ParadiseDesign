package com.example.paradisedesign.tabs.menkul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;

public class MenkulDetailsActivity extends AppCompatActivity {

    private TextView menkul_details_name_of_company, menkul_details_tax_number,
            menkul_details_mersis_no;

    private Button menkul_details_export_button, menkul_details_import_button;

    private RecyclerView menkul_details_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menkul_details);

        menkul_details_name_of_company = findViewById(R.id.menkul_details_name_of_company);
        menkul_details_tax_number = findViewById(R.id.menkul_details_tax_number);
        menkul_details_mersis_no = findViewById(R.id.menkul_details_mersis_no);

        menkul_details_export_button = findViewById(R.id.menkul_details_export_button);
        menkul_details_import_button = findViewById(R.id.menkul_details_import_button);

        menkul_details_recycler = findViewById(R.id.menkul_details_recycler);

        menkul_details_export_button.setOnClickListener(view -> {});

        menkul_details_import_button.setOnClickListener(view -> {});
    }
}