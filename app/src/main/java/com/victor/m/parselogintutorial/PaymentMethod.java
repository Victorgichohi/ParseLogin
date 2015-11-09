package com.victor.m.parselogintutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by victor on 11/9/15.
 */
public class PaymentMethod extends Activity {
    private RadioGroup paymentbuttons;

    private RadioButton mpesa,equitel,paypal;

    private EditText account;

    private Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        paymentbuttons = (RadioGroup) findViewById(R.id.paymentbuttons);

        paymentbuttons.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                  @Override
                  public void onCheckedChanged(RadioGroup group, int checkedId) {
                      if (checkedId == R.id.mpesa) {
                          Toast.makeText(getApplicationContext(), "choice: mpesa",
                                  Toast.LENGTH_SHORT).show();
                      } else if (checkedId == R.id.equitel) {
                          Toast.makeText(getApplicationContext(), "choice: equitel",
                                  Toast.LENGTH_SHORT).show();
                      } else {
                          Toast.makeText(getApplicationContext(), "choice: paypal",
                                  Toast.LENGTH_SHORT).show();
                      }
                  }
              }
        );
        mpesa=(RadioButton)findViewById(R.id.mpesa);
        equitel=(RadioButton)findViewById(R.id.equitel);
        paypal=(RadioButton)findViewById(R.id.paypal);

        pay=(Button) findViewById(R.id.paybutton);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent timer=new Intent(PaymentMethod.this,Timer.class);
                    startActivity(timer);
                    finish();
            }
        });
    }




}

