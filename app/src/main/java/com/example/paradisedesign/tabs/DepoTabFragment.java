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


public class DepoTabFragment extends Fragment {

    private Button depo_find_button;
    private TextInputLayout depo_find_input;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs_depo, container, false);

        depo_find_button = view.findViewById(R.id.depo_find_button);
        depo_find_input = view.findViewById(R.id.depo_find_input);

        depo_find_button.setOnClickListener(view1 -> {});

        depo_find_input.getEditText().addTextChangedListener(new TextWatcher() {
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