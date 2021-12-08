package com.example.paradisedesign.tabs.products;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;

public class ProductsDetailActivity extends AppCompatActivity {

    private TextView companyName, taxNumber, mersis;

    private Button add, find, delete, update;

    private TextView productName, numberOfProducts, kdv, iskonto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_detail);

        companyName = (TextView) findViewById(R.id.product_details_name_of_company);
        taxNumber = (TextView) findViewById(R.id.product_details_tax_number);
        mersis = (TextView) findViewById(R.id.product_details_mersis);

        add = (Button) findViewById(R.id.products_details_add_button);
        find = (Button) findViewById(R.id.products_details_find_button);
        delete = (Button) findViewById(R.id.products_details_delete_button);
        update = (Button) findViewById(R.id.products_details_update_button);

        productName = (TextView) findViewById(R.id.product_details_name_of_product);
        numberOfProducts = (TextView) findViewById(R.id.product_details_number_of_products);
        kdv = (TextView) findViewById(R.id.product_details_kdv);
        iskonto = (TextView) findViewById(R.id.product_details_iskonto);

    }
}