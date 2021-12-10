package com.example.paradisedesign;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.paradisedesign.tabs.TabsActivity;
import com.example.paradisedesign.tabs.bank.BankDetailsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers_detail);

        Intent intent = new Intent(this, BankDetailsActivity.class);
        startActivity(intent);


    }
}