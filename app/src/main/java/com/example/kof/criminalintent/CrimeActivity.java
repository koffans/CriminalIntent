package com.example.kof.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends FragmentActivity {
    private static final String TAG = "CrimeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
            Log.d(TAG, "onCreate: Created New fragment!");
        }

        Log.d(TAG, "onCreate: Executed onCreate Function!");
    }
}
