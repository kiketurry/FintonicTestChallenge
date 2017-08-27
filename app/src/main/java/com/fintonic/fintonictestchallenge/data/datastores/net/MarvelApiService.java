package com.fintonic.fintonictestchallenge.data.datastores.net;

import com.fintonic.fintonictestchallenge.data.datastores.net.entities.ListSuperHeroesEntity;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public interface MarvelApiService {
    
    @GET("bins/bvyob")
    Observable<ListSuperHeroesEntity> getMarvelSuperHeroes();
}
