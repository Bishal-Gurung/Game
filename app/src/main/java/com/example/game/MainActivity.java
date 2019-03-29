package com.example.game;

import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvStatus;
    private TextView tvStatus1;
    private Button btn, btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        btn1=findViewById(R.id.btn1);
        tvStatus=findViewById(R.id.tvStatus);
        tvStatus1=findViewById(R.id.tvStatus1);


    }
}
