package com.victor.m.parselogintutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


/**
 * Created by victor on 11/9/15.
 */
public class signup extends Activity {
    Button signup;
    String firstnametxt;
    String lastnametxt;
    String phonenumtxt;
    String idnumtxt;
    String emailtxt;
    String pinnumtxt;
    String usernametxt;

    EditText usernameone;
    EditText firstname;
    EditText lastname;
    EditText phonenum;
    EditText idnum;
    EditText email;
    EditText pinnum;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        firstname= (EditText) findViewById(R.id.firstnametext);
        lastname= (EditText) findViewById(R.id.lastnametext);
        phonenum= (EditText) findViewById(R.id.phonenumbertext);
        idnum= (EditText) findViewById(R.id.idnumbertext);
        email= (EditText) findViewById(R.id.emailtext);
        pinnum= (EditText) findViewById(R.id.pintext);
        usernameone=(EditText) findViewById(R.id.usernametext);

        signup=(Button) findViewById(R.id.mainsignup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                firstnametxt=firstname.getText().toString();
                lastnametxt=lastname.getText().toString();
                phonenumtxt=phonenum.getText().toString();
                idnumtxt=idnum.getText().toString();
                emailtxt=email.getText().toString();
                pinnumtxt=pinnum.getText().toString();
                usernametxt=usernameone.getText().toString();

                if (firstnametxt.equals("") || lastnametxt.equals("")|| phonenumtxt.equals("")
                        || idnumtxt.equals("")|| emailtxt.equals("")||
                        pinnumtxt.equals("")|| usernametxt.equals("")){
                    Toast.makeText(getApplicationContext(),
                            "Please finish the application form",
                            Toast.LENGTH_LONG).show();
                }else {
                    ParseUser user = new ParseUser();
                    user.setUsername(String.valueOf(usernameone));
                    user.setPassword(pinnumtxt);
                    user.signUpInBackground(new SignUpCallback() {
                        @Override
                        public void done(ParseException e) {
                            if (e==null){
                                Toast.makeText(getBaseContext(),
                                        "successfully Signed up",
                                        Toast.LENGTH_LONG).show();
                                Intent intent=new Intent(signup.this,Welcome.class);
                            }else {
                                Toast.makeText(getApplicationContext(),
                                        "error signing up",
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }


            }
        });


    }
}
