package com.example.paradisedesign.tabs.products.service;

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
import com.google.android.material.textfield.TextInputLayout;

import java.util.function.Supplier;

public class ServiceAddActivity extends AppCompatActivity {

    private TextView products_service_add_fragment_title_tv;

    private TextInputLayout products_service_add_fragment_name_of_product, products_service_add_fragment_number_of_product,
            products_service_add_fragment_iskonto, products_service_add_fragment_fiyat;

    private AutoCompleteTextView products_service_add_fragment_kdv_auto, products_service_add_fragment_section_auto;

    private Button products_service_add_fragment_submit_button;

    private String selectedKdv = "";
    private String selectedSection = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_service_add);

        products_service_add_fragment_title_tv = findViewById(R.id.products_factory_add_fragment_title_tv);

        products_service_add_fragment_name_of_product = findViewById(R.id.products_factory_add_fragment_name_of_product);
        products_service_add_fragment_number_of_product = findViewById(R.id.products_service_add_fragment_number_of_product);
        products_service_add_fragment_iskonto = findViewById(R.id.products_factory_add_fragment_iskonto);
        products_service_add_fragment_fiyat = findViewById(R.id.products_factory_add_fragment_fiyat);

        products_service_add_fragment_kdv_auto = findViewById(R.id.products_factory_add_fragment_kdv_auto);
        products_service_add_fragment_section_auto = findViewById(R.id.products_service_add_fragment_section);

        products_service_add_fragment_submit_button = findViewById(R.id.products_factory_add_fragment_submit_button);

        createAdapterKDV();


        products_service_add_fragment_name_of_product.getEditText().addTextChangedListener(new TextWatcher() {
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

        products_service_add_fragment_number_of_product.getEditText().addTextChangedListener(new TextWatcher() {
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

        products_service_add_fragment_iskonto.getEditText().addTextChangedListener(new TextWatcher() {
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

        products_service_add_fragment_fiyat.getEditText().addTextChangedListener(new TextWatcher() {
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

        products_service_add_fragment_submit_button.setOnClickListener(view -> {

            Supplier<Boolean> isAllFieldsFilled = () -> {
                if (isInputFilled(products_service_add_fragment_name_of_product) &&
                isInputFilled(products_service_add_fragment_number_of_product) &&
                isInputFilled(products_service_add_fragment_iskonto) &&
                isInputFilled(products_service_add_fragment_fiyat)) {
                    return true;
                } else {
                    return false;
                }
            };

        });
    }

    private void createAdapterKDV() {

        String[] arrayKDV = {"1", "8", "18"};

        ArrayAdapter<String> kdvAdapter = new ArrayAdapter<>(ServiceAddActivity.this,
                R.layout.dropdown_layout_item,
                arrayKDV);

        products_service_add_fragment_kdv_auto.setAdapter(kdvAdapter);

        products_service_add_fragment_kdv_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selectedKdv = arrayKDV[position];
            }
        });


        String[] arraySection = {"Section 1", "Section 2", "Section 3"};

        ArrayAdapter<String> sectionAdapter = new ArrayAdapter<>(ServiceAddActivity.this,
                R.layout.dropdown_layout_item,
                arraySection);

        products_service_add_fragment_section_auto.setAdapter(sectionAdapter);

        products_service_add_fragment_section_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selectedSection = arraySection[position];
            }
        });


    }

    private boolean isInputFilled(TextInputLayout inputLayout) {
        if (inputLayout.getEditText().getText().toString().matches("")) {
            return false;
        } else
            return true;
    }
}
