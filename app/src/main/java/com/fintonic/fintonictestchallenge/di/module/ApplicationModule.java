package com.fintonic.fintonictestchallenge.di.module;

import android.app.Application;
import android.content.Context;

import com.fintonic.fintonictestchallenge.data.datastores.DataStoreMediator;
import com.fintonic.fintonictestchallenge.data.datastores.net.MarvelRetrofitClient;
import com.fintonic.fintonictestchallenge.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Kiketurry on 29/08/2017.
 */

@Module
public class ApplicationModule {
    
    private final Application mApplication;
    
    public ApplicationModule(Application app) {
        mApplication = app;
    }
    
    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }
    
    @Provides
    Application provideApplication() {
        return mApplication;
    }
    
    @Provides
    @Singleton
    DataStoreMediator provideDataStoreMediator() {
        return new DataStoreMediator();
    }
    
    @Provides
    @Singleton
    MarvelRetrofitClient provideRetrofitClient() {
        return new MarvelRetrofitClient();
    }
}
