package com.example.paradisedesign.tabs.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paradisedesign.R;

public class BankDetailsCashFindActivity extends AppCompatActivity {

    private ImageView bank_details_cash_find_image;

    private TextView bank_details_cash_find_company_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details_cash_find);

        bank_details_cash_find_image = findViewById(R.id.bank_details_cash_find_image);
        bank_details_cash_find_company_name = findViewById(R.id.bank_details_cash_find_company_name);


    }
}