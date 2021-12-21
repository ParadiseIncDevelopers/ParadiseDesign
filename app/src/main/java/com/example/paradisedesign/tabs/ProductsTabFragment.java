package com.example.paradisedesign.tabs;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputLayout;


public class ProductsTabFragment extends Fragment {

    private Button products_find_button;
    private TextInputLayout products_find_input;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs_products, container, false);

        products_find_input = view.findViewById(R.id.products_find_input);
        products_find_button = view.findViewById(R.id.products_find_button);

        products_find_button.setOnClickListener(view1 -> {

        });


        products_find_input.getEditText().addTextChangedListener(new TextWatcher() {
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


        return view;
    }
}