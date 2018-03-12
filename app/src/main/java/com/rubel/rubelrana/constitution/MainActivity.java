package com.rubel.rubelrana.constitution;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.btn1);
        bt2 = (Button) findViewById(R.id.btn2);
        bt3 = (Button) findViewById(R.id.btn3);
        bt4 = (Button) findViewById(R.id.btn4);
        bt5 = (Button) findViewById(R.id.btn5);
        bt6 = (Button) findViewById(R.id.btn6);
        bt7 = (Button) findViewById(R.id.btn7);
        bt8 = (Button) findViewById(R.id.btn8);
        bt9 = (Button) findViewById(R.id.btn9);
        bt10 = (Button) findViewById(R.id.btn10);
        bt11 = (Button) findViewById(R.id.btn11);
        bt12 = (Button) findViewById(R.id.btn12);
        bt13 = (Button) findViewById(R.id.btn13);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(b1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b2 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(b2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b3 = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(b3);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b4 = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(b4);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b5 = new Intent(MainActivity.this,Main6Activity.class);
                startActivity(b5);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b6 = new Intent(MainActivity.this,Main7Activity.class);
                startActivity(b6);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b7 = new Intent(MainActivity.this,Main8Activity.class);
                startActivity(b7);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b8 = new Intent(MainActivity.this,Main9Activity.class);
                startActivity(b8);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b9 = new Intent(MainActivity.this,Main10Activity.class);
                startActivity(b9);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b10 = new Intent(MainActivity.this,Main11Activity.class);
                startActivity(b10);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b11 = new Intent(MainActivity.this,Main12Activity.class);
                startActivity(b11);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b12 = new Intent(MainActivity.this,Main13Activity.class);
                startActivity(b12);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b13 = new Intent(MainActivity.this,Main14Activity.class);
                startActivity(b13);
            }
        });
    }
}
