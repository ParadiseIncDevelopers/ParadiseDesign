package com.example.paradisedesign;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.paradisedesign.tabs.TabsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_company_profile_change_password);

        //Intent intent = new Intent(this, StarterRepresentativeActivity.class);
        //startActivity(intent);


    }
}