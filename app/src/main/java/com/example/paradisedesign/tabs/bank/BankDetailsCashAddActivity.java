package com.example.paradisedesign.tabs.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.paradisedesign.R;
import com.example.paradisedesign.tabs.products.ProductsDetailAddActivity;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import java.util.function.Supplier;

public class BankDetailsCashAddActivity extends AppCompatActivity {

    private TextInputLayout bank_details_cash_add_name_of_kasa, bank_details_cash_add_kasa_number,
            bank_details_cash_add_limit_of_kasa;

    private AutoCompleteTextView bank_details_cash_add_kdv_auto;

    private CheckBox bank_details_cash_add_limit_checkbox;

    private Button bank_details_cash_add_submit_button;

    private String selectedType = "";

    private boolean isLimited = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details_cash_add);

        // TextInputLayouts
        bank_details_cash_add_name_of_kasa = findViewById(R.id.bank_details_cash_add_name_of_kasa);
        bank_details_cash_add_kasa_number = findViewById(R.id.bank_details_cash_add_kasa_number);
        bank_details_cash_add_limit_of_kasa = findViewById(R.id.bank_details_cash_add_limit_of_kasa);

        // AutoCompleteTextView
        bank_details_cash_add_kdv_auto = findViewById(R.id.bank_details_cash_add_kdv_auto);

        // CheckBox
        bank_details_cash_add_limit_checkbox = findViewById(R.id.bank_details_cash_add_limit_checkbox);

        // Button
        bank_details_cash_add_submit_button = findViewById(R.id.bank_details_cash_add_submit_button);

        createAdapter();

        // Listeners
        bank_details_cash_add_name_of_kasa.getEditText().addTextChangedListener(new TextWatcher() {
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

        bank_details_cash_add_kasa_number.getEditText().addTextChangedListener(new TextWatcher() {
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

        bank_details_cash_add_limit_of_kasa.getEditText().addTextChangedListener(new TextWatcher() {
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

        bank_details_cash_add_limit_checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((CheckBox) view).isChecked()) {

                } else {

                }
            }
        });

        bank_details_cash_add_submit_button.setOnClickListener((view -> {

            Supplier<Boolean> checkInputs = () -> {

                if (isInputFilled(bank_details_cash_add_name_of_kasa) &&
                        isInputFilled(bank_details_cash_add_kasa_number) &&
                        !selectedType.equals("")) {
                    return true;
                } else
                    return false;
            };

            if (!isInputFilled(bank_details_cash_add_name_of_kasa)) {
                Toast.makeText(BankDetailsCashAddActivity.this, "Name of kasa field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(bank_details_cash_add_kasa_number)) {
                Toast.makeText(BankDetailsCashAddActivity.this, "Kasa no field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (isLimited) {
                if (!isInputFilled(bank_details_cash_add_limit_of_kasa)) {
                    Toast.makeText(BankDetailsCashAddActivity.this, "Kasa limit field is not entered.",
                            Toast.LENGTH_SHORT).show();
                }
            }

            if (selectedType.equals("")){
                Toast.makeText(BankDetailsCashAddActivity.this, "Exchange type field is not selected.",
                        Toast.LENGTH_SHORT).show();
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                if (checkInputs.get()){
                    Toast.makeText(BankDetailsCashAddActivity.this, "Everything is correct",
                            Toast.LENGTH_SHORT).show();
                }
            }


        }));
    }

    private void createAdapter() {
        String[] dovizTuru = {"TL", "Dollar", "Euro"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(BankDetailsCashAddActivity.this,
                R.layout.dropdown_layout_item, dovizTuru);

        bank_details_cash_add_kdv_auto.setAdapter(adapter);

        bank_details_cash_add_kdv_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selectedType = dovizTuru[position];
            }
        });

    }

    private boolean isInputFilled (TextInputLayout inputLayout) {
        if (inputLayout.getEditText().getText().toString().matches("")) {
            return false;
        } else
            return true;
    }
}