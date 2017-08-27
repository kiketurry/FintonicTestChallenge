package com.fintonic.fintonictestchallenge.data.datastores.net.mappers;

import com.fintonic.fintonictestchallenge.data.datastores.net.entities.ListSuperHeroesEntity;
import com.fintonic.fintonictestchallenge.data.datastores.net.entities.SuperHeroEntity;
import com.fintonic.fintonictestchallenge.domain.models.ListSuperHeroesModel;
import com.fintonic.fintonictestchallenge.domain.models.SuperHeroModel;

import java.util.ArrayList;

import es.kiketurry.struktur.mapper.StrukturResponseMapper;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class ListSuperHeroesMapper implements StrukturResponseMapper<ListSuperHeroesEntity, ListSuperHeroesModel> {
    
    @Override
    public ListSuperHeroesModel fromResponse(ListSuperHeroesEntity listSuperHeroesEntity) {
        ListSuperHeroesModel listSuperHeroesModel = new ListSuperHeroesModel();
        listSuperHeroesModel.setSuperHeroes(new ArrayList<SuperHeroModel>());
        if (listSuperHeroesEntity.superHeroes != null && listSuperHeroesEntity.superHeroes.size() > 0) {
            SuperHeroMapper superHeroMapper = new SuperHeroMapper();
            for (SuperHeroEntity superHeroe : listSuperHeroesEntity.superHeroes) {
                listSuperHeroesModel.getSuperHeroes().add(superHeroMapper.fromResponse(superHeroe));
            }
        }
        
        return listSuperHeroesModel;
    }
}
