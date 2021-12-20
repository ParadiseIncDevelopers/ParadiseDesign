package com.example.paradisedesign.tabs.fatura.irsaliye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class FaturaIrsaliyeActivity extends AppCompatActivity {

    private AutoCompleteTextView fatura_irsaliye_address_sehir_auto,
            fatura_irsaliye_address_ilce_auto;

    private TextInputLayout fatura_irsaliye_address_exact_address;

    private Button fatura_irsaliye_address_submit_button;

    String selectedCity = "";
    String selectedIlce = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatura_irsaliye);

        fatura_irsaliye_address_sehir_auto = findViewById(R.id.fatura_irsaliye_address_sehir_auto);
        fatura_irsaliye_address_ilce_auto = findViewById(R.id.fatura_irsaliye_address_ilce_auto);

        fatura_irsaliye_address_exact_address = findViewById(R.id.fatura_irsaliye_address_exact_address);

        fatura_irsaliye_address_submit_button = findViewById(R.id.fatura_irsaliye_address_submit_button);

        createAdapterCity();
        createAdapterIlce();

        fatura_irsaliye_address_exact_address.getEditText().addTextChangedListener(new TextWatcher() {
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


        fatura_irsaliye_address_submit_button.setOnClickListener(view -> {

        });


    }

    private void createAdapterCity() {
        String[] cities = {"Istanbul", "Bursa", "Trabzon"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(FaturaIrsaliyeActivity.this,
                R.layout.dropdown_layout_item,
                cities);

        fatura_irsaliye_address_sehir_auto.setAdapter(adapter);
        fatura_irsaliye_address_sehir_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedCity = cities[i];
            }
        });
    }

    private void createAdapterIlce() {
        String[] districts = {"Kucukcekmece", "Buyukcekmece", "Besiktas", "Beylikduzu"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(FaturaIrsaliyeActivity.this,
                R.layout.dropdown_layout_item, districts);

        fatura_irsaliye_address_ilce_auto.setAdapter(adapter);

        fatura_irsaliye_address_ilce_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                selectedIlce = districts[i];
            }
        });
    }

}