package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondSem extends AppCompatActivity {

    public void calculate(View view) {
        EditText m2 = findViewById(R.id.m2);
        String M2 = m2.getText().toString();
        int M2marks = Integer.parseInt(M2);

        EditText phy = findViewById(R.id.phy);
        String Phy = phy.getText().toString();
        int PhyMarks = Integer.parseInt(Phy);

        EditText bee = findViewById(R.id.bee);
        String Bee = bee.getText().toString();
        int BeeMarks = Integer.parseInt(Bee);

        EditText ccp = findViewById(R.id.ccp);
        String Ccp = ccp.getText().toString();
        int CcpMarks = Integer.parseInt(Ccp);

        EditText eme = findViewById(R.id.eme);
        String Eme = eme.getText().toString();
        int EmeMarks = Integer.parseInt(Eme);

        int credits = 20;
        double sgpa = (4*M2marks + 5*PhyMarks + 4*BeeMarks + 4*CcpMarks + 3*EmeMarks) / (double) credits;

        String gpa = Double.toString(sgpa);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SecondSem.this);
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
        Intent intent = new Intent(SecondSem.this, MainActivity.class);
        startActivity(intent);
    }

    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            SecondSem.this.finish();
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
        setContentView(R.layout.activity_second_sem);
    }
}