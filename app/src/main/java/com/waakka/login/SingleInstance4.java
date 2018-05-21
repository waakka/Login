package com.waakka.login;

import android.content.Context;

public class SingleInstance4 {

    private static SingleInstance4 sInstance;

    private Context mContext;

    private SingleInstance4(Context context){

        mContext = context;

    }

    public static SingleInstance4 getInstance(Context context){

        if(sInstance ==null){

            sInstance =new SingleInstance4(context);

        }

        return sInstance;

    }




}
