package com.project.tod.alpancho.todv04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartButton(View view){
        Intent intent = new Intent(this , StartActivity.class);
        startActivity(intent);
    }
    public void RulesButton(View view){
        Intent intent = new Intent(this, RulesActivity.class);
        startActivity(intent);
    }

}
