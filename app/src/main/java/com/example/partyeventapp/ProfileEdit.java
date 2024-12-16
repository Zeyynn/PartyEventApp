package com.example.partyeventapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileEdit extends AppCompatActivity {

    Button edit, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        edit = findViewById(R.id.btnEditProfile);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileEdit.this, Profile.class);
                startActivity(intent);
            }
        });

        back = findViewById(R.id.goToProfile);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileEdit.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}