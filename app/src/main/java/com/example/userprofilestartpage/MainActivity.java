package com.example.userprofilestartpage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private Button signout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // CardView 1
        CardView user_btn1 = findViewById(R.id.user_btn1);
        user_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(MainActivity.this, .class);
                //startActivity(intent);
            }
        });

        // CardView 2
        CardView user_btn2 = findViewById(R.id.user_btn2);
        user_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(MainActivity.this, .class);
                // startActivity(intent);
            }
        });

        // CardView 3
        CardView user_btn3 = findViewById(R.id.user_btn3);
        user_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(MainActivity.this, .class);
                // startActivity(intent);
            }
        });

        // CardView 4
        CardView user_btn4 = findViewById(R.id.user_btn4);
        user_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(MainActivity.this, .class);
                // startActivity(intent);
            }
        });

        // Sign-out button
        signout_btn = findViewById(R.id.signout_btn);
        signout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSmallDialog();
            }
        });

    }
    private void showSmallDialog() {
        // Create an AlertDialog.Builder instance
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Get the layout inflater
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View smallDialogLayout = inflater.inflate(R.layout.usermain_child, null);

        // Set the small dialog layout
        builder.setView(smallDialogLayout);

        // Create the dialog
        AlertDialog dialog = builder.create();

        // Show the dialog
        dialog.show();
    }
}
