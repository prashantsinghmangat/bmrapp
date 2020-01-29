package com.example.bmr.login;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bmr.DashBoard.NavigationDrawer;
import com.example.bmr.R;

public class MainActivity extends AppCompatActivity {

    TextView testView;
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testView=(TextView)findViewById(R.id.txt_view);
        testView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, NavigationDrawer.class);
                startActivity(intent);
            }
        });

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);

        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
                Log.d("login credientals pass", "login credientals pass");
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("p")) && (userPassword.equals("1"))){
            Intent intent = new Intent(MainActivity.this, SelectMhe.class);
            startActivity(intent);
            Log.d("login pass", "login  pass");
        }else{
            counter--;

            Info.setText("No of attempts remaining: " + String.valueOf(counter));
            Log.d("login not pass", "login  not pass");

            if(counter == 0){
                Login.setEnabled(false);
                Log.d("login false pass", "login false  pass");
            }
        }
    }

}