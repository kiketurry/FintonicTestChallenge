package com.fintonic.fintonictestchallenge.ui.features.list;

import com.fintonic.fintonictestchallenge.domain.models.ListSuperHeroesModel;

import es.kiketurry.struktur.view.StrukturView;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public interface ListMarvelSuperHeroesActivityView extends StrukturView {
    
    void showLoading();
    
    void hideLoading();
    
    void showSuperHeroes(ListSuperHeroesModel listSuperHeroesModel);
    
    void showProblem(String message);
}
