//In this activity, we have created a Log Out button and a simple welcome text message
// to show with the current username.
// The Log Out button will clear the current logged in user cache data on disk.
// We used “ParseUser. getCurrentUser()” and called “currentUser.getUsername()” to retrieve
// the current logged username.
// Then display the username on a textview together with the welcome message.


package com.victor.m.parselogintutorial;

/**
 * Created by victor on 11/6/15.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.parse.ParseUser;

public class Welcome extends Activity {

    // Declare Variable
    Button logout;
    Button park;

    private com.github.clans.fab.FloatingActionButton fab1;

    private com.github.clans.fab.FloatingActionButton welcome2;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from singleitemview.xml
        setContentView(R.layout.welcome);

        // Retrieve current user from Parse.com
//        ParseUser currentUser = ParseUser.getCurrentUser();

        // Convert currentUser into String
//        String struser = currentUser.getUsername().toString();

        // Locate TextView in welcome.xml
//        TextView txtuser = (TextView) findViewById(R.id.txtuser);

        // Set the currentUser String into TextView
//        txtuser.setText("You are logged in as " + struser);

        // Locate Button in welcome.xml
        logout = (Button) findViewById(R.id.logout);

        // Logout Button Click Listener
        logout.setOnClickListener( new OnClickListener() {

            public void onClick(View arg0) {
                // Logout current user
                Intent lognje = new Intent(Welcome.this,LoginSignupActivity.class);
                ParseUser.logOut();
                startActivity(lognje);
                finish();
            }


        });

        park = (Button) findViewById(R.id.Details);

        park.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Welcome.this, VehicleDetails.class);
                startActivity(p);
                finish();
            }
        });




        fab1 =(com.github.clans.fab.FloatingActionButton)findViewById(R.id.fab1);




        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m= new Intent(Welcome.this,LoginSignupActivity.class);
                ParseUser.logOut();
                startActivity(m);
                finish();
            }
        });

        welcome2= (com.github.clans.fab.FloatingActionButton) findViewById(R.id.welcome2);

        welcome2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent welc2 = new Intent(Welcome.this,Timer.class);
                startActivity(welc2);
                finish();
            }
        });

    }
}

