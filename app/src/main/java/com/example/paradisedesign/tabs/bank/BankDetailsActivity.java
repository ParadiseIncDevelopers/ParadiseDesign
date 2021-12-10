package com.example.paradisedesign.tabs.bank;

import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.PopupMenu;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.paradisedesign.R;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BankDetailsActivity extends AppCompatActivity {

    // pop-up buttons
    private Button cashButton, chequesReceivedButton, chequesGivenButton, liquidAssetsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_details);


        cashButton = findViewById(R.id.bank_detail_cash_button);
        chequesReceivedButton = findViewById(R.id.bank_detail_cheques_received_button);
        chequesGivenButton = findViewById(R.id.bank_detail_cheques_given_button);
        liquidAssetsButton = findViewById(R.id.bank_detail_liquid_assets_button);



        cashButton.setOnClickListener(view -> showMenu(view, R.menu.popup_menu_4_options));


        chequesReceivedButton.setOnClickListener(view -> { showMenu(view, R.menu.popup_menu_2_options);
        });
        chequesGivenButton.setOnClickListener(view -> showMenu(view, R.menu.popup_menu_4_options));
        liquidAssetsButton.setOnClickListener(view -> showMenu(view, R.menu.popup_menu_4_options));

    }

    @SuppressLint("RestrictedApi")
    private void showMenu(View view, @MenuRes int menuRes) {
        MenuBuilder menuBuilder = new MenuBuilder(this);
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(menuRes, menuBuilder);
        MenuPopupHelper optionsMenu = new MenuPopupHelper(this, menuBuilder, view);
        optionsMenu.setForceShowIcon(true);

        menuBuilder.setCallback(new MenuBuilder.Callback() {
            @Override
            public boolean onMenuItemSelected(@NonNull MenuBuilder menu, @NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case (R.id.bank_menu_option_add):
                        return true;
                    case (R.id.bank_menu_option_delete):
                        return true;
                    case (R.id.bank_menu_option_find):
                        return true;
                    case (R.id.bank_menu_option_update):
                        return true;
                    default:
                        return false;
                }
            }

            @Override
            public void onMenuModeChange(@NonNull MenuBuilder menu) {

            }
        });

        optionsMenu.show();

    }

}