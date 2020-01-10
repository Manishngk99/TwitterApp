package com.example.twitterapp.StrictMode;

public class StrictModeClass {
    public static void StrickMode(){
        android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();

        android.os.StrictMode.setThreadPolicy(policy);
    }
}
