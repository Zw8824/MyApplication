package com.rviewtech.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.myBtn);

        pressBtn(btn);
    }

    private void pressBtn(Button btn) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity();
                finish();
            }
        });
    }

    private void startActivity() {
        Intent intent = new Intent("com.rviewtech.helloword.intent.action.MainActivity");
        startActivity(intent);
        Toast.makeText(this,"startActivity",Toast.LENGTH_SHORT).show();
    }
}
