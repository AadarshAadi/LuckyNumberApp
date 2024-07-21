package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class first_actve extends AppCompatActivity {
    public Button wish1;
    public EditText e1;
    public String name;
    protected void onCreate(Bundle ins) {
        super.onCreate(ins);
        setContentView(R.layout.first_active);
        wish1=findViewById(R.id.wish);
        e1=findViewById(R.id.name);
        this.name=e1.getText().toString();
        wish1.setOnClickListener(view -> {
            if(e1.getText().toString().length()>=1)
            {
                show2();
            }
        });
    }
    protected void show2()
    {
        Intent intert= new Intent(this,second_active.class);
        intert.putExtra("name",name);
        startActivity(intert);
    }
}
