package com.example.firedetectionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class report extends AppCompatActivity {
    int xCord, yCord;

    EditText yInput;
    EditText xInput;
    Button submitBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        xInput = (EditText)findViewById(R.id.xInput);
        yInput = (EditText)findViewById(R.id.yInput);

        submitBut= (Button)findViewById(R.id.submitBut);
        submitBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xCord=Integer.valueOf(xInput.getText().toString());
                yCord=Integer.valueOf(yInput.getText().toString());
                Toast.makeText(getApplicationContext(), "Thank You For Your Assistance", Toast.LENGTH_LONG).show();
                Log.i("x", String.valueOf(xCord));
                Log.i("y", String.valueOf(yCord));

                Intent change=new Intent(report.this, MainActivity.class);
                startActivity(change);
            }
        });


    }
}
