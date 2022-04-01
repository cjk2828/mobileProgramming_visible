package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    ToggleButton tb;
    RadioButton rbdog,rbcat,rbrabbit;
    RadioGroup rg;
    Button bt;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        tb = (ToggleButton) findViewById(R.id.toggleButton1);
        rbdog = (RadioButton) findViewById(R.id.radiodog);
        rbcat = (RadioButton) findViewById(R.id.radiocat);
        rbrabbit = (RadioButton) findViewById(R.id.radiorabbit);
        rg = (RadioGroup) findViewById(R.id.radiogroup1);
        bt = (Button) findViewById(R.id.button);
        iv = (ImageView) findViewById(R.id.imageView);

        text2.setVisibility(View.INVISIBLE);
        rbdog.setVisibility(View.INVISIBLE);
        rbcat.setVisibility(View.INVISIBLE);
        rbrabbit.setVisibility(View.INVISIBLE);
        bt.setVisibility(View.INVISIBLE);
        iv.setVisibility(View.INVISIBLE);

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true) {
                    text2.setVisibility(View.VISIBLE);
                    rbdog.setVisibility(View.VISIBLE);
                    rbcat.setVisibility(View.VISIBLE);
                    rbrabbit.setVisibility(View.VISIBLE);
                    bt.setVisibility(View.VISIBLE);
                    iv.setVisibility(View.VISIBLE);
                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rbdog.setVisibility(View.INVISIBLE);
                    rbcat.setVisibility(View.INVISIBLE);
                    rbrabbit.setVisibility(View.INVISIBLE);
                    bt.setVisibility(View.INVISIBLE);
                    iv.setVisibility(View.INVISIBLE);
                }
            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setVisibility(View.VISIBLE);
                switch (rg.getCheckedRadioButtonId()){
                    case R.id.radiodog:
                        iv.setImageResource(R.drawable.dog);
                        break;
                    case R.id.radiocat:
                        iv.setImageResource(R.drawable.cat);
                        break;
                    case R.id.radiorabbit:
                        iv.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"사진을 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}