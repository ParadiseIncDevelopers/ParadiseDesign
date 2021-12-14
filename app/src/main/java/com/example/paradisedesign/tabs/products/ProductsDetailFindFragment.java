package com.example.paradisedesign.tabs.products;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputLayout;

public class ProductsDetailFindFragment extends Fragment {

    private TextView products_detail_find_fragment_title_tv;

    private TextInputLayout products_detail_find_fragment_name_of_product;

    private RecyclerView products_detail_find_fragment_recycler_view;

    private Button products_detail_find_fragment_submit_button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_products_detail_find, container, false);

        products_detail_find_fragment_title_tv = view.findViewById(R.id.products_detail_find_fragment_title_tv);

        products_detail_find_fragment_name_of_product = view.findViewById(R.id.products_detail_find_fragment_name_of_product);

        products_detail_find_fragment_recycler_view = view.findViewById(R.id.products_detail_find_fragment_recycler_view);

        products_detail_find_fragment_submit_button = view.findViewById(R.id.products_detail_find_fragment_submit_button);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        products_detail_find_fragment_submit_button.setOnClickListener(viewButton -> {

        });
    }
}