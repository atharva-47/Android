package com.example.classroom;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import CS6.Activity_lifecycle;
import CS6.Hello_World;
import CS6.Password_program;
import CS6.Sender;
import CS6.Student_info;
import CS6.palinDrome;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button implicit,pwd , helloworld, activity_lifecyle,send_hello,studinfo,palindrome;
        implicit = findViewById(R.id.implicit);

        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,CS6.MainActivity.class);
                startActivity(i);
            }
        });

        pwd = findViewById(R.id.pwd);

        pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Password_program.class);
                startActivity(i);
            }
        });

        helloworld = findViewById(R.id.hello);
        helloworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Hello_World.class);
                startActivity(i);
            }
        });

        activity_lifecyle = findViewById(R.id.activity_lifecycle);
        activity_lifecyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Activity_lifecycle.class);
                startActivity(i);
            }
        });

        send_hello = findViewById(R.id.send_hello_tofile);
        send_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Sender.class);
                startActivity(i);
            }
        });

        studinfo = findViewById(R.id.studinfobutton);
        studinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Student_info.class);
                startActivity(i);
            }
        });

        palindrome = findViewById(R.id.palindrome);
        palindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, palinDrome.class);
                startActivity(i);
            }
        });
    }

}
