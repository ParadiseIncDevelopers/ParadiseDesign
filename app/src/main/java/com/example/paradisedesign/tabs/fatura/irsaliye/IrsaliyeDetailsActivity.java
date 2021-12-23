package com.example.paradisedesign.tabs.fatura.irsaliye;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.paradisedesign.R;

public class IrsaliyeDetailsActivity extends AppCompatActivity {

    private Button e_invoice_add_button, e_dispatch_add_button, invoice_add_button, dispatch_add_button;
    private Button all_invoices_print_button, all_invoices_see_button;

    // Clas that was created in the Yusuf's project

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_and_dispatch_profile);

        // First layer
        e_invoice_add_button = findViewById(R.id.e_invoice_add_button);
        e_dispatch_add_button = findViewById(R.id.e_dispatch_add_button);
        invoice_add_button = findViewById(R.id.invoice_add_button);
        dispatch_add_button = findViewById(R.id.dispatch_add_button);

        // Second layer
        all_invoices_print_button = findViewById(R.id.all_invoices_print_button);
        all_invoices_see_button = findViewById(R.id.all_invoices_see_button);

        fatura_detail_efatura_button.setOnClickListener(view1 ->
        {
            Toast.makeText(InvoiceAndDispatch_profile.this, "Coming soon", Toast.LENGTH_SHORT).show();
        });

        fatura_detail_manual_button.setOnClickListener(view1 ->
        {
            Intent intent = new Intent(InvoiceAndDispatch_profile.this, manualAdd.class);
            startActivity(intent);
            finish();
        });

        fatura_detail_eirsaliye_button.setOnClickListener(view1 ->
        {
            Toast.makeText(InvoiceAndDispatch_profile.this, "Coming soon", Toast.LENGTH_SHORT).show();
        });

        fatura_detail_irsaliye_button.setOnClickListener(view1 ->
        {
            Intent intent = new Intent(InvoiceAndDispatch_profile.this, dispatchAddAddress.class);
            startActivity(intent);
            finish();
        });

    }

     */
}