package com.example.paradisedesign.tabs.fatura;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.paradisedesign.R;


public class FaturaDetailsFragment extends Fragment {

    private Button fatura_detail_efatura_button, fatura_detail_manual_button,
            fatura_detail_eirsaliye_button, fatura_detail_irsaliye_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fatura_details, container, false);

        fatura_detail_efatura_button = view.findViewById(R.id.fatura_detail_efatura_button);
        fatura_detail_manual_button = view.findViewById(R.id.fatura_detail_manual_button);
        fatura_detail_eirsaliye_button = view.findViewById(R.id.fatura_detail_eirsaliye_button);
        fatura_detail_irsaliye_button = view.findViewById(R.id.fatura_detail_irsaliye_button);

        fatura_detail_efatura_button.setOnClickListener(view1 -> {

        });

        fatura_detail_manual_button.setOnClickListener(view1 -> {

        });

        fatura_detail_eirsaliye_button.setOnClickListener(view1 -> {

        });

        fatura_detail_irsaliye_button.setOnClickListener(view1 -> {
            
        });

        return view;
    }
}