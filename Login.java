package com.ec327.chatterbox.chatterbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
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
    }

}