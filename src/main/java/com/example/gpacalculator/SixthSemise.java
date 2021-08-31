package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SixthSemise extends AppCompatActivity {

    public void calculate(View view) {
        EditText cns = findViewById(R.id.cns);
        String CNS = cns.getText().toString();
        int CNSmarks = Integer.parseInt(CNS);

        EditText con = findViewById(R.id.con);
        String CON = con.getText().toString();
        int CONMarks = Integer.parseInt(CON);

        EditText stg = findViewById(R.id.stg);
        String STG = stg.getText().toString();
        int STGMarks = Integer.parseInt(STG);

        EditText pmf = findViewById(R.id.pmf);
        String PMF= pmf.getText().toString();
        int PMFMarks = Integer.parseInt(PMF);

        EditText pe3= findViewById(R.id.pe3);
        String PE3= pe3.getText().toString();
        int PE3Marks = Integer.parseInt(PE3);

        EditText pe4 = findViewById(R.id.pe4);
        String PE4 = pe4.getText().toString();
        int PE4Marks = Integer.parseInt(PE4);

        EditText oe1 = findViewById(R.id.oe1);
        String OE1 = oe1.getText().toString();
        int OE1Marks = Integer.parseInt(OE1);

        EditText mpr = findViewById(R.id.mpr);
        String MPR = mpr.getText().toString();
        int MPRMarks = Integer.parseInt(MPR);


        EditText itr = findViewById(R.id.itr);
        String ITR = itr.getText().toString();
        int ITRMarks = Integer.parseInt(ITR);

        int credits = 25;
        double sgpa = (3*gpoints(CNSmarks) + 4*gpoints(CONMarks) + 4*gpoints(STGMarks) + 2*gpoints(PMFMarks) + 3*gpoints(PE3Marks) + 3*gpoints(PE4Marks) + 3*gpoints(OE1Marks) + 2*gpoints(MPRMarks) + 1*gpoints(ITRMarks)) / (double) credits;

        String gpa = Double.toString(sgpa);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SixthSemise.this);
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
        Intent intent = new Intent(SixthSemise.this, MainActivity.class);
        startActivity(intent);
    }

    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            SixthSemise.this.finish();
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
        setContentView(R.layout.activity_sixth_semise);
    }
}