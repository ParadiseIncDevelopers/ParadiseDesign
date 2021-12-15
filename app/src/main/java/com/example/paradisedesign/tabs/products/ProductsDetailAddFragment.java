package com.example.paradisedesign.tabs.products;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
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
import java.util.regex.Pattern;


public class ProductsDetailAddFragment extends Fragment {

    private TextView products_detail_add_fragment_title_tv;

    private TextInputLayout products_detail_add_fragment_name_of_product, products_detail_add_fragment_number_of_product,
            products_detail_add_fragment_iskonto;

    private TextInputEditText products_detail_add_fragment_name_of_product_edit_text;

    private AutoCompleteTextView products_detail_add_fragment_kdv_auto;

    private Button products_detail_add_fragment_submit_button;

    String selectedKdv = "";

    //Add and Update buttons inflate the same layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_products_detail_add, container, false);


        products_detail_add_fragment_title_tv = view.findViewById(R.id.products_detail_add_fragment_title_tv);

        products_detail_add_fragment_name_of_product = view.findViewById(R.id.products_detail_add_fragment_name_of_product);
        products_detail_add_fragment_number_of_product =  view.findViewById(R.id.products_detail_add_fragment_number_of_product);
        products_detail_add_fragment_iskonto = view.findViewById(R.id.products_detail_add_fragment_iskonto);

        products_detail_add_fragment_name_of_product_edit_text = view.findViewById(R.id.products_detail_add_fragment_name_of_product_edit_text);

        products_detail_add_fragment_kdv_auto = view.findViewById(R.id.products_detail_add_fragment_kdv_auto);

        products_detail_add_fragment_submit_button = view.findViewById(R.id.products_detail_add_fragment_submit_button);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        products_detail_add_fragment_submit_button.setOnClickListener(viewButton -> {

            if (!checkField(products_detail_add_fragment_number_of_product)) {
                Toast.makeText(getContext(), "Number of products field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!checkField(products_detail_add_fragment_iskonto)) {
                Toast.makeText(getContext(), "Iskonto field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }
            if (selectedKdv.equals("")) {
                Toast.makeText(getContext(), "KDV is not selected.",
                        Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(getContext(), "Everything is correct.",
                        Toast.LENGTH_SHORT).show();
            }

        });

        products_detail_add_fragment_name_of_product_edit_text.setOnEditorActionListener(
                new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {

                if (actionId == EditorInfo.IME_ACTION_GO && checkName(
                        Objects.requireNonNull(products_detail_add_fragment_name_of_product
                        .getEditText()).getText().toString())) {
                    products_detail_add_fragment_name_of_product.setError("");
                } else {
                    products_detail_add_fragment_name_of_product.setError("The product name should " +
                            "begin with character");
                }
                return true;
            }
        });
    }

    private void createAdapterKDV() {

        String[] arrayKDV = {"1", "8", "18"};

        ArrayAdapter<String> kdvAdapter = new ArrayAdapter<>(getContext(), R.layout.dropdown_layout_item,
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
        return Pattern.matches("[a-zA-Z].*", name);
    }

    private boolean checkField(TextInputLayout inputLayout) {
        if (inputLayout.getEditText().getText().toString().matches("")) {
            return false;
        } else
            return true;
    }

}