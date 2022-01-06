package com.example.paradisedesign.tabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class CompaniesTabFragment extends Fragment {

    private Button companies_add_button, companies_find_button;

    private AutoCompleteTextView companies_find_auto_complete;

    private final List<String> findAutoList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tabs_companies, container, false);

        companies_add_button = view.findViewById(R.id.companies_add_button);
        companies_find_button = view.findViewById(R.id.companies_find_button);

        companies_find_auto_complete = view.findViewById(R.id.companies_find_auto_complete);

        findAutoList.add("First");
        findAutoList.add("Second");
        findAutoList.add("Third");
        findAutoList.add("Fourth");
        findAutoList.add("Fifth");


        ArrayAdapter<String> findArrayAdapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_dropdown_item_1line, findAutoList);

        companies_find_auto_complete.setThreshold(1);

        companies_find_auto_complete.setAdapter(findArrayAdapter);

        companies_add_button.setOnClickListener(view1 -> {});

        companies_find_button.setOnClickListener(view1 -> {
            companies_find_auto_complete.setVisibility(View.VISIBLE);
        });



        return view;
    }
}