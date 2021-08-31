package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EighthSemise extends AppCompatActivity {

    public void calculate(View view) {
        EditText gcg = findViewById(R.id.gcg);
        String GCG = gcg.getText().toString();
        int GCGmarks = Integer.parseInt(GCG);

        EditText oe3 = findViewById(R.id.oe3);
        String OE3 = oe3.getText().toString();
        int OE3Marks = Integer.parseInt(OE3);

        EditText cp2 = findViewById(R.id.cp2);
        String CP2 = cp2.getText().toString();
        int CP2Marks = Integer.parseInt(CP2);

        EditText sr4 = findViewById(R.id.sr4);
        String SR4 = sr4.getText().toString();
        int SR4Marks = Integer.parseInt(SR4);

        int credits = 16;
        double sgpa = (2*gpoints(GCGmarks) + 3*gpoints(OE3Marks) + 10*gpoints(CP2Marks) + 1*gpoints(SR4Marks)) / (double) credits;

        String gpa = Double.toString(sgpa);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(EighthSemise.this);
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
        Intent intent = new Intent(EighthSemise.this, MainActivity.class);
        startActivity(intent);
    }


    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            EighthSemise.this.finish();
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
        setContentView(R.layout.activity_eighth_semise);
    }
}