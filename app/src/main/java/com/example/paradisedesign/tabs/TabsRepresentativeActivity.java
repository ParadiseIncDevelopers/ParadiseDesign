package com.example.paradisedesign.tabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.paradisedesign.R;

public class TabsRepresentativeActivity extends AppCompatActivity {

    private Button tabs_representative_bank, tabs_representative_warehouse, tabs_representative_esmm,
            tabs_representative_fatura, tabs_representative_ithalat, tabs_representative_menkul,
            tabs_representative_mizan, tabs_representative_products, tabs_representative_workers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs_representative);

        tabs_representative_bank = findViewById(R.id.tabs_representative_bank);
        tabs_representative_warehouse = findViewById(R.id.tabs_representative_warehouse);
        tabs_representative_esmm = findViewById(R.id.tabs_representative_esmm);
        tabs_representative_fatura = findViewById(R.id.tabs_representative_fatura);
        tabs_representative_ithalat = findViewById(R.id.tabs_representative_ithalat);
        tabs_representative_menkul = findViewById(R.id.tabs_representative_menkul);
        tabs_representative_mizan = findViewById(R.id.tabs_representative_mizan);
        tabs_representative_products = findViewById(R.id.tabs_representative_products);
        tabs_representative_workers = findViewById(R.id.tabs_representative_workers);

        tabs_representative_bank.setOnClickListener(view -> {});
        tabs_representative_warehouse.setOnClickListener(view -> {});
        tabs_representative_esmm.setOnClickListener(view -> {});
        tabs_representative_fatura.setOnClickListener(view -> {});
        tabs_representative_ithalat.setOnClickListener(view -> {});
        tabs_representative_menkul.setOnClickListener(view -> {});
        tabs_representative_mizan.setOnClickListener(view -> {});
        tabs_representative_products.setOnClickListener(view -> {});
        tabs_representative_workers.setOnClickListener(view -> {});
    }
}