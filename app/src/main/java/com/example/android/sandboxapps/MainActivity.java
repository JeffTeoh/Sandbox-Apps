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

    public void aboutUs(View view) {
        //go to about us page
        Intent intent = new Intent(this, aboutus.class);
        Button bAboutUs = (Button) findViewById(R.id.bAboutUs);
        startActivity(intent);
    }
}
