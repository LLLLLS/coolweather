package com.coolweather.android.util;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by LLS on 2018/1/29.
 */

public interface Request {

    @GET("weather")
    Call<String> getCall(@Query("cityid") String cityid,@Query("key") String key);

    @GET("bing_pic")
    Call<String> getPic();

    @GET()
    Call<String> getData(@Url String url);

}
