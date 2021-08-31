package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FourthSemise extends AppCompatActivity {

    public void calculate(View view) {
        EditText lia = findViewById(R.id.lia);
        String LIA= lia.getText().toString();
        int LIAmarks = Integer.parseInt(LIA);

        EditText dbms = findViewById(R.id.dbms);
        String DBMS = dbms.getText().toString();
        int DBMSMarks = Integer.parseInt(DBMS);

        EditText ada = findViewById(R.id.ada);
        String ADA = ada.getText().toString();
        int ADAMarks = Integer.parseInt(ADA);

        EditText java = findViewById(R.id.java);
        String JAVA = java.getText().toString();
        int JAVAMarks = Integer.parseInt(JAVA);

        EditText tfc = findViewById(R.id.tfc);
        String TFC= tfc.getText().toString();
        int TFCMarks = Integer.parseInt(TFC);

        EditText cph= findViewById(R.id.cph);
        String CPH = cph.getText().toString();
        int CPHMarks = Integer.parseInt(CPH);

        EditText smi = findViewById(R.id.smi);
        String SMI= smi.getText().toString();
        int SMIMarks = Integer.parseInt(SMI);


        EditText usp = findViewById(R.id.usp);
        String USP = usp.getText().toString();
        int USPMarks = Integer.parseInt(USP);

        int credits = 25;
        double sgpa = (4*gpoints(LIAmarks) + 4*gpoints(DBMSMarks) + 4*gpoints(ADAMarks) + 4*gpoints(JAVAMarks) + 4*gpoints(TFCMarks) + 1*gpoints(CPHMarks) + 1*gpoints(SMIMarks) + 2*gpoints(USPMarks)) / (double) credits;

        String gpa = Double.toString(sgpa);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FourthSemise.this);
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
        Intent intent = new Intent(FourthSemise.this, MainActivity.class);
        startActivity(intent);
    }

    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            FourthSemise.this.finish();
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
        setContentView(R.layout.activity_fourth_semise);
    }
}