package com.fintonic.fintonictestchallenge.data.datastores;

import com.fintonic.fintonictestchallenge.FintonicTestChallengeApplication;
import com.fintonic.fintonictestchallenge.data.datastores.net.MarvelRetrofitClient;
import com.fintonic.fintonictestchallenge.data.datastores.net.mappers.ListSuperHeroesMapper;
import com.fintonic.fintonictestchallenge.domain.models.ListSuperHeroesModel;

import javax.inject.Inject;
import javax.inject.Singleton;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Kiketurry on 26/08/2017.
 */
@Singleton
public class DataStoreMediator {
    
    @Inject
    MarvelRetrofitClient marvelRetrofitClient;
    
    public DataStoreMediator() {
        FintonicTestChallengeApplication.getComponent().inject(this);
    }
    
    public Observable<ListSuperHeroesModel> listSuperHeroes() {
        return marvelRetrofitClient.getMarvelApiService().getMarvelSuperHeroes()
                .map(listSuperHeroesEntity -> new ListSuperHeroesMapper().fromResponse(listSuperHeroesEntity))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(AndroidSchedulers.mainThread());
    }
}
