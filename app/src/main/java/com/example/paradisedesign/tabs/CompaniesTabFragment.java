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

import org.w3c.dom.Text;


public class CompaniesTabFragment extends Fragment {

    private Button companies_add_button, companies_find_button, companies_delete_button, companies_update_button;

    private TextInputLayout companies_find_input;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs_companies, container, false);

        companies_add_button = view.findViewById(R.id.companies_add_button);
        companies_find_button = view.findViewById(R.id.companies_find_button);
        companies_delete_button = view.findViewById(R.id.companies_delete_button);
        companies_update_button = view.findViewById(R.id.companies_update_button);

        companies_add_button.setOnClickListener(view1 -> {});
        companies_find_button.setOnClickListener(view1 -> {});
        companies_delete_button.setOnClickListener(view1 -> {});
        companies_update_button.setOnClickListener(view1 -> {});

        companies_find_input.getEditText().addTextChangedListener(new TextWatcher() {
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