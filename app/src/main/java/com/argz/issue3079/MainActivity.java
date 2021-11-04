package com.argz.issue3079;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TESTING";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        issue3079();
    }

    private void issue3079(){
        /***
         * Prerequisite:
         * 1. Firebase Realtime database needs to be enabled
         * 2. Any data inside database is not needed
         */

        // Next line does not crash -> endBefore("a")
        FirebaseDatabase.getInstance().getReference("users").orderByKey().endBefore("a");

        // Next line crash is encountered specifically on "endBefore(" "), when space is used as a parameter for query.
        FirebaseDatabase.getInstance().getReference("users").orderByKey().endBefore(" ");
    }
}