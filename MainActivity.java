package com.example.deepa.opencontact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import static android.R.id.button1;


public class MainActivity extends AppCompatActivity  {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                Intent i = new Intent(Intent.ACTION_INSERT_OR_EDIT);
                i.setType(ContactsContract.Contacts.CONTENT_ITEM_TYPE);

                startActivity(i);

    }
}




