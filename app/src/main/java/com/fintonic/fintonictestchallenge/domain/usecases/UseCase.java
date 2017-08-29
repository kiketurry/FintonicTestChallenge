package com.fintonic.fintonictestchallenge.domain.usecases;

import com.fintonic.fintonictestchallenge.data.datastores.DataStoreMediator;

import javax.inject.Inject;

import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class UseCase<T> extends Subscriber<T> implements Command<T> {
    
    @Inject
    DataStoreMediator dataStoreMediator;
    
    private Action0 complete;
    private Action1<T> success;
    private Action1<Throwable> failure;
    
    @Override
    public void execute(Action1<T> success, Action1<Throwable> failure) {
        this.success = success;
        this.failure = failure;
    }
    
    @Override
    public void execute(Action0 complete, Action1<T> success, Action1<Throwable> failure) {
        this.complete = complete;
        this.success = success;
        this.failure = failure;
    }
    
    @Override
    public void onCompleted() {
        this.unsubscribe();
        if (complete != null)
            complete.call();
    }
    
    @Override
    public void onError(Throwable e) {
        failure.call(e);
    }
    
    @Override
    public void onNext(T t) {
        success.call(t);
    }
}
