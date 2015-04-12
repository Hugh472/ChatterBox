package com.ec327.chatterbox.chatterbox;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

/**
 * Created by Mason D. Hahn on 4/7/2015.
 */
public class SignUp extends Activity{



    protected void onCreate(savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EditText newEmail = (EditText) findViewById(R.id.signUp_email_input);
        EditText newPassword = (EditText) findViewById(R.id.signUp_password_input);
        EditText newNickname = (EditText) findViewById(R.id.signUp_nickname_input);

        public int passwordLength = newPassword.length();
        public int nicknameLength = newNickname.length();
        Button signUp = (Button) findViewById(R.id.signUp_signUp);

        Context SignUpContext = getApplicationContent();
        CharSequence SignUpFail = "Please enter a nickname/password of 12 charachters or less";

        public void SignUp(Button, Button)
    {

        if(passwordLength > 12 || nicknameLength >12 )
        {
            Toast.makeText(SignUpContext, SignUpFAIL, Toast.LENGTH_LONG).show();
        }
        else if(passwordLength <= 12 && nicknameLength <= 12)

        {
            Intent toMainFromSignUp = new Intent(this, Main.class);
            startActivity(toMainFromSignUp);
        }

    }


   }

}

