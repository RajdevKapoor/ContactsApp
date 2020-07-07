package com.rajdevkapoor.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.rajdevkapoor.contactsapp.data.DatabaseHandler;
import com.rajdevkapoor.contactsapp.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db= new DatabaseHandler(this);

        List<Contact> contactList=db.getAllContacts();
        for(Contact contact: contactList){
            Log.d("Mainactivity",contact.getName()+" "+contact.getPhoneNumber()+" "+contact.getId());
        }


    }
}