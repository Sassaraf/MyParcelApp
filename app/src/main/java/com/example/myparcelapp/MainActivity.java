package com.example.myparcelapp;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Write a message to the database
   public FirebaseDatabase database = FirebaseDatabase.getInstance();
  public   DatabaseReference myRef = database.getReference("message");

//    myRef.setValue("Hello, World!");

//    String key=myRef1.push().getKey();
//    newParcel.setParcelID(key);
//    myRef1.child(key).setValue(newParcel);
}
