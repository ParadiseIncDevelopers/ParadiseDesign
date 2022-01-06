package com.example.paradisedesign.tabs.workers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.paradisedesign.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class WorkersProfileActivity extends AppCompatActivity {

    TextInputLayout workers_profile_name, workers_profile_tc_no, workers_profile_address,
            workers_profile_position, workers_profile_salary, workers_profile_year_of_entering,
            workers_profile_mezuniyet, workers_profile_mezuniyet_yili, workers_profile_date_of_born,
            workers_profile_meslek_kodu, workers_profile_ssk_tesvik;

    AutoCompleteTextView workers_profile_city_auto, workers_profile_ilce_auto,
            workers_profile_sgk_auto;

    TextView workers_profile_summation_data_tv;

    Button workers_profile_submit_button;

    Map<String, Object> workersProfileMap = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers_profile);

        // TextInputLayouts
        workers_profile_name = findViewById(R.id.workers_profile_name);


        workers_profile_tc_no = findViewById(R.id.workers_profile_tc_no);


        workers_profile_address = findViewById(R.id.workers_profile_address);


        workers_profile_position = findViewById(R.id.workers_profile_position);


        workers_profile_salary = findViewById(R.id.workers_profile_salary);


        workers_profile_year_of_entering = findViewById(R.id.workers_profile_year_of_entering);


        workers_profile_mezuniyet = findViewById(R.id.workers_profile_mezuniyet);


        workers_profile_mezuniyet_yili = findViewById(R.id.workers_profile_mezuniyet_yili);


        workers_profile_date_of_born = findViewById(R.id.workers_profile_date_of_born);


        workers_profile_meslek_kodu = findViewById(R.id.workers_profile_meslek_kodu);


        workers_profile_ssk_tesvik = findViewById(R.id.workers_profile_ssk_tesvik);



        // AutoCompleteTextView
        workers_profile_city_auto = findViewById(R.id.workers_profile_city_auto);

        workers_profile_ilce_auto = findViewById(R.id.workers_profile_ilce_auto);

        workers_profile_sgk_auto = findViewById(R.id.workers_profile_sgk_auto);



        workers_profile_summation_data_tv = findViewById(R.id.workers_profile_summation_data_tv);

        workers_profile_submit_button = findViewById(R.id.workers_profile_submit_button);

        workers_profile_submit_button.setOnClickListener(view ->
        {

            Supplier<Boolean> allTextInputs = () -> {
                if (isInputFilled(workers_profile_name) && isInputFilled(workers_profile_tc_no) &&
                        isInputFilled(workers_profile_address) && isInputFilled(workers_profile_position) &&
                        isInputFilled(workers_profile_year_of_entering) && isInputFilled(workers_profile_mezuniyet) &&
                        isInputFilled(workers_profile_mezuniyet_yili) && isInputFilled(workers_profile_date_of_born) &&
                        isInputFilled(workers_profile_meslek_kodu) && isInputFilled(workers_profile_salary))  {
                    return true;
                } else
                    return false;
        };

            if (!isInputFilled(workers_profile_name)) {
                Toast.makeText(WorkersProfileActivity.this, "Ad soyad field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_tc_no)) {
                Toast.makeText(WorkersProfileActivity.this, "TC no field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_address)) {
                Toast.makeText(WorkersProfileActivity.this, "Adres field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_position)) {
                Toast.makeText(WorkersProfileActivity.this, "Position field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_year_of_entering)) {
                Toast.makeText(WorkersProfileActivity.this, "Date of entering field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_mezuniyet)) {
                Toast.makeText(WorkersProfileActivity.this, "Mezuniyet field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_mezuniyet_yili)) {
                Toast.makeText(WorkersProfileActivity.this, "Mezuniyet yili field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_date_of_born)) {
                Toast.makeText(WorkersProfileActivity.this, "Birthdate field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_meslek_kodu)) {
                Toast.makeText(WorkersProfileActivity.this, "Meslek kodu field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }

            if (!isInputFilled(workers_profile_salary)) {
                Toast.makeText(WorkersProfileActivity.this, "Salary kodu field is not entered.",
                        Toast.LENGTH_SHORT).show();
            }


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                if (allTextInputs.get()) {
                    //TextInputLayout
                    workersProfileMap.put("workers_profile_name", workers_profile_name.getEditText()
                            .getText().toString());
                    workersProfileMap.put("workers_profile_tc_no", workers_profile_tc_no.getEditText()
                            .getText().toString());
                    workersProfileMap.put("workers_profile_address", workers_profile_address.getEditText()
                            .getText().toString());
                    workersProfileMap.put("workers_profile_position", workers_profile_position.getEditText()
                            .getText().toString());
                    workersProfileMap.put("workers_profile_salary", Double.parseDouble(workers_profile_salary.getEditText()
                            .getText().toString()));
                    workersProfileMap.put("workers_profile_year_of_entering", workers_profile_year_of_entering
                            .getEditText().getText().toString());
                    workersProfileMap.put("workers_profile_mezuniyet", workers_profile_mezuniyet.getEditText()
                            .getText().toString());
                    workersProfileMap.put("workers_profile_mezuniyet_yili", Integer.parseInt(workers_profile_mezuniyet_yili
                            .getEditText().getText().toString()));
                    workersProfileMap.put("workers_profile_date_of_born", workers_profile_date_of_born.getEditText()
                            .getText().toString());
                    workersProfileMap.put("workers_profile_meslek_kodu", workers_profile_meslek_kodu.getEditText()
                            .getText().toString());

                    if (!Objects.requireNonNull(workers_profile_ssk_tesvik.getEditText())
                            .getText().toString().equals("")) {
                        workersProfileMap.put("workers_profile_ssk_tesvik",
                                Double.parseDouble(workers_profile_ssk_tesvik.getEditText()
                                .getText().toString()));
                    } else {
                        workersProfileMap.put("workers_profile_ssk_tesvik", "");
                    }



                    //AutoCompleteTextView
                    workersProfileMap.put("workers_profile_city_auto", workers_profile_city_auto.getText().toString());
                    workersProfileMap.put("workers_profile_ilce_auto", workers_profile_ilce_auto.getText().toString());
                    workersProfileMap.put("workers_profile_sgk_auto", workers_profile_sgk_auto.getText().toString());

                    Toast.makeText(WorkersProfileActivity.this, "Everything is correct",
                            Toast.LENGTH_SHORT).show();

                    //FirebaseDatabase.getInstance("https://accountantparadise-4549.europe-west1.firebasedatabase.app/")
                    //       .getReference().child("accountant-workers-data").setValue(workersProfileMap);
                }
            }


        });



    }

    private void calculateSalary() {
        String salaryBeforeTaxes = workers_profile_salary.getEditText().getText().toString();
        double salaryBeforeTaxesDouble = Integer.parseInt(salaryBeforeTaxes);
        double salaryAfterTaxesDouble;

        // SSK primi işçinin payı = Brüt ücret x %14
        // İşsizlik sigortası işçinin payı = Brüt ücret x %1
        salaryAfterTaxesDouble = salaryBeforeTaxesDouble * 0.85;

        // Damga vergisi miktarı = Brüt ücret x 0,00759
        salaryAfterTaxesDouble -= salaryBeforeTaxesDouble * 0.00759;


        workers_profile_summation_data_tv.setText("Brüt ücret: " + salaryBeforeTaxesDouble +
                ", Net ücret: " + salaryAfterTaxesDouble);

    }

    private boolean isInputFilled(TextInputLayout inputLayout) {
        if (inputLayout.getEditText().getText().toString().matches("")) {
            return false;
        } else
            return true;
    }
}