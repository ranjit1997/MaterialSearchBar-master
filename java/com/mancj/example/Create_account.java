package com.mancj.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//spinner
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Create_account extends Activity implements OnItemSelectedListener {
    Button button;
    TextView textView3;
//    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        button=findViewById(R.id.button);
        textView3=findViewById(R.id.textView3);
//        toolbar=findViewById(R.id.toolbar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Create_account.this,login_page.class);
                startActivity(intent);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Create_account.this,login_page.class);
                startActivity(intent);
            }
        });
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Select District");
        categories.add("Ahmednagar");
        categories.add("Akola");
        categories.add("Amravati");
        categories.add("Aurangabad");
        categories.add("Beed");
        categories.add("Bhandara");
        categories.add("Buldhana");
        categories.add("Chandrapur");
        categories.add("Dhule");
        categories.add("Gadchirole");
        categories.add("Gondia");
        categories.add("Hingoli");
        categories.add("Jalgaon");
        categories.add("Jalna");
        categories.add("Kolhapur");
        categories.add("Latur");
        categories.add("Mumbai City");
        categories.add("Mumbai Suburban");
        categories.add("Nagpur");
        categories.add("Nanded");
        categories.add("Nandurbar");
        categories.add("Nashik");
        categories.add("Osmanabad");
        categories.add("Palghar");
        categories.add("Parbhani");
        categories.add("Pune");
        categories.add("Raigad");
        categories.add("Ratnagiri");
        categories.add("Sangli");
        categories.add("Satara");
        categories.add("Sindhudurg");
        categories.add("Solapur");
        categories.add("Thane");
        categories.add("Wardha");
        categories.add("Washim");
        categories.add("Yavatmal");



        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - listitem view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
//        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
