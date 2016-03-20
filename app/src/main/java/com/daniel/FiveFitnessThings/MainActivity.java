package com.daniel.FiveFitnessThings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.teste.daniel.FiveFitnessThings.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startApp=(Button)findViewById(R.id.startApp);

    }


    public void goToStart(View view){
        Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
        startActivity(intent);


    }




}
