package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {

    EditText Title;
    Button sendBtn;
    EditText Mess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title=( EditText)findViewById(R.id.title);
        Mess=(EditText) findViewById(R.id.messege);

        sendBtn=(Button) findViewById(R.id.button);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmail(Title.getText().toString(),Mess.getText().toString(),"bsef20a518@pucit.edu.pk");
            }
        });
    }
    public void sendEmail(String subject,String Mess_ege,String Rec )
    {

        Intent email= new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,Rec);
        email.putExtra(Intent.EXTRA_SUBJECT, subject);
        email.putExtra(Intent.EXTRA_TEXT,Mess_ege);

        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email,"Choose Email Address :"));

    }

}

