package com.fintonic.fintonictestchallenge.ui.features.detail;

import com.fintonic.fintonictestchallenge.domain.models.SuperHeroModel;

import es.kiketurry.struktur.presenter.StrukturPresenter;

/**
 * Created by Kiketurry on 27/08/2017.
 */

public class DetailMarvelSuperHeroActivityPresenter extends StrukturPresenter<DetailMarvelSuperHeroActivityView> {
    
    private SuperHeroModel superHeroModel;
    
    public DetailMarvelSuperHeroActivityPresenter(DetailMarvelSuperHeroActivityView view, SuperHeroModel superHeroModel) {
        super(view);
        this.superHeroModel = superHeroModel;
    }
    
    @Override
    public void setup() {
        if (superHeroModel != null) {
            view.setNameSuperHero(superHeroModel.getName());
            view.setRealNameSuperHero(superHeroModel.getRealName());
            view.setImageSuperHero(superHeroModel.getPhotoUrl());
            view.setHeightSuperHero(superHeroModel.getHeight());
            view.setPowerSuperHero(superHeroModel.getPower());
            view.setAbilitiesSuperHero(superHeroModel.getAbilities());
            view.setGroupsSuperHero(superHeroModel.getGroups());
        }
    }
    
    @Override
    public void destroy() {
        
    }
}
