package com.example.android.sandboxapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }

    public void contactUs(View view) {
        //go to contact us page
        Intent intent = new Intent(this, contactus.class);
        Button bContactUs = (Button) findViewById(R.id.bContactUs);
        startActivity(intent);
    }

    public void logo(View view) {
        Intent intent2 = new Intent(this, logo.class);
        ImageButton iBlogo = (ImageButton) findViewById(R.id.iBlogo);
        startActivity(intent2);
    }
}
