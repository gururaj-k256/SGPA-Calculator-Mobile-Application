package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class FifthSemise extends AppCompatActivity {

    public void calculate(View view) {
        EditText mlg = findViewById(R.id.mlg);
        String MLG = mlg.getText().toString();
        int MLGmarks = Integer.parseInt(MLG);

        EditText clc = findViewById(R.id.clc);
        String CLC = clc.getText().toString();
        int CLCMarks = Integer.parseInt(CLC);

        EditText cn = findViewById(R.id.cn);
        String CN = cn.getText().toString();
        int CNMarks = Integer.parseInt(CN);

        EditText seo = findViewById(R.id.seo);
        String SEO= seo.getText().toString();
        int SEOMarks = Integer.parseInt(SEO);

        EditText emr= findViewById(R.id.emr);
        String EMR= emr.getText().toString();
        int EMRMarks = Integer.parseInt(EMR);

        EditText mad = findViewById(R.id.mad);
        String MAD = mad.getText().toString();
        int MADMarks = Integer.parseInt(MAD);

        EditText pe1 = findViewById(R.id.pe1);
        String PE1 = pe1.getText().toString();
        int PE1Marks = Integer.parseInt(PE1);


        EditText pe2 = findViewById(R.id.pe2);
        String PE2 = pe2.getText().toString();
        int PE2Marks = Integer.parseInt(PE2);

        int credits = 25;
        double sgpa = (4*gpoints(MLGmarks) + 3*gpoints(CLCMarks) + 4*gpoints(CNMarks) + 4*gpoints(SEOMarks) + 2*gpoints(EMRMarks) + 2*gpoints(MADMarks) + 3*gpoints(PE1Marks) + 3*gpoints(PE2Marks)) / (double) credits;

        String gpa = Double.toString(sgpa);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FifthSemise.this);
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
        Intent intent = new Intent(FifthSemise.this, MainActivity.class);
        startActivity(intent);
    }

    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            FifthSemise.this.finish();
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
        setContentView(R.layout.activity_fifth_semise);
    }
}