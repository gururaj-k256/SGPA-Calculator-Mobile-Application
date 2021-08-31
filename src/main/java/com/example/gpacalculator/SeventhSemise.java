package com.example.gpacalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SeventhSemise extends AppCompatActivity {

    public void calculate(View view) {
        EditText bio = findViewById(R.id.bio);
        String BIO = bio.getText().toString();
        int BIOmarks = Integer.parseInt(BIO);

        EditText clf = findViewById(R.id.clf);
        String CLF = clf.getText().toString();
        int CLFMarks = Integer.parseInt(CLF);

        EditText pe5 = findViewById(R.id.pe5);
        String PE5 = pe5.getText().toString();
        int PE5Marks = Integer.parseInt(PE5);

        EditText oe2 = findViewById(R.id.oe2);
        String OE2 = oe2.getText().toString();
        int OE2Marks = Integer.parseInt(OE2);

        EditText cp1= findViewById(R.id.cp1);
        String CP1= cp1.getText().toString();
        int CP1Marks = Integer.parseInt(CP1);

        EditText tls = findViewById(R.id.tls);
        String TLS = tls.getText().toString();
        int TLSMarks = Integer.parseInt(TLS);

        EditText imc = findViewById(R.id.imc);
        String IMC = imc.getText().toString();
        int IMCMarks = Integer.parseInt(IMC);


        EditText ist = findViewById(R.id.ist);
        String IST = ist.getText().toString();
        int ISTMarks = Integer.parseInt(IST);

        int credits = 19;
        double sgpa = (2*gpoints(BIOmarks) + 3*gpoints(CLFMarks) + 3*gpoints(PE5Marks) + 3*gpoints(OE2Marks) + 3*gpoints(CP1Marks) + 1*gpoints(TLSMarks) + 1*gpoints(IMCMarks) + 3*gpoints(ISTMarks)) / (double) credits;

        String gpa = Double.toString(sgpa);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SeventhSemise.this);
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
        Intent intent = new Intent(SeventhSemise.this, MainActivity.class);
        startActivity(intent);
    }

    public int gpoints(int marks)
    {
        if(marks > 100) {
            Toast.makeText(this, "Marks cannot be > 100", Toast.LENGTH_LONG).show();
            SeventhSemise.this.finish();
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
        setContentView(R.layout.activity_seventh_semise);
    }
}