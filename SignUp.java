package com.ec327.chatterbox.chatterbox;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends ActionBarActivity {

    EditText newEmail;
    EditText newPassword;
    EditText newNickname;

    public int passwordLength;
    public int nicknameLength;

    Context SignUpContext;
    CharSequence SignUpFail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        newEmail = (EditText) findViewById(R.id.signUp_email_input);
        newPassword = (EditText) findViewById(R.id.signUp_password_input);
        newNickname = (EditText) findViewById(R.id.signUp_nickname_input);
    }

    public void toConfirm(View view)
    {

        SignUpContext = getApplicationContext();
        SignUpFail = "Please enter a nickname/password of 12 characters or less";

        passwordLength = newPassword.length();
        nicknameLength = newNickname.length();

        if(passwordLength > 12 || nicknameLength >12 )
        {
            Toast.makeText(SignUpContext, SignUpFail, Toast.LENGTH_LONG).show();
        }
        else if(passwordLength <= 12 && nicknameLength <= 12)
        {
            Intent toMainFromSignUp = new Intent(this, EmailConfirm.class);
            startActivity(toMainFromSignUp);
        }

    }
}