package com.example.luckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

public class second_active extends AppCompatActivity {
    public Button b1;
    public TextView t2;
    public String s1;
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_active);
        rng();
    }
    public void rng()
    {
        t2=findViewById(R.id.textView3);
        Random rand = new Random();
        s1 = Integer.toString(rand.nextInt(101));
        t2.setText(s1);
    }
    public void sharenum(View view)
    {
        Intent i = getIntent();
        String name1=i.getStringExtra("name");
        Intent send=new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_SUBJECT,name1+" got lucky today.");
        send.putExtra(Intent.EXTRA_TEXT,"Their lucky number is: "+s1);
        startActivity(Intent.createChooser(send,"Choose a Platform"));
    }
}
