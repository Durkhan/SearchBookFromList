package com.example.bookfromlistapp.retrofit;

import com.example.bookfromlistapp.model.VolumeInfo;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitClient {
    @GET("volumes?")
    Observable<VolumeInfo> getBooksfromApi(@Query("q") String query);
}
