package com.victor.m.parselogintutorial;

/**
 * Created by victor on 11/6/15.
 */
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here

        Parse.initialize(this, "jh5Sf1tioKsMd2HJKanNybyHQeZvtEx5PmRYfXN9", "mbEejIkVJ0ewCezlJcGZbFSuOb6FeiQIsXDCPPac");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}