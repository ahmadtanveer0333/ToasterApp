package com.ibex.toaster;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public void Message(Context context , String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
