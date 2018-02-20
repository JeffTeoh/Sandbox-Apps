package com.example.android.sandboxapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contactUs(View view) {
        //go to about us page
        Intent intent = new Intent(this, contactus.class);
        Button bContactUs = (Button) findViewById(R.id.bContactUs);
        startActivity(intent);
    }
}
