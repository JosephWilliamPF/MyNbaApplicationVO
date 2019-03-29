package com.jw.mynbaapplication.controller;

import android.content.SharedPreferences;

import com.jw.mynbaapplication.view.MainActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Team {

    public static final String BASE_URL = "https://josephwilliampf.github.io";
    public static Retrofit retrofit = null;

    public static Retrofit getTeam(){

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

        }

}
