package com.codepath.apps.restclienttemplate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ComposeActivity extends AppCompatActivity {

    EditText etCompose;
    Button btnTweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);


        etCompose = findViewById(R.id.etCompose);
        btnTweet = findViewById(R.id.btnTweet);

        btnTweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tweetBody = etCompose.getText().toString();
                if (tweetBody.isEmpty()) {
                    Toast.makeText(ComposeActivity.this, "Sorry, the Tweet cannot be empty.", Toast.LENGTH_LONG).show();
                    return;
                }
                if (tweetBody.length() > 280) {
                    Toast.makeText(ComposeActivity.this, "Sorry, the Tweet is too long.", Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(ComposeActivity.this, "Tweet was good.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
