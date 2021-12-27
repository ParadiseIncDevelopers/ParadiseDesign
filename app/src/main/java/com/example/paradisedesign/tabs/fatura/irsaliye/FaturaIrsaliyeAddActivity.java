package com.example.paradisedesign.tabs.fatura.irsaliye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.paradisedesign.R;

import java.util.ArrayList;

public class FaturaIrsaliyeAddActivity extends AppCompatActivity {

    private TextView fatura_irsaliye_add_title;
    private RecyclerView fatura_irsaliye_add_recycler;

    // HashMap<String, Integer> map  // O(n)  eslinde O(1)

    // Yusuf = s0*32^(s.length - position) + s1*32^(s.length - position+1) + s2*32^(s.length - position+2)
    // + s2*32^(s.length - position+3) = HasCode
    // array [HashCode] != 0

    // Tom Mot


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatura_irsaliye_add);

        fatura_irsaliye_add_title = findViewById(R.id.fatura_irsaliye_add_title);

        fatura_irsaliye_add_recycler = findViewById(R.id.fatura_irsaliye_add_recycler);
    }


}





