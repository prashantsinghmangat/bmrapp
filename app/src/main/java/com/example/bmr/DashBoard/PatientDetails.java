package com.example.bmr.DashBoard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bmr.OpBmrFolder.OpBmr1;
import com.example.bmr.OpBmrFolder.RestraintOpbmr;
import com.example.bmr.OpBmrFolder.TherapyOpbmr;
import com.example.bmr.OpBmrFolder.assessementOpbmr;
import com.example.bmr.R;

public class PatientDetails extends AppCompatActivity {
    Button button2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        button2=(Button) findViewById(R.id.OpBmr);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PatientDetails.this, OpBmr1.class);
                startActivity(intent);
            }
        });

        button=(Button) findViewById(R.id.assessementOpbmr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PatientDetails.this, assessementOpbmr.class);
                startActivity(intent);
            }
        });

        button=(Button) findViewById(R.id.TherapyIpbmr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PatientDetails.this, TherapyOpbmr.class);
                startActivity(intent);
            }
        });
        button=(Button) findViewById(R.id.btnRestraintIp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PatientDetails.this, RestraintOpbmr.class);
                startActivity(intent);
            }
        });

    }
}
