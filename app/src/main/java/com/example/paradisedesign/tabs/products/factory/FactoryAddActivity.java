package com.example.paradisedesign.tabs.products.factory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;
import com.example.paradisedesign.tabs.products.ProductsDetailAddActivity;
import com.google.android.material.textfield.TextInputLayout;

public class FactoryAddActivity extends AppCompatActivity {


    private TextView products_factory_add_fragment_title_tv;

    private TextInputLayout products_factory_add_fragment_name_of_product, products_factory_add_fragment_iskonto,
            products_factory_add_fragment_fiyat;

    private AutoCompleteTextView products_factory_add_fragment_kdv_auto;

    private Button products_factory_add_fragment_submit_button;

    private String selectedKdv = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_factory_add);

        products_factory_add_fragment_title_tv = findViewById(R.id.products_factory_add_fragment_title_tv);

        products_factory_add_fragment_name_of_product = findViewById(R.id.products_factory_add_fragment_name_of_product);
        products_factory_add_fragment_iskonto = findViewById(R.id.products_factory_add_fragment_iskonto);
        products_factory_add_fragment_fiyat = findViewById(R.id.products_factory_add_fragment_fiyat);

        products_factory_add_fragment_kdv_auto = findViewById(R.id.products_factory_add_fragment_kdv_auto);

        products_factory_add_fragment_submit_button = findViewById(R.id.products_factory_add_fragment_submit_button);

        createAdapterKDV();


        products_factory_add_fragment_name_of_product.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        products_factory_add_fragment_iskonto.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        products_factory_add_fragment_fiyat.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        products_factory_add_fragment_submit_button.setOnClickListener(view -> {});
    }

    private void createAdapterKDV() {

        String[] arrayKDV = {"1", "8", "18"};

        ArrayAdapter<String> kdvAdapter = new ArrayAdapter<>(FactoryAddActivity.this,
                R.layout.dropdown_layout_item,
                arrayKDV);

        products_factory_add_fragment_kdv_auto.setAdapter(kdvAdapter);

        products_factory_add_fragment_kdv_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selectedKdv = arrayKDV[position];
            }
        });
    }

    private boolean checkField(TextInputLayout inputLayout) {
        if (inputLayout.getEditText().getText().toString().matches("")) {
            return false;
        } else
            return true;
    }
}