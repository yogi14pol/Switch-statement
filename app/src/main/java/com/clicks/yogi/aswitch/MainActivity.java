package com.clicks.yogi.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Hello(View view) {

        switch (view.getId()){

            case R.id.btn1:
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                startActivity(i);
                break;

            case R.id.btn2:
                Toast.makeText(this, "Button 2", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn3:
                Toast.makeText(this, "Button 3", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn4:
                Toast.makeText(this, "Button 4", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn5:
                Toast.makeText(this, "Button 5", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn6:
                Toast.makeText(this, "Button 6", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn7:
                Toast.makeText(this, "Button 7", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn8:
                Toast.makeText(this, "Button 8", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}