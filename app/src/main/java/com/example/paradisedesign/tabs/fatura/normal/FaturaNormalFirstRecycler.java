package com.example.paradisedesign.tabs.fatura.normal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paradisedesign.R;

import java.util.List;

public class FaturaNormalFirstRecycler extends
        RecyclerView.Adapter<FaturaNormalFirstRecycler.FaturaNormalFirstViewHolder> {

    private List<String> namesOfPRoducts;
    private List<Integer> numbersOfProducts;
    private LayoutInflater mLayoutInflatter;

    public FaturaNormalFirstRecycler(Context context, List<String> namesOfProducts, List<Integer> numbersOfProducts) {
        this.namesOfPRoducts = namesOfProducts;
        this.numbersOfProducts = numbersOfProducts;
        this.mLayoutInflatter = LayoutInflater.from(context);
    }

    class FaturaNormalFirstViewHolder extends RecyclerView.ViewHolder {
        private CheckBox fatura_normal_first_recycler_iskonto_checkbox;
        private TextView fatura_normal_first_recycler_product_name;
        private TextView fatura_normal_first_recycler_amount_tv;
        private ImageView fatura_normal_first_recycler_minus_button;
        private ImageView fatura_normal_first_recycler_plus_button;

        public FaturaNormalFirstViewHolder (View itemView) {
            super(itemView);

            fatura_normal_first_recycler_iskonto_checkbox = itemView.findViewById(R.id.fatura_normal_first_recycler_iskonto_checkbox);

            fatura_normal_first_recycler_product_name = itemView.findViewById(R.id.fatura_normal_first_recycler_product_name);

            fatura_normal_first_recycler_amount_tv = itemView.findViewById(R.id.fatura_normal_first_recycler_amount_tv);

            fatura_normal_first_recycler_minus_button = itemView.findViewById(R.id.fatura_normal_first_recycler_minus_button);

            fatura_normal_first_recycler_plus_button = itemView.findViewById(R.id.fatura_normal_first_recycler_plus_button);


            fatura_normal_first_recycler_minus_button.setOnClickListener(view1 -> {

            });

            fatura_normal_first_recycler_plus_button.setOnClickListener(view1 -> {

            });
        }

    }

    @NonNull
    @Override
    public FaturaNormalFirstViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = mLayoutInflatter.inflate(R.layout.fatura_normal_first_recycler, parent, false);
        return new FaturaNormalFirstViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull FaturaNormalFirstViewHolder holder, int position) {
        holder.fatura_normal_first_recycler_product_name.setText("");
        holder.fatura_normal_first_recycler_amount_tv.setText("");
    }

    @Override
    public int getItemCount() {
        return numbersOfProducts.size();
    }




}
