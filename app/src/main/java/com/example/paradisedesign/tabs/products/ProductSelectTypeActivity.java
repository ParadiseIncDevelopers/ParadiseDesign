package com.example.paradisedesign.tabs.products;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.paradisedesign.R;

public class ProductSelectTypeActivity extends AppCompatActivity {

    private Button product_select_type_ticari_button, product_select_type_fabrika_button,
            product_select_type_hizmet_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_select_type);

        product_select_type_ticari_button = findViewById(R.id.product_select_type_ticari_button);
        product_select_type_fabrika_button = findViewById(R.id.product_select_type_fabrika_button);
        product_select_type_hizmet_button = findViewById(R.id.product_select_type_hizmet_button);

        product_select_type_ticari_button.setOnClickListener((view -> {

        }));

        product_select_type_fabrika_button.setOnClickListener((view -> {

        }));

        product_select_type_hizmet_button.setOnClickListener(view -> {

        });


    }
}