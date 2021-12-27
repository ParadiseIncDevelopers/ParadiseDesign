package com.example.paradisedesign.tabs.products.factory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class ProductsFactoryProcessAdderActivity extends AppCompatActivity {

    private Button products_factory_process_adder_add, products_factory_process_adder_delete;
    private TextInputLayout products_factory_process_adder_input, products_factory_process_adder_delete_input;
    private RecyclerView products_factory_process_adder_recycler;
    private AutoCompleteTextView products_factory_process_adder_delete_input_auto;

    private boolean isAddClicked = false;
    private boolean isDeleteClicked = false;

    private String temporariry = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_factory_process_adder);

        products_factory_process_adder_add = findViewById(R.id.products_factory_process_adder_add);
        products_factory_process_adder_delete = findViewById(R.id.products_factory_process_adder_delete);

        products_factory_process_adder_input = findViewById(R.id.products_factory_process_adder_input);

        products_factory_process_adder_delete_input = findViewById(R.id.products_factory_process_adder_delete_input);
        products_factory_process_adder_delete_input_auto = findViewById(R.id.products_factory_process_adder_delete_input_auto);

        products_factory_process_adder_recycler = findViewById(R.id.products_factory_process_adder_recycler);


        List<String> listOfProcesses = new ArrayList<>();
        listOfProcesses.add("First process");
        listOfProcesses.add("Second process");
        listOfProcesses.add("Third process");

        products_factory_process_adder_recycler.setLayoutManager(new LinearLayoutManager(this));

        ProcessAdderRecyclerAdapter adapter = new ProcessAdderRecyclerAdapter(listOfProcesses);
        products_factory_process_adder_recycler.setAdapter(adapter);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(ProductsFactoryProcessAdderActivity.this,
                R.layout.dropdown_layout_item, listOfProcesses);

        products_factory_process_adder_delete_input_auto.setAdapter(arrayAdapter);

        products_factory_process_adder_delete_input_auto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                listOfProcesses.remove(position);
                adapter.notifyItemRemoved(position);
            }
        });

        products_factory_process_adder_add.setOnClickListener(view -> {
            isDeleteClicked = false;
            isAddClicked = true;

            products_factory_process_adder_delete_input.setVisibility(View.GONE);
            products_factory_process_adder_input.setVisibility(View.VISIBLE);
        });
        products_factory_process_adder_delete.setOnClickListener(view -> {
            isAddClicked = false;
            isDeleteClicked = true;

            products_factory_process_adder_input.setVisibility(View.GONE);
            products_factory_process_adder_delete_input.setVisibility(View.VISIBLE);
        });



        products_factory_process_adder_input.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                temporariry = editable.toString();
            }
        });

        products_factory_process_adder_input.getEditText().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)){
                    listOfProcesses.add(temporariry);
                    adapter.notifyItemInserted(listOfProcesses.size());

                    return true;
                }
                return false;
            }
        });
    }
}