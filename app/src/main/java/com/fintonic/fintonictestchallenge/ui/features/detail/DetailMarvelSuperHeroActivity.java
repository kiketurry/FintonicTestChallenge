package com.fintonic.fintonictestchallenge.ui.features.detail;

import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fintonic.fintonictestchallenge.R;
import com.fintonic.fintonictestchallenge.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.kiketurry.struktur.view.StrukturActivity;

/**
 * Created by Kiketurry on 27/08/2017.
 */

public class DetailMarvelSuperHeroActivity extends StrukturActivity<DetailMarvelSuperHeroActivityPresenter> implements DetailMarvelSuperHeroActivityView {
    
    @BindView(R.id.super_hero_real_name)
    TextView superHeroRealName;
    @BindView(R.id.super_hero_image)
    ImageView superHeroImage;
    @BindView(R.id.super_hero_height_data)
    TextView superHeroHeightData;
    @BindView(R.id.super_hero_power_data)
    TextView superHeroPowerData;
    @BindView(R.id.super_hero_abilities_data)
    TextView superHeroAbilitiesData;
    @BindView(R.id.super_hero_groups_data)
    TextView superHeroGroupsData;
    
    @Override
    protected DetailMarvelSuperHeroActivityPresenter initPresenter() {
        return new DetailMarvelSuperHeroActivityPresenter(this, getIntent().getParcelableExtra(Constants.DATA_SUPER_HERO));
    }
    
    @Override
    protected void initView() {
        setContentView(R.layout.activity_detail_marve_super_hero);
        ButterKnife.bind(this);
        configureActionbar();
    }
    
    private void configureActionbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.title_actionbar_detail_activity));
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    
    @Override
    public void setNameSuperHero(String name) {
        getSupportActionBar().setTitle(name);
    }
    
    @Override
    public void setRealNameSuperHero(String realName) {
        superHeroRealName.setText(realName);
    }
    
    @Override
    public void setImageSuperHero(String photoUrl) {
        Glide.with(this)
                .load(photoUrl)
                .into(superHeroImage);
    }
    
    @Override
    public void setHeightSuperHero(String height) {
        superHeroHeightData.setText(height);
    }
    
    @Override
    public void setPowerSuperHero(String power) {
        superHeroPowerData.setText(power);
    }
    
    @Override
    public void setAbilitiesSuperHero(String abilities) {
        superHeroAbilitiesData.setText(abilities);
    }
    
    @Override
    public void setGroupsSuperHero(String groups) {
        superHeroGroupsData.setText(groups);
    }
}
