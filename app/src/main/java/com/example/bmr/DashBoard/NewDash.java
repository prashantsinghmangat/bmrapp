package com.example.bmr.DashBoard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bmr.IpBmrFolder.IpPatient;
import com.example.bmr.R;

public class NewDash extends AppCompatActivity {
    Button button, button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newdash);

        button1=(Button) findViewById(R.id.button25);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NewDash.this, PatientDetails.class);
                startActivity(intent);
            }
        });

        button1=(Button) findViewById(R.id.btnBarcode);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NewDash.this, ScanedBarcode.class);
                startActivity(intent);
            }
        });
        button2=(Button) findViewById(R.id.button1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NewDash.this, IpPatient.class);
                startActivity(intent);
            }
        });
        button=(Button) findViewById(R.id.AddPatient);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NewDash.this, AddPatients.class);
                startActivity(intent);
            }
        });
    }
}
