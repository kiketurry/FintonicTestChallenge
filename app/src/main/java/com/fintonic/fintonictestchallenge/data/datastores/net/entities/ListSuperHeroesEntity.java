package com.fintonic.fintonictestchallenge.data.datastores.net.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class ListSuperHeroesEntity {
    
    @SerializedName("superheroes")
    @Expose
    public ArrayList<SuperHeroEntity> superHeroes = null;
}
