package com.example.paradisedesign.tabs.export;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;

public class ExportDetailsActivity extends AppCompatActivity {

    private TextView export_details_name_of_company, export_details_tax_number, export_details_mersis_no;
    private Button export_details_export_button, export_details_import_button;

    private RecyclerView export_details_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_export_details);

        export_details_name_of_company = findViewById(R.id.export_details_import_button);
        export_details_tax_number = findViewById(R.id.export_details_tax_number);
        export_details_mersis_no = findViewById(R.id.export_details_mersis_no);

        export_details_export_button = findViewById(R.id.export_details_export_button);
        export_details_import_button = findViewById(R.id.export_details_import_button);

        export_details_recycler = findViewById(R.id.export_details_recycler);

        export_details_export_button.setOnClickListener(view -> {});

        export_details_import_button.setOnClickListener(view -> {});

    }
}