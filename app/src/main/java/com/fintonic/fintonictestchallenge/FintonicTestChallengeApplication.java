package com.fintonic.fintonictestchallenge;

import android.app.Application;

import com.fintonic.fintonictestchallenge.data.datastores.DataStoreMediator;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class FintonicTestChallengeApplication extends Application {
    
    private static DataStoreMediator dataStoreMediator;
    
    @Override
    public void onCreate() {
        super.onCreate();
        dataStoreMediator = new DataStoreMediator();
    }
    
    public static DataStoreMediator getDataStoreMediator() {
        return dataStoreMediator;
    }
}
