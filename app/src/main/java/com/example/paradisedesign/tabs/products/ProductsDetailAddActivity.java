package com.example.paradisedesign.tabs.products;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.regex.Pattern;


public class ProductsDetailAddActivity extends AppCompatActivity {

    private TextView products_detail_add_fragment_title_tv;

    private TextInputLayout products_detail_add_fragment_name_of_product, products_detail_add_fragment_number_of_product,
            products_detail_add_fragment_iskonto, products_detail_add_fragment_kdv;

    private TextInputEditText products_detail_add_fragment_name_of_product_edit_text;

    private AutoCompleteTextView products_detail_add_fragment_kdv_auto;

    private Button products_detail_add_fragment_submit_button;

    private String nameOfProduct = "";
    private int miktar = 0;
    private String selectedKdv = "";
    private double iskonto = 0.0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_detail_add);

        products_detail_add_fragment_title_tv = findViewById(R.id.products_detail_add_fragment_title_tv);

        products_detail_add_fragment_name_of_product = findViewById(R.id.products_detail_add_fragment_name_of_product);
        products_detail_add_fragment_number_of_product =  findViewById(R.id.products_detail_add_fragment_number_of_product);
        products_detail_add_fragment_iskonto = findViewById(R.id.products_detail_add_fragment_iskonto);
        products_detail_add_fragment_kdv = findViewById(R.id.products_detail_add_fragment_kdv);

        products_detail_add_fragment_name_of_product_edit_text = findViewById(R.id.products_detail_add_fragment_name_of_product_edit_text);

        products_detail_add_fragment_kdv_auto = findViewById(R.id.products_detail_add_fragment_kdv_auto);

        products_detail_add_fragment_submit_button = findViewById(R.id.products_detail_add_fragment_submit_button);

        createAdapterKDV();

        products_detail_add_fragment_submit_button.setOnClickListener(viewButton -> {

            Supplier<Boolean> checkInputs = () -> {

                if (isInputFilled(products_detail_add_fragment_number_of_product) &&
                        isInputFilled(products_detail_add_fragment_iskonto) &&
                        !selectedKdv.equals("")) {
                    return true;
                } else
                    return false;
            };

            if (!isInputFilled(products_detail_add_fragment_number_of_product)) {
                Toast.makeText(ProductsDetailAddActivity.this, "Number of products field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(products_detail_add_fragment_iskonto)) {
                Toast.makeText(ProductsDetailAddActivity.this, "Iskonto field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (selectedKdv.equals("")) {
                Toast.makeText(ProductsDetailAddActivity.this, "KDV is not selected.",
                        Toast.LENGTH_SHORT).show();
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                if (checkInputs.get()) {
                    Toast.makeText(ProductsDetailAddActivity.this, "Everything is correct", Toast.LENGTH_SHORT)
                            .show();
                    //FirebaseDatabase database = FirebaseDatabase.getInstance().getReference().child()
                }
            }

        });

        products_detail_add_fragment_name_of_product_edit_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (checkName(Objects.requireNonNull(products_detail_add_fragment_name_of_product
                                .getEditText()).getText().toString())) {
                    products_detail_add_fragment_name_of_product.setError("");
                } else {
                    products_detail_add_fragment_name_of_product.setError("The product name should " +
                            "begin with character");
                }

                nameOfProduct = editable.toString();
            }
        });

        products_detail_add_fragment_number_of_product.getEditText()
                .addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        miktar = Integer.parseInt(editable.toString());
                    }
                });

        products_detail_add_fragment_iskonto.getEditText()
                .addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        iskonto = Double.parseDouble(editable.toString()
                                .replaceAll(",", "."));
                    }
                });




    }




    private void createAdapterKDV() {

        String[] arrayKDV = {"1", "8", "18"};

        ArrayAdapter<String> kdvAdapter = new ArrayAdapter<>(ProductsDetailAddActivity.this,
                R.layout.dropdown_layout_item,
                arrayKDV);

        products_detail_add_fragment_kdv_auto.setAdapter(kdvAdapter);

        products_detail_add_fragment_kdv_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                selectedKdv = arrayKDV[position];
            }
        });
    }

    private boolean checkName(String name) {
        return Pattern.matches("^[a-zA-Z].*$", name);
    }

    private boolean isInputFilled (TextInputLayout inputLayout) {
        if (inputLayout.getEditText().getText().toString().matches("")) {
            return false;
        } else
            return true;
    }

}