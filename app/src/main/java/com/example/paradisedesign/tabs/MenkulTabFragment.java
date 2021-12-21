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

public class MenkulTabFragment extends Fragment {

    private Button menkul_add_button, menkul_find_button, menkul_delete_button, menkul_update_button;

    private TextInputLayout menkul_find_input;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs_menkul, container, false);

        menkul_add_button = view.findViewById(R.id.menkul_add_button);
        menkul_find_button = view.findViewById(R.id.menkul_find_button);
        menkul_delete_button = view.findViewById(R.id.menkul_delete_button);
        menkul_update_button = view.findViewById(R.id.menkul_update_button);

        menkul_find_input = view.findViewById(R.id.menkul_find_input);

        menkul_add_button.setOnClickListener(view1 -> {});
        menkul_find_button.setOnClickListener(view1 -> {});
        menkul_delete_button.setOnClickListener(view1 -> {});
        menkul_update_button.setOnClickListener(view1 -> {});

        menkul_find_input.getEditText().addTextChangedListener(new TextWatcher() {
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