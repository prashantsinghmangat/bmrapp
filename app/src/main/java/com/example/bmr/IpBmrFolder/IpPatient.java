package com.example.bmr.IpBmrFolder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bmr.R;

public class IpPatient extends AppCompatActivity {
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip_patient);

        button2=(Button) findViewById(R.id.IpBmr);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(IpPatient.this, IpBmr.class);
                startActivity(intent);
            }
        });

        button=(Button) findViewById(R.id.assessementIpbmr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(IpPatient.this, AssessementIpbmr.class);
                startActivity(intent);
            }
        });

        button=(Button) findViewById(R.id.TherapyIpbmr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(IpPatient.this, TherapyIpbmr.class);
                startActivity(intent);
            }
        });
        button=(Button) findViewById(R.id.btnRestraintIp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(IpPatient.this, RestraintIpbmr.class);
                startActivity(intent);
            }
        });
    }
}
