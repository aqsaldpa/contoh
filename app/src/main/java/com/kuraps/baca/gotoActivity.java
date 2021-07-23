package com.kuraps.baca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class gotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goto);
    }
    public void pindahbutton(View view) {
        Intent intent = new Intent(gotoActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
