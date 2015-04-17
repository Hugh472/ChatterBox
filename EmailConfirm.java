package com.ec327.chatterbox.chatterbox;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class EmailConfirm extends ActionBarActivity {

    EditText et;

    Context ConfirmContext;
    CharSequence ConfirmFAIL;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emailconfirm);
    }

    public void createAccount(View view){

        et = (EditText) findViewById(R.id.confirm_passcode_input);
        ConfirmContext = getApplicationContext();
        ConfirmFAIL = "Wrong passcode.";

        if(et.getText().toString().equals("12345"))
        {
            Intent toAddShows = new Intent(this, AddShows.class);
            startActivity(toAddShows);
        } else {
            Toast.makeText(ConfirmContext, ConfirmFAIL, Toast.LENGTH_LONG).show();
        }
    }
}

