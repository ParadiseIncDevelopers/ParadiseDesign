package com.example.paradisedesign.tabs.fatura.irsaliye;

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

public class FaturaIrsaliyeAddFirstRecycler extends RecyclerView.Adapter<FaturaIrsaliyeAddFirstRecycler.FaturaViewHolder> {
    private List<String> namesOfPRoducts;
    private List<Integer> numbersOfProducts;
    private LayoutInflater mLayoutInflatter;

    public FaturaIrsaliyeAddFirstRecycler(Context context, List<String> namesOfProducts, List<Integer> numbersOfProducts) {
        this.namesOfPRoducts = namesOfProducts;
        this.numbersOfProducts = numbersOfProducts;
        this.mLayoutInflatter = LayoutInflater.from(context);

    }

    class FaturaViewHolder extends RecyclerView.ViewHolder {
        CheckBox fatura_irsaliye_add_iskonto_checkbox;
        TextView fatura_irsaliye_add_product_name;
        TextView fatura_irsaliye_add_recycler_amount_tv;
        ImageView fatura_irsaliye_add_recycler_minus_button;
        ImageView fatura_irsaliye_add_recycler_plus_button;

        public FaturaViewHolder(@NonNull View itemView) {
            super(itemView);

            fatura_irsaliye_add_iskonto_checkbox = itemView.findViewById(R.id.fatura_irsaliye_add_iskonto_checkbox);

            fatura_irsaliye_add_product_name = itemView.findViewById(R.id.fatura_irsaliye_add_product_name);

            fatura_irsaliye_add_recycler_amount_tv = itemView.findViewById(R.id.fatura_irsaliye_add_recycler_amount_tv);

            fatura_irsaliye_add_recycler_minus_button = itemView.findViewById(R.id.fatura_irsaliye_add_recycler_minus_button);

            fatura_irsaliye_add_recycler_plus_button = itemView.findViewById(R.id.fatura_irsaliye_add_recycler_plus_button);


            fatura_irsaliye_add_recycler_minus_button.setOnClickListener(view1 -> {

            });

            fatura_irsaliye_add_recycler_plus_button.setOnClickListener(view1 -> {

            });

        }
    }

    @NonNull
    @Override
    public FaturaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mLayoutInflatter.inflate(R.layout.fatura_irsaliye_add_recycler, parent, false);

        return new FaturaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaturaViewHolder holder, int position) {

        holder.fatura_irsaliye_add_product_name.setText(namesOfPRoducts.get(position));

        holder.fatura_irsaliye_add_recycler_amount_tv.setText(numbersOfProducts.get(position));


    }

    @Override
    public int getItemCount() {
        return namesOfPRoducts.size();
    }

}
