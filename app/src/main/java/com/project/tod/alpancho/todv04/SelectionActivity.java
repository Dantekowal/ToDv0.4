package com.project.tod.alpancho.todv04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
    public void SelectionButton(View view){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
