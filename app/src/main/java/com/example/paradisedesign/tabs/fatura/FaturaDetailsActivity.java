package com.example.paradisedesign.tabs.fatura;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.paradisedesign.R;


public class FaturaDetailsActivity extends AppCompatActivity {

    private Button fatura_detail_efatura_button, fatura_detail_manual_button,
            fatura_detail_eirsaliye_button, fatura_detail_irsaliye_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatura_details);

        fatura_detail_efatura_button = findViewById(R.id.fatura_detail_efatura_button);
        fatura_detail_manual_button = findViewById(R.id.fatura_detail_manual_button);
        fatura_detail_eirsaliye_button = findViewById(R.id.fatura_detail_eirsaliye_button);
        fatura_detail_irsaliye_button = findViewById(R.id.fatura_detail_irsaliye_button);

        fatura_detail_efatura_button.setOnClickListener(view1 -> {
            Toast.makeText(FaturaDetailsActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
        });

        fatura_detail_manual_button.setOnClickListener(view1 -> {

        });

        fatura_detail_eirsaliye_button.setOnClickListener(view1 -> {
            Toast.makeText(FaturaDetailsActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
        });

        fatura_detail_irsaliye_button.setOnClickListener(view1 -> {

        });

    }

}