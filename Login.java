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
public class Login extends Activity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EditText et = (EditText) findViewById(R.id.login_nickname_input);
        EditText et2 = (EditText) findViewById(R.id.login_password_input);

        Button signIn = (Button) findViewById(R.id.login_signIn);
        Button signUp = (Button) findViewById(R.id.login_signUp);

        Context LogInContext = getApplicationContent();
        CharSequence LoginFAIL = "Invalid nickname & password";

        public void LoginSignIn(Button, Button)
    {
        if((et.getString().toString() == "Cynergy" && et2 == "Joonho123") || (et.getString().toString()) == "Chatterbox" && et2.getString().toString() == "Ved123") )
        {


            Intent toMain = new Intent(this, Main.class);
            startActivity(toMain);
        }

    else
        {
        Toast.makeText(LongInConext, LoginFAIL, Toast.LENGTH_LONG).show();
        }
    }


    public void LoginSignUp()
    {


       Intent toSignUp = new Intent(this,toSignUp.class);
       startActivity(toSignUp);

    }

    }

}
