package com.fintonic.fintonictestchallenge.domain.models;

import java.util.ArrayList;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class ListSuperHeroesModel {
    
    private ArrayList<SuperHeroModel> superHeroes = null;
    
    public ArrayList<SuperHeroModel> getSuperHeroes() {
        return superHeroes;
    }
    
    public void setSuperHeroes(ArrayList<SuperHeroModel> superHeroes) {
        this.superHeroes = superHeroes;
    }
}
