package com.fintonic.fintonictestchallenge.ui.features.detail;

import es.kiketurry.struktur.view.StrukturView;

/**
 * Created by Kiketurry on 27/08/2017.
 */

public interface DetailMarvelSuperHeroActivityView extends StrukturView {
    
    void setNameSuperHero(String name);
    
    void setRealNameSuperHero(String realName);
    
    void setImageSuperHero(String photoUrl);
    
    void setHeightSuperHero(String height);
    
    void setPowerSuperHero(String power);
    
    void setAbilitiesSuperHero(String abilities);
    
    void setGroupsSuperHero(String groups);
}
