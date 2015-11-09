package com.victor.m.parselogintutorial;

/**
 * Created by victor on 11/9/15.
 */
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class VehicleDetails extends Activity {

    private RadioGroup radioGroup;

    private RadioButton day, week, month, cbd, ngongroad, westlands,saloon,lorry,canter;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);

        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);

        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.day) {
                    Toast.makeText(getApplicationContext(), "choice: Day",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.week) {
                    Toast.makeText(getApplicationContext(), "choice: Week",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.cbd) {
                    Toast.makeText(getApplicationContext(), "choice: cbd",
                            Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.ngongroad) {
                    Toast.makeText(getApplicationContext(), "choice: ngongroad",
                            Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.westlands) {
                    Toast.makeText(getApplicationContext(), "choice:westlands",
                            Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.saloon) {
                    Toast.makeText(getApplicationContext(), "choice: saloon",
                            Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.lorry) {
                    Toast.makeText(getApplicationContext(), "choice: lorry",
                            Toast.LENGTH_SHORT).show();
                }else if (checkedId == R.id.Canter) {
                    Toast.makeText(getApplicationContext(), "choice: canter",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                        Toast.makeText(getApplicationContext(), "choice: Monthly",
                                Toast.LENGTH_SHORT).show();
                    }
                }

            }

            );

            day=(RadioButton) findViewById(R.id.day);

            week=(RadioButton) findViewById(R.id.week);

            month=(RadioButton) findViewById(R.id.month);

            cbd=(RadioButton) findViewById(R.id.cbd);

            ngongroad=(RadioButton) findViewById(R.id.ngongroad);

            westlands=(RadioButton) findViewById(R.id.westlands);

            saloon=(RadioButton) findViewById(R.id.saloon);

            lorry=(RadioButton) findViewById(R.id.lorry);

           canter=(RadioButton) findViewById(R.id.Canter);

            textView=(TextView) findViewById(R.id.text);

            button=(Button) findViewById(R.id.chooseBtn);

            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent paymentmethod=new Intent(VehicleDetails.this,PaymentMethod.class);
                        startActivity(paymentmethod);
                        finish();
                }
            });



        }

    }
