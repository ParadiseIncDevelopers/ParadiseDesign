package com.example.paradisedesign.tabs.fatura.cash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.paradisedesign.R;

public class FaturaCashRepresentativeActivity extends AppCompatActivity {

    private Button fatura_cash_representative_cash, fatura_cash_representative_banks,
            fatura_cash_representative_buyers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatura_cash_representative);

        fatura_cash_representative_cash = findViewById(R.id.fatura_cash_representative_cash);
        fatura_cash_representative_banks = findViewById(R.id.fatura_cash_representative_banks);
        fatura_cash_representative_buyers = findViewById(R.id.fatura_cash_representative_buyers);

        fatura_cash_representative_cash.setOnClickListener((view) -> {});

        fatura_cash_representative_banks.setOnClickListener((view) -> {});

        fatura_cash_representative_buyers.setOnClickListener((view) -> {});

    }
}