package com.example.android.soonami;

public  class TextUtils {

     public static boolean isText(String jsonResponse) {
        if (jsonResponse == null || jsonResponse.length() == 0) {
            return  false;
        } else {
            return  true;
        }
    }

}
