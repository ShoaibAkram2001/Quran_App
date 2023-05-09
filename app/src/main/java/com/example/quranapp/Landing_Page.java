package com.example.quranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Landing_Page extends AppCompatActivity {

    Button contactBtn;
    Button GithubBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        contactBtn=(Button)findViewById(R.id.contact);
        GithubBtn=(Button) findViewById((R.id.github));

        GithubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToGithub("https://github.com/ShoaibAkram2001/Android-Projects.git");
            }
        });

        contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Landing_Page.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
   public void goToGithub(String s)
    {
        Uri uri=Uri.parse(s);

        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity((i));

    }

}

