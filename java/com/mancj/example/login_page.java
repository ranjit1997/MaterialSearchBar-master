package com.mancj.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class login_page extends AppCompatActivity {
    Button button;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        button=findViewById(R.id.button);
        textView6=findViewById(R.id.textView6);

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_page.this, Create_account.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(login_page.this,"Login successful...",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login_page.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
