package com.fintonic.fintonictestchallenge.domain.usecases;

import com.fintonic.fintonictestchallenge.FintonicTestChallengeApplication;
import com.fintonic.fintonictestchallenge.domain.models.ListSuperHeroesModel;

import rx.functions.Action1;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class ObtainMarvelSuperHeroesUseCase extends UseCase<ListSuperHeroesModel> {
    
    @Override
    public void execute(Action1<ListSuperHeroesModel> success, Action1<Throwable> failure) {
        super.execute(success, failure);
        
        FintonicTestChallengeApplication.getDataStoreMediator().listSuperHeroes().subscribe(this);
    }
}
