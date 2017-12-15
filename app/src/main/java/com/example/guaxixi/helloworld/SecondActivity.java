package com.example.guaxixi.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    ImageView back;
    ImageView openChoose;
    TextView result;
    TextView man;
    TextView woman;
    CardView choose;
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        initListener();
    }
    private void initView(){
        back = (ImageView)findViewById(R.id.activity_second_back);
        openChoose = (ImageView)findViewById(R.id.activity_second_card_sex_open_choose);
        result = (TextView)findViewById(R.id.activity_second_card_sex_result);
        man = (TextView)findViewById(R.id.activity_second_card_sex_man);
        woman = (TextView)findViewById(R.id.activity_second_card_sex_woman);
        choose = (CardView)findViewById(R.id.activity_second_card_sex_choose);
        register = (TextView)findViewById(R.id.activity_second_card_register);
    }
    private void initListener(){
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        openChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setVisibility(View.INVISIBLE);
                choose.setVisibility(View.VISIBLE);
            }
        });
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose.setVisibility(View.INVISIBLE);
                result.setText("男");
                result.setVisibility(View.VISIBLE);
            }
        });
        woman.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                choose.setVisibility(View.INVISIBLE);
                result.setText("女");
                result.setVisibility(View.VISIBLE);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
