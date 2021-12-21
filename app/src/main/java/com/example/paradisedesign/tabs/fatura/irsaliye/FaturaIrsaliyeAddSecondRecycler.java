package com.example.paradisedesign.tabs.fatura.irsaliye;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paradisedesign.R;

import java.util.List;

public class FaturaIrsaliyeAddSecondRecycler extends
        RecyclerView.Adapter<FaturaIrsaliyeAddSecondRecycler.FaturaSecondViewHolder> {

    private List<Integer> id;
    private List<String> names;
    private List<String> dates;
    private List<Integer> totalSum;
    private List<String> address;
    private LayoutInflater mLayoutInflatter;

    public FaturaIrsaliyeAddSecondRecycler(Context context, List<Integer> id, List<String> names,
                                           List<String> dates, List<Integer> totalSum, List<String> address) {
        mLayoutInflatter = LayoutInflater.from(context);

        this.id = id;
        this.names = names;
        this.dates = dates;
        this.totalSum = totalSum;
        this.address = address;

    }

    class FaturaSecondViewHolder extends RecyclerView.ViewHolder {

        private final TextView fatura_irsaliye_add_second_recycler_id, fatura_irsaliye_add_second_recycler_name_of_product,
                fatura_irsaliye_add_second_recycler_date, fatura_irsaliye_add_second_recycler_total_sum,
                fatura_irsaliye_add_second_recycler_address;

        public FaturaSecondViewHolder(View itemView) {
            super(itemView);

            fatura_irsaliye_add_second_recycler_id = itemView.findViewById(R.id.fatura_irsaliye_add_second_recycler_id);
            fatura_irsaliye_add_second_recycler_name_of_product = itemView.findViewById(R.id.fatura_irsaliye_add_second_recycler_name_of_product);
            fatura_irsaliye_add_second_recycler_date = itemView.findViewById(R.id.fatura_irsaliye_add_second_recycler_date);
            fatura_irsaliye_add_second_recycler_total_sum = itemView.findViewById(R.id.fatura_irsaliye_add_second_recycler_total_sum);
            fatura_irsaliye_add_second_recycler_address = itemView.findViewById(R.id.fatura_irsaliye_add_second_recycler_address);


        }
    }

    @NonNull
    @Override
    public FaturaSecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = mLayoutInflatter.inflate(R.layout.fatura_irsaliye_add_second_recycler, parent, false);

        return new FaturaSecondViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull FaturaSecondViewHolder holder, int position) {
        holder.fatura_irsaliye_add_second_recycler_id.setText("");
        holder.fatura_irsaliye_add_second_recycler_name_of_product.setText("");
        holder.fatura_irsaliye_add_second_recycler_date.setText("");
        holder.fatura_irsaliye_add_second_recycler_total_sum.setText("");
        holder.fatura_irsaliye_add_second_recycler_address.setText("");
    }

    @Override
    public int getItemCount() {
        return id.size();
    }


}
