package com.dxt2.databingdemoo.api;

import com.dxt2.databingdemoo.bean2.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public interface ApiService {
    @GET("top250")
    Call<Movie> getTopMovie(@Query("start") int start, @Query("count") int count);

}

