package com.example.paradisedesign.tabs.depo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputLayout;

public class DepoDetailsUpdateFragment extends Fragment {

    private TextView depo_details_update_fragment_title_tv;

    private TextInputLayout depo_details_update_fragment_name_of_product,
            depo_details_update_fragment_number_of_product;

    private Button depo_details_update_fragment_submit_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_depo_details_update, container, false);

        depo_details_update_fragment_title_tv = view.findViewById(R.id.depo_details_update_fragment_title_tv);

        depo_details_update_fragment_name_of_product = view.findViewById(R.id.depo_details_update_fragment_name_of_product);
        depo_details_update_fragment_number_of_product = view.findViewById(R.id.depo_details_update_fragment_number_of_product);

        depo_details_update_fragment_submit_button = view.findViewById(R.id.depo_details_update_fragment_submit_button);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        depo_details_update_fragment_submit_button.setOnClickListener(viewButton -> {

        });
    }
}