package com.ibex.toasterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ibex.toaster.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastMessage toastMessage = new ToastMessage();
        toastMessage.Message(this,"This is toast");
    }
}