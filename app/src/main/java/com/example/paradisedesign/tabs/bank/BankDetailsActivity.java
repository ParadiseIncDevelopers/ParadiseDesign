package com.example.paradisedesign.tabs.bank;

import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.paradisedesign.R;

import java.util.ArrayList;
import java.util.List;

public class BankDetailsActivity extends AppCompatActivity {



    private AutoCompleteTextView autoCash, autoChequesReceived, autoChequesGiven, autoLiquidAssets;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);


        List<String> cashStrings = new ArrayList<>();
        cashStrings.add("Add cash");
        cashStrings.add("Delete cash");
        cashStrings.add("Find cash");

        List<String> chequesReceivedStrings = new ArrayList<>();
        chequesReceivedStrings.add("Add cheques");
        chequesReceivedStrings.add("Find cheques");
        chequesReceivedStrings.add("Update cheques");

        List<String> chequesGivenStrings = new ArrayList<>();
        chequesGivenStrings.add("Add order");
        chequesGivenStrings.add("Find order");

        List<String> liquidAssetsStrings = new ArrayList<>();
        liquidAssetsStrings.add("Add assets");
        liquidAssetsStrings.add("Delete assets");
        liquidAssetsStrings.add("Find assets");
        liquidAssetsStrings.add("Update assets");

        autoCash = findViewById(R.id.bank_details_text_input_layout_cash_auto);
        autoChequesReceived = findViewById(R.id.bank_details_text_input_layout_cheques_received_auto);
        autoChequesGiven = findViewById(R.id.bank_details_text_input_layout_cheques_given_auto);
        autoLiquidAssets = findViewById(R.id.bank_details_text_input_layout_liquid_assets_auto);



        ArrayAdapter<String> cashAdapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.dropdown_layout_item, cashStrings);

        ArrayAdapter<String> chequesReceivedAdapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.dropdown_layout_item, chequesReceivedStrings);

        ArrayAdapter<String> chequesGivenAdapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.dropdown_layout_item, chequesGivenStrings);

        ArrayAdapter<String> liquidAssetsAdapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.dropdown_layout_item, liquidAssetsStrings);

        autoCash.setAdapter(cashAdapter);
        autoChequesReceived.setAdapter(chequesReceivedAdapter);
        autoChequesGiven.setAdapter(chequesGivenAdapter);
        autoLiquidAssets.setAdapter(liquidAssetsAdapter);



    }



}