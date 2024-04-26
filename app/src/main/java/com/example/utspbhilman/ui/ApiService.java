package com.example.utspbhilman.ui;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    String TOKEN = "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";
    @GET("search/users")
    @Headers("Authorization: Bearer " + TOKEN)
    Call<Response> callUser(@Query("q") String username);
    @GET("users/{username}")
    Call<Items> callDetailUser(@Path("username") String username);

}
