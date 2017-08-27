package com.fintonic.fintonictestchallenge.data.datastores.net.mappers;

import com.fintonic.fintonictestchallenge.data.datastores.net.entities.SuperHeroEntity;
import com.fintonic.fintonictestchallenge.domain.models.SuperHeroModel;

import es.kiketurry.struktur.mapper.StrukturResponseMapper;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class SuperHeroMapper implements StrukturResponseMapper<SuperHeroEntity, SuperHeroModel> {
    
    @Override
    public SuperHeroModel fromResponse(SuperHeroEntity superHeroEntity) {
        SuperHeroModel superHeroModel = new SuperHeroModel();
        superHeroModel.setName(superHeroEntity.name);
        superHeroModel.setPhotoUrl(superHeroEntity.photoUrl);
        superHeroModel.setRealName(superHeroEntity.realName);
        superHeroModel.setHeight(superHeroEntity.height);
        superHeroModel.setPower(superHeroEntity.power);
        superHeroModel.setAbilities(superHeroEntity.abilities);
        superHeroModel.setGroups(superHeroEntity.groups);
        return superHeroModel;
    }
}
