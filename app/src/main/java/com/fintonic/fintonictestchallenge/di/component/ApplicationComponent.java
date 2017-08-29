package com.fintonic.fintonictestchallenge.di.component;

import android.app.Application;
import android.content.Context;

import com.fintonic.fintonictestchallenge.FintonicTestChallengeApplication;
import com.fintonic.fintonictestchallenge.data.datastores.DataStoreMediator;
import com.fintonic.fintonictestchallenge.data.datastores.net.MarvelRetrofitClient;
import com.fintonic.fintonictestchallenge.di.ApplicationContext;
import com.fintonic.fintonictestchallenge.di.module.ApplicationModule;
import com.fintonic.fintonictestchallenge.domain.usecases.ObtainMarvelSuperHeroesUseCase;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Kiketurry on 29/08/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    
    void inject(FintonicTestChallengeApplication demoApplication);
    
    void inject(ObtainMarvelSuperHeroesUseCase useCase);
    
    void inject(DataStoreMediator dataStoreMediator);
    
    @ApplicationContext
    Context getContext();
    
    Application getApplication();
    
    DataStoreMediator getDataStoreMediator();
    
    MarvelRetrofitClient getMarvelRetrofitClient();
}
