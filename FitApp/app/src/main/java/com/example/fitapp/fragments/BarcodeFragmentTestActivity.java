package com.example.fitapp.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.fitapp.R;

public class BarcodeFragmentTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode_fragment_test);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        BarcodeFragment bf = new BarcodeFragment();
        ft.add(R.id.container, bf);
        ft.commit();
    }
}
