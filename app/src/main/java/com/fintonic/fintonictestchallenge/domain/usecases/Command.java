package com.fintonic.fintonictestchallenge.domain.usecases;

import rx.functions.Action0;
import rx.functions.Action1;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public interface Command<T> {
    
    void execute(Action1<T> success, Action1<Throwable> failure);
    
    void execute(Action0 complete, Action1<T> success, Action1<Throwable> failure);
    
}
