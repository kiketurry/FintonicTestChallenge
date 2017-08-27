package com.fintonic.fintonictestchallenge.ui.features.list;

import com.fintonic.fintonictestchallenge.domain.usecases.ObtainMarvelSuperHeroesUseCase;

import es.kiketurry.struktur.presenter.StrukturPresenter;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class ListMarvelSuperHeroesActivityPresenter extends StrukturPresenter<ListMarvelSuperHeroesActivityView> {
    public ListMarvelSuperHeroesActivityPresenter(ListMarvelSuperHeroesActivityView view) {
        super(view);
    }
    
    @Override
    public void setup() {
        getMarvelSuperHeroes();
    }
    
    private void getMarvelSuperHeroes() {
        view.showLoading();
        new ObtainMarvelSuperHeroesUseCase().execute(
                listSuperHeroesModel -> {
                    view.hideLoading();
                    view.showSuperHeroes(listSuperHeroesModel);
                },
                throwable -> {
                    view.hideLoading();
                    view.showProblem(throwable.getMessage());
                }
        );
    }
    
    @Override
    public void destroy() {
        
    }
}
