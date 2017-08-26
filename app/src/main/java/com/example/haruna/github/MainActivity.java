package com.example.haruna.github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText("87");
        Toast.makeText(this,"456",Toast.LENGTH_SHORT).show();
    }
}
