package com.example.minggu_2.intent;


import android.content.Context;
import android.content.Intent;

public class PushReplacement {
    public static void pushReplacement(Context context, Class<?> targetActivityClass) {
        Intent intent = new Intent(context, targetActivityClass);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK | intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        context.startActivity(intent);
    }

}
