package com.fintonic.fintonictestchallenge;

import android.app.Application;

import com.fintonic.fintonictestchallenge.di.component.ApplicationComponent;
import com.fintonic.fintonictestchallenge.di.component.DaggerApplicationComponent;
import com.fintonic.fintonictestchallenge.di.module.ApplicationModule;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class FintonicTestChallengeApplication extends Application {
    
    protected static ApplicationComponent applicationComponent;
    
    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }
    
    public static ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
