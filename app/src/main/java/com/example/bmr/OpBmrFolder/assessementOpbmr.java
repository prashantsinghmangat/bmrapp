package com.example.bmr.OpBmrFolder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bmr.R;
import com.example.bmr.DashBoard.NewDash;


public class assessementOpbmr extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessement);

        button=(Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(assessementOpbmr.this, NewDash.class);
                startActivity(intent);
            }
        });
    }
}
