package com.example.paradisedesign.tabs;

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


public class IthalatTabFragment extends Fragment {

    private Button ithalat_add_button, ithalat_find_button, ithalat_delete_button;

    private TextInputLayout ithalat_find_input;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs_ithalat, container, false);

        ithalat_add_button = view.findViewById(R.id.ithalat_add_button);
        ithalat_find_button = view.findViewById(R.id.ithalat_find_button);
        ithalat_delete_button = view.findViewById(R.id.ithalat_delete_button);

        ithalat_find_input = view.findViewById(R.id.ithalat_find_input);

        ithalat_add_button.setOnClickListener(view1 -> {});
        ithalat_find_button.setOnClickListener(view1 -> {});
        ithalat_delete_button.setOnClickListener(view1 -> {});

        ithalat_find_input.getEditText().addTextChangedListener(new TextWatcher() {
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