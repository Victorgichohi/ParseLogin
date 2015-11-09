package com.victor.m.parselogintutorial;

/**
 * Created by victor on 11/9/15.
 */
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
    private RadioButton day, week, month;
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
                if(checkedId == R.id.day) {
                    Toast.makeText(getApplicationContext(), "choice: Day",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.week) {
                    Toast.makeText(getApplicationContext(), "choice: Week",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: Monthly",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });

        day = (RadioButton) findViewById(R.id.day);
        week = (RadioButton) findViewById(R.id.week);
        month = (RadioButton) findViewById(R.id.month);
        textView = (TextView) findViewById(R.id.text);

        button = (Button)findViewById(R.id.chooseBtn);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find which radioButton is checked by id
                if(selectedId == day.getId()) {
                    textView.setText("You chose 'day' option");
                } else if(selectedId == week.getId()) {
                    textView.setText("You chose 'week' option");
                } else {
                    textView.setText("You chose 'month' option");
                }
            }
        });
    }

}
