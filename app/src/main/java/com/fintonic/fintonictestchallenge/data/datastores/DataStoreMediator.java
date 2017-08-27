package com.fintonic.fintonictestchallenge.data.datastores;

import com.fintonic.fintonictestchallenge.data.datastores.net.MarvelApiService;
import com.fintonic.fintonictestchallenge.data.datastores.net.RetrofitClient;
import com.fintonic.fintonictestchallenge.data.datastores.net.mappers.ListSuperHeroesMapper;
import com.fintonic.fintonictestchallenge.domain.models.ListSuperHeroesModel;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class DataStoreMediator {
    
    private MarvelApiService marvelApiService = RetrofitClient.getClientRetrofit().create(MarvelApiService.class);
    
    public Observable<ListSuperHeroesModel> listSuperHeroes() {
        return marvelApiService.getMarvelSuperHeroes()
                .map(listSuperHeroesEntity -> new ListSuperHeroesMapper().fromResponse(listSuperHeroesEntity))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(AndroidSchedulers.mainThread());
    }
}
