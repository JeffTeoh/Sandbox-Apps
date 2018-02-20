package com.example.android.sandboxapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookSdk;

public class MainActivity extends AppCompatActivity {

    private TextView info;
    private LoginButton loginButton;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = CallbackManager.Factory.create();

        info = (TextView)findViewById(R.id.info);
        loginButton = (LoginButton)findViewById(R.id.login_button);
    }

    loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            info.setText(
                    "User ID: "
                            + loginResult.getAccessToken().getUserId()
                            + "\n" +
                            "Auth Token: "
                            + loginResult.getAccessToken().getToken()
            );
        }

        @Override
        public void onCancel() {
            info.setText("Login attempt canceled.");
        }

        @Override
        public void onError(FacebookException e) {
            info.setText("Login attempt failed.");
        }
    });

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void aboutUs(View view) {
        //go to about us page
        Intent intent = new Intent(this, aboutus.class);
        Button bAboutUs = (Button) findViewById(R.id.bAboutUs);
        startActivity(intent);
    }
}
