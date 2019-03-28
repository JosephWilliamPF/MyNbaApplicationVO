package com.jw.mynbaapplication;

import com.jw.mynbaapplication.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamAPI {
    @GET("/apinba.Json")
    Call<ItemResponse> getItems();
}
