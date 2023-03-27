package com.example.minggu_3.navigator;

import android.content.Context;
import android.content.Intent;

public class pushReplacement {
    public static void pushReplacement(Context context, Class<?> targetActivityClass) {
        Intent intent = new Intent(context, targetActivityClass);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK | intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        context.startActivity(intent);
    }
}
