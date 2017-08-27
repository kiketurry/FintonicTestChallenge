package com.fintonic.fintonictestchallenge.data.datastores.net;

import com.fintonic.fintonictestchallenge.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class RetrofitClient {
    
    private static Retrofit retrofit = null;
    
    private RetrofitClient() {
    }
    
    public static Retrofit getClientRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.MARVEL_API_URL)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    
}
