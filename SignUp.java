package com.ec327.chatterbox.chatterbox;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends ActionBarActivity {

    EditText newEmail;
    EditText newPassword;
    EditText newNickname;

    public int passwordLength;
    public int nicknameLength;
    Button signUp = (Button) findViewById(R.id.signUp_signUp);

    Context SignUpContext = getApplicationContext();
    CharSequence SignUpFail = "Please enter a nickname/password of 12 characters or less";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        newEmail = (EditText) findViewById(R.id.signUp_email_input);
        newPassword = (EditText) findViewById(R.id.signUp_password_input);
        newNickname = (EditText) findViewById(R.id.signUp_nickname_input);
    }

    public void toConfirm(View view)
    {

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