package com.example.userprofilestartpage;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class usermainchild extends AppCompatActivity {

    private Button cancel_btn;
    private Button signout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usermain_child);

        cancel_btn = findViewById(R.id.cancel_btn);
        signout_btn = findViewById(R.id.signout_btn);

        // Handle the back button click
        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(usermainchild.this, MainActivity.class);
                startActivity(intent);
                
            }
        });
        signout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //log out code database
               // Intent intent = new Intent(usermainchild.this, MainActivity.class);
                // startActivity(intent);
            }
        });
    }



}
