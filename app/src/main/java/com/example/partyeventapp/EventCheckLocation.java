package com.example.partyeventapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EventCheckLocation extends AppCompatActivity {

    Button back, checklocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_check_location);

        back = findViewById(R.id.goToEvent);
        checklocation = findViewById(R.id.goToEvent);
        EditText mylocation = findViewById(R.id.getUrLoc);
        EditText mydestination = findViewById(R.id.getEventLoc);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventCheckLocation.this, EventList.class);

                startActivity(intent);
            }
        });

        checklocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String source = mylocation.getText().toString();
                String destination = mydestination.getText().toString();
                if(source.equals("") && destination.equals("")){
                    Toast.makeText(getApplicationContext(), "Enter both source and destination",
                            Toast.LENGTH_SHORT).show();

                }
                else {
                    Uri uri = Uri.parse("https://www.google.com/maps/dir/" + source + "/" + destination);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.setPackage("com.google.android.apps.maps");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });


    }
}