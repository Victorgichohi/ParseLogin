package com.victor.m.parselogintutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.github.clans.fab.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer extends Activity {

    private TextView txtTimerDay, txtTimerHour, txtTimerMinute, txtTimerSecond;

    private Handler handler;
    private Runnable runnable;
    private com.github.clans.fab.FloatingActionButton fab4;
    private com.github.clans.fab.FloatingActionButton fab3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        txtTimerDay = (TextView) findViewById(R.id.txtTimerDay);
        txtTimerHour = (TextView) findViewById(R.id.txtTimerHour);
        txtTimerMinute = (TextView) findViewById(R.id.txtTimerMinute);
        txtTimerSecond = (TextView) findViewById(R.id.txtTimerSecond);


        countDownStart();

        fab4= (FloatingActionButton) findViewById(R.id.fab4);
        fab3= (FloatingActionButton) findViewById(R.id.fab3);

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tm1=new Intent(Timer.this,PaymentMethod.class);
                startActivity(tm1);

            }
        });
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tm2 = new Intent(Timer.this,Welcome.class);
                startActivity(tm2);

            }
        });

    }

    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "yyyy-MM-dd");
                    // Please here set your event date//YYYY-MM-DD
                    Date futureDate = dateFormat.parse("2015-11-11");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        txtTimerDay.setText("" + String.format("%02d", days));
                        txtTimerHour.setText("" + String.format("%02d", hours));
                        txtTimerMinute.setText(""
                                + String.format("%02d", minutes));
                        txtTimerSecond.setText(""
                                + String.format("%02d", seconds));
                    } else {

                        textViewGone();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 1 * 1000);
    }

    public void textViewGone() {
        findViewById(R.id.txtTimerDay).setVisibility(View.GONE);
        findViewById(R.id.txt_TimerDay).setVisibility(View.GONE);
        findViewById(R.id.txtTimerHour).setVisibility(View.GONE);
        findViewById(R.id.txt_TimerHour).setVisibility(View.GONE);
        findViewById(R.id.txtTimerMinute).setVisibility(View.GONE);
        findViewById(R.id.txt_TimerMinute).setVisibility(View.GONE);
        findViewById(R.id.txtTimerSecond).setVisibility(View.GONE);
        findViewById(R.id.txt_TimerSecond).setVisibility(View.GONE);
    }


}
