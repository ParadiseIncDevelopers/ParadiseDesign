package com.example.paradisedesign.tabs.depo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;

public class DepoDetailsActivity extends AppCompatActivity {

    private TextView companyName, taxNumber, mersis;

    private Button find, update;

    private TextView productName, numberOfProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depo_details);

        // Heading elements
        companyName = findViewById(R.id.depo_details_name_of_company);
        taxNumber = findViewById(R.id.depo_details_tax_number);
        mersis = findViewById(R.id.depo_details_mersis_no);


        find = findViewById(R.id.depo_details_find_button);
        update = findViewById(R.id.depo_details_update_button);


        // Elements below the buttons. Placeholders for the every bill
        productName = findViewById(R.id.depo_details_name_of_product);
        numberOfProducts = findViewById(R.id.depo_details_number_of_products);

    }
}