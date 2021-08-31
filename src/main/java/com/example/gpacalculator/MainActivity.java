package com.example.gpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean checkIfDetailsValid(int semester, String department, String userName)
    {
        if(semester < 1 || semester > 8)
        {
            String mssg = "Invalid semester";
            Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
            return false;
        }
        if(department.length() < 3)
        {
            String mssg = "Invalid department";
            Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
            return false;
        }
        if(userName.length() < 2)
        {
            String mssg = "Invalid username";
            Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public void takeMarks(View view)
    {
        EditText username = findViewById(R.id.username);
        String userName = username.getText().toString();

        EditText dept = findViewById(R.id.dept);
        String dept2 = dept.getText().toString();
        String department = dept2.toLowerCase();

        EditText sem = findViewById(R.id.sem);
        String semString = sem.getText().toString();
        int semester = Integer.parseInt(semString);

        if(checkIfDetailsValid(semester, department, userName))
        {
            if(semester == 1)
            {
//            go to 1st sem subjects
                Intent intent = new Intent(MainActivity.this, FirstSem.class);
                startActivity(intent);
            }
            else if(semester == 2)
            {
                //go to 2nd sem subjects
                Intent intent = new Intent(MainActivity.this, SecondSem.class);
                startActivity(intent);
            }
            else if(semester == 3)
            {
                if(department.contentEquals("ise"))
                {
                    //go to 3rd sem ise
                    Intent intent = new Intent(MainActivity.this, ThirdSemise.class);
                    startActivity(intent);
                }
                else if(department.contentEquals("cse"))
                {
                    //go to 3rd sem cse
                }
                else if(department.contentEquals("ece"))
                {
                    //go to 3rd sem ece
                }
                else
                {
                    String mssg = "We currently have database for ISE, CSE and ECE";
                    Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
                }

            }
            else if(semester == 4)
            {
                if(department.contentEquals("ise"))
                {
                    //go to 4th sem ise
                    Intent intent = new Intent(MainActivity.this, FourthSemise.class);
                    startActivity(intent);
                }
                else if(department.contentEquals("cse"))
                {
                    //go to 4th sem cse
                }
                else if(department.contentEquals("ece"))
                {
                    //go to 4th sem ece
                }
                else
                {
                    String mssg = "We currently have database for ISE, CSE and ECE";
                    Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
                }

            }

            else if(semester == 5)
            {
                if(department.contentEquals("ise"))
                {
                    //go to 5th sem ise
                    Intent intent = new Intent(MainActivity.this, FifthSemise.class);
                    startActivity(intent);
                }
                else if(department.contentEquals("cse"))
                {
                    //go to 5th sem cse
                }
                else if(department.contentEquals("ece"))
                {
                    //go to 5th sem ece
                }
                else
                {
                    String mssg = "We currently have database for ISE, CSE and ECE";
                    Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
                }

            }

            else if(semester == 6)
            {
                if(department.contentEquals("ise"))
                {
                    //go to 6th sem ise
                    Intent intent = new Intent(MainActivity.this, SixthSemise.class);
                    startActivity(intent);
                }
                else if(department.contentEquals("cse"))
                {
                    //go to 6th sem cse
                }
                else if(department.contentEquals("ece"))
                {
                    //go to 6th sem ece
                }
                else
                {
                    String mssg = "We currently have database for ISE, CSE and ECE";
                    Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
                }

            }

            else if(semester == 7)
            {
                if(department.contentEquals("ise"))
                {
                    //go to 7th sem ise
                    Intent intent = new Intent(MainActivity.this, SeventhSemise.class);
                    startActivity(intent);
                }
                else if(department.contentEquals("cse"))
                {
                    //go to 7th sem cse
                }
                else if(department.contentEquals("ece"))
                {
                    //go to 7th sem ece
                }
                else
                {
                    String mssg = "We currently have database for ISE, CSE and ECE";
                    Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
                }

            }

            else if(semester == 8)
            {
                if(department.contentEquals("ise"))
                {
                    //go to 8th sem ise
                    Intent intent = new Intent(MainActivity.this, EighthSemise.class);
                    startActivity(intent);
                }
                else if(department.contentEquals("cse"))
                {
                    //go to 8th sem cse
                }
                else if(department.contentEquals("ece"))
                {
                    //go to 8th sem ece
                }
                else
                {
                    String mssg = "We currently have database for ISE, CSE and ECE";
                    Toast.makeText(this, mssg, Toast.LENGTH_LONG).show();
                }

            }
        }

        else
            Toast.makeText(this, "Enter Valid Info!", Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}