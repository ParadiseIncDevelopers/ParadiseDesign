package com.example.paradisedesign.tabs.fatura.normal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paradisedesign.R;

import java.util.List;

public class FaturaNormalSecondRecycler extends RecyclerView.Adapter<FaturaNormalSecondRecycler.FaturaViewHolder> {

    private List<Integer> id;
    private List<String> names;
    private List<String> dates;
    private List<Integer> totalSum;
    private LayoutInflater mLayoutInflatter;

    public FaturaNormalSecondRecycler(Context context, List<Integer> id, List<String> names, List<String> dates,
                                      List<Integer> totalSum) {
        mLayoutInflatter = LayoutInflater.from(context);
        this.id = id;
        this.names  = names;
        this.dates = dates;
        this.totalSum = totalSum;

    }

    class FaturaViewHolder extends RecyclerView.ViewHolder {

        private TextView fatura_normal_recycler_id, fatura_normal_recycler_name_of_product,
                fatura_normal_recycler_date, fatura_normal_recycler_total_sum;

        public FaturaViewHolder(@NonNull View itemView) {
            super(itemView);

            fatura_normal_recycler_id = itemView.findViewById(R.id.fatura_normal_second_recycler_id);
            fatura_normal_recycler_name_of_product = itemView.findViewById(R.id.fatura_normal_second_recycler_name_of_product);
            fatura_normal_recycler_date = itemView.findViewById(R.id.fatura_normal_second_recycler_date);
            fatura_normal_recycler_total_sum = itemView.findViewById(R.id.fatura_normal_second_recycler_total_sum);
        }
    }



    @NonNull
    @Override
    public FaturaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflatter.inflate(R.layout.fatura_normal_second_recycler, parent, false);
        return new FaturaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaturaViewHolder holder, int position) {
        holder.fatura_normal_recycler_id.setText("");
        holder.fatura_normal_recycler_name_of_product.setText("");
        holder.fatura_normal_recycler_date.setText("");
        holder.fatura_normal_recycler_total_sum.setText("");
    }

    @Override
    public int getItemCount() {
        return id.size();
    }
}
