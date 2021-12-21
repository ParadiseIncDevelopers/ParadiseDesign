package com.example.paradisedesign.tabs.fatura.irsaliye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import com.example.paradisedesign.R;

import java.util.ArrayList;

public class FaturaIrsaliyeAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatura_irsaliye_add);

        RecyclerView fatura_irsaliye_add_recycler = findViewById(R.id.fatura_irsaliye_add_recycler);

        fatura_irsaliye_add_recycler.setLayoutManager(new LinearLayoutManager(this));

        // TODO add recycler view adapter to recycler view
    }


}





