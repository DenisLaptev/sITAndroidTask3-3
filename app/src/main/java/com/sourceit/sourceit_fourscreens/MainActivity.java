package com.sourceit.sourceit_fourscreens;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnClick;

    int count = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.btn_click);

        btnClick.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        count++;

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                switch (count) {
                                    case 1:
                                        intent = new Intent(getApplicationContext(), SecondActivity.class);
                                        startActivity(intent);
                                        count = 0;
                                        break;

                                    case 2:
                                        intent = new Intent(getApplicationContext(), ThirdActivity.class);
                                        startActivity(intent);
                                        count = 0;
                                        break;

                                    case 3:
                                        intent = new Intent(getApplicationContext(), FourthActivity.class);
                                        startActivity(intent);
                                        count = 0;
                                        break;
                                }
                            }
                        }, 500);

                    }
                }

        );
    }
}
