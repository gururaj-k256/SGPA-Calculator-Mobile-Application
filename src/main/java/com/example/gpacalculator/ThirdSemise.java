package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdSemise extends AppCompatActivity {

    public void calculate(View view) {
        EditText os = findViewById(R.id.os);
        String OS = os.getText().toString();
        int OSmarks = Integer.parseInt(OS);

        EditText dsc = findViewById(R.id.dsc);
        String DSC = dsc.getText().toString();
        int DSCMarks = Integer.parseInt(DSC);

        EditText oops = findViewById(R.id.oops);
        String OOPS = oops.getText().toString();
        int OOPSMarks = Integer.parseInt(OOPS);

        EditText dld = findViewById(R.id.dld);
        String DLD = dld.getText().toString();
        int DLDMarks = Integer.parseInt(DLD);

        EditText sdm = findViewById(R.id.sdm);
        String SDM= sdm.getText().toString();
        int SDMMarks = Integer.parseInt(SDM);

        EditText evs= findViewById(R.id.evs);
        String EVS= evs.getText().toString();
        int EVSMarks = Integer.parseInt(EVS);

        EditText wad = findViewById(R.id.wad);
        String WAD= wad.getText().toString();
        int WADMarks = Integer.parseInt(WAD);


        EditText coa = findViewById(R.id.coa);
        String COA = coa.getText().toString();
        int COAMarks = Integer.parseInt(COA);

        int credits = 25;
        double sgpa = (4*gpoints(OSmarks) + 4*gpoints(DSCMarks) + 4*gpoints(OOPSMarks) + 3*gpoints(DLDMarks) + 4*gpoints(SDMMarks) + 1*gpoints(EVSMarks) + 2*gpoints(WADMarks) + 3*gpoints(COAMarks)) / (double) credits;

        String gpa = Double.toString(sgpa);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ThirdSemise.this);
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
        Intent intent = new Intent(ThirdSemise.this, MainActivity.class);
        startActivity(intent);
    }

    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            ThirdSemise.this.finish();
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
        setContentView(R.layout.activity_third_semise);
    }
}