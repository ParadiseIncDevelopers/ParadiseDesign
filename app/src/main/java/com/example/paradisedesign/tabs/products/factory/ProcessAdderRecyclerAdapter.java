package com.example.paradisedesign.tabs.products.factory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paradisedesign.R;

import java.util.ArrayList;
import java.util.List;

public class ProcessAdderRecyclerAdapter extends RecyclerView.Adapter<ProcessAdderRecyclerAdapter.ProcessViewHolder> {
    private final List<String> listOfProcesses;

    public ProcessAdderRecyclerAdapter(List<String> listOfProcesses) {
        this.listOfProcesses = listOfProcesses;
    }

    class ProcessViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final TextView factory_process_adder_recycler_title;
        private final ImageView factory_process_adder_recycler_arrow;

        public ProcessViewHolder(View itemView) {
            super(itemView);

            factory_process_adder_recycler_title = itemView.findViewById(R.id.factory_process_adder_recycler_title);
            factory_process_adder_recycler_arrow = itemView.findViewById(R.id.factory_process_adder_recycler_arrow);

            factory_process_adder_recycler_arrow.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (view.getId() == factory_process_adder_recycler_arrow.getId()) {
                Toast.makeText(itemView.getContext(), "Clicked on view", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @NonNull
    @Override
    public ProcessViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.products_factory_process_adder_recycler_view, parent, false);
        return new ProcessViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProcessViewHolder holder, int position) {
        holder.factory_process_adder_recycler_title.setText(listOfProcesses.get(position));
    }

    @Override
    public int getItemCount() {
        return listOfProcesses.size();
    }


}
