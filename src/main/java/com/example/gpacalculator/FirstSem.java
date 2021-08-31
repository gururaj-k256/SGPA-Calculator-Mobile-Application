package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

interface allSem{
    void calculate(View view);
    void goBack(View view);
    int gpoints(int m);
}

public class FirstSem extends AppCompatActivity implements allSem{

    public void calculate(View view) {

        int M1marks, ChemMarks, EedMarks, EnmMarks, EleMarks;

        EditText m1 = findViewById(R.id.m1);
        String M1 = m1.getText().toString();
        M1marks = Integer.parseInt(M1);

        EditText chem = findViewById(R.id.chem);
        String Chem = chem.getText().toString();
        ChemMarks = Integer.parseInt(Chem);

        EditText eed = findViewById(R.id.eed);
        String Eed = eed.getText().toString();
        EedMarks = Integer.parseInt(Eed);

        EditText ele = findViewById(R.id.ele);
        String Ele = ele.getText().toString();
        EleMarks = Integer.parseInt(Ele);

        EditText enm = findViewById(R.id.enm);
        String Enm = enm.getText().toString();
        EnmMarks = Integer.parseInt(Enm);

        int credits = 20;
        double sgpa = (4*gpoints(M1marks) + 5*gpoints(ChemMarks) + 3*gpoints(EedMarks) + 4*gpoints(EleMarks) + 4*gpoints(EnmMarks)) / (double) credits;

        String gpa = Double.toString(sgpa);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FirstSem.this);
        alertDialogBuilder
                .setTitle("Congrats!!")
                .setMessage("You have scored: " +gpa+ " SGPA")
                .setNegativeButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }

    public void goBack(View view)
    {
        Intent intent = new Intent(FirstSem.this, MainActivity.class);
        startActivity(intent);
    }

    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            FirstSem.this.finish();
            System.exit(0);
        }
        if(marks >= 90)
            return 10;
        if(marks >= 80)
            return 9;
        if(marks >= 70)
            return 8;
        if(marks >= 60)
            return 7;
        if(marks >= 50)
            return 6;
        if(marks >= 40)
            return 4;
        return 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_sem2);
    }
}