package com.example.paradisedesign.tabs.products;

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


public class ProductsDetailAddFragment extends Fragment {

    private TextView products_detail_add_fragment_title_tv;

    private TextInputLayout products_detail_add_fragment_name_of_product, products_detail_add_fragment_number_of_product,
            products_detail_add_fragment_kdv, products_detail_add_fragment_iskonto;

    private Button products_detail_add_fragment_submit_button;

    //Add and Update buttons inflate the same layout
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_products_detail_add, container, false);


        products_detail_add_fragment_title_tv = view.findViewById(R.id.products_detail_add_fragment_title_tv);

        products_detail_add_fragment_name_of_product = view.findViewById(R.id.products_detail_add_fragment_name_of_product);
        products_detail_add_fragment_number_of_product =  view.findViewById(R.id.products_detail_add_fragment_number_of_product);
        products_detail_add_fragment_kdv = view.findViewById(R.id.products_detail_add_fragment_kdv);
        products_detail_add_fragment_iskonto = view.findViewById(R.id.products_detail_add_fragment_iskonto);

        products_detail_add_fragment_submit_button = view.findViewById(R.id.products_detail_add_fragment_submit_button);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        products_detail_add_fragment_submit_button.setOnClickListener(viewButton -> {

        });
    }
}