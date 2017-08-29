package com.fintonic.fintonictestchallenge.data.datastores.net;

import com.fintonic.fintonictestchallenge.BuildConfig;

import javax.inject.Singleton;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kiketurry on 26/08/2017.
 */

@Singleton
public class MarvelRetrofitClient {
    
    private Retrofit marvelRetrofit = null;
    private MarvelApiService marvelApiService = null;
    
    public MarvelRetrofitClient() {
        if (marvelRetrofit == null) {
            marvelRetrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.MARVEL_API_URL)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        marvelApiService = marvelRetrofit.create(MarvelApiService.class);
    }
    
    public MarvelApiService getMarvelApiService() {
        return marvelApiService;
    }
}
