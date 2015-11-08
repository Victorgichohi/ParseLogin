package com.victor.m.parselogintutorial;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by victor on 11/8/15.
 */
public class MyIntro extends AppIntro {

    // Please DO NOT override onCreate. Use init
    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here
        // AppIntro will automatically generate the dots indicator and buttons
        // title,description,image,color
        addSlide(AppIntroFragment.newInstance("Welcome To ParkPAy", "Where all parking payment is made easier through mobile.Lets take a tour",
                R.drawable.transport122,
                Color.parseColor("#FF9E21")));

        addSlide(AppIntroFragment.newInstance("Flexible Payment Schedule","One Day" + "One Week" + "Or A Month",
                R.drawable.businessman270,
                Color.parseColor("#E821E8")));

        addSlide(AppIntroFragment.newInstance("Variety of payment methods.", "You can pay using visa,MasterCard and Paypal",
                R.drawable.smartphone188,
                Color.parseColor("#272730")));

        addSlide(AppIntroFragment.newInstance("ThankYou", "Parking has never been easier.",
                R.drawable.jumping28,
                Color.parseColor("#4F0DFF")));


        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest


        // OPTIONAL METHODS
        // Override bar/separator color
//        setBarColor(Color.parseColor("#3F51B5"));
//        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(false);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Intent skip= new Intent(MyIntro.this,MainActivity.class);
        startActivity(skip);
        finish();


    }


    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Intent done= new Intent(MyIntro.this,MainActivity.class);
        startActivity(done);
        finish();

    }
}


