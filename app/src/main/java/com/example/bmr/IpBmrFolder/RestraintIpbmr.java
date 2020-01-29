package com.example.bmr.IpBmrFolder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bmr.DashBoard.NewDash;
import com.example.bmr.OpBmrFolder.assessementOpbmr;
import com.example.bmr.R;

public class RestraintIpbmr extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraint_ipbmr);

        button=(Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(RestraintIpbmr.this, NewDash.class);
                startActivity(intent);
            }
        });
    }
}
