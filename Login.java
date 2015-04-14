package com.ec327.chatterbox.chatterbox;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends ActionBarActivity {

    EditText et;
    EditText et2;

    Context LogInContext;
    CharSequence LoginFAIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        et = (EditText) findViewById(R.id.login_nickname_input);
        et2 = (EditText) findViewById(R.id.login_password_input);
    }

    public void LoginSignIn(View view)
    {

        LogInContext = getApplicationContext();
        LoginFAIL = "Invalid nickname & password";

        if(( (et.getText().toString() == "Cynergy") && (et2.getText().toString() == "Joonho123")) || ((et.getText().toString()) == "Chatterbox") && (et2.getText().toString() == "Ved123"))
        {
            Intent toMain = new Intent(this, Mainscreen.class);
            startActivity(toMain);
        } else {
            Toast.makeText(LogInContext, LoginFAIL, Toast.LENGTH_LONG).show();
        }
    }


    public void LoginSignUp(View view)
    {
        Intent toSignUp = new Intent(this,SignUp.class);
        startActivity(toSignUp);
    }

}