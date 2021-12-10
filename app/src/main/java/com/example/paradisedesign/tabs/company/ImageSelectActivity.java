package com.example.paradisedesign.tabs.company;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.paradisedesign.R;

public class ImageSelectActivity extends AppCompatActivity {

    private ImageView imageProfile;
    private Button companyEditUpdatePhotoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_profile_image_select);

        imageProfile = findViewById(R.id.image_profile);
        companyEditUpdatePhotoButton = findViewById(R.id.company_edit_update_photo_button);

    }
}