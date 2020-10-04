package com.someofbeach.idkhtu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mode1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode1);
        setTitle("mode1");

        Button button1=(Button) findViewById(R.id.button_to_home);
        //Button button2=findViewById(R.id.button_to_mode2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(mode1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}