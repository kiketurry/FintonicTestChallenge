package com.fintonic.fintonictestchallenge.ui.features.list;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fintonic.fintonictestchallenge.R;
import com.fintonic.fintonictestchallenge.domain.models.ListSuperHeroesModel;
import com.fintonic.fintonictestchallenge.domain.models.SuperHeroModel;
import com.fintonic.fintonictestchallenge.ui.features.detail.DetailMarvelSuperHeroActivity;
import com.fintonic.fintonictestchallenge.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.kiketurry.struktur.view.StrukturActivity;
import rx.functions.Action1;

public class ListMarvelSuperHeroesActivity extends StrukturActivity<ListMarvelSuperHeroesActivityPresenter> implements ListMarvelSuperHeroesActivityView {
    
    private static final String TAG = ListMarvelSuperHeroesActivity.class.getSimpleName();
    
    @BindView(R.id.rv_marvel_super_heroes)
    RecyclerView rvMarvelSuperHeroes;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    
    LayoutManager layoutManager;
    ListMarverlSuperHeroesAdapter listMarverlSuperHeroesAdapter;
    Action1<SuperHeroModel> actionClickOnSuperHero = superHeroModel -> goToDetailSuperHero(superHeroModel);
    
    @Override
    protected ListMarvelSuperHeroesActivityPresenter initPresenter() {
        return new ListMarvelSuperHeroesActivityPresenter(this);
    }
    
    @Override
    protected void initView() {
        setContentView(R.layout.activity_list_marvel_super_heroes);
        ButterKnife.bind(this);
        
        configureActionbar();
        
        rvMarvelSuperHeroes.setHasFixedSize(true);
        
        layoutManager = new LinearLayoutManager(this);
        rvMarvelSuperHeroes.setLayoutManager(layoutManager);
        
        listMarverlSuperHeroesAdapter = new ListMarverlSuperHeroesAdapter(this, actionClickOnSuperHero);
        rvMarvelSuperHeroes.setAdapter(listMarverlSuperHeroesAdapter);
        
    }
    
    private void configureActionbar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.title_actionbar_list_activity));
    }
    
    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }
    
    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }
    
    @Override
    public void showSuperHeroes(ListSuperHeroesModel listSuperHeroesModel) {
        listMarverlSuperHeroesAdapter.addSuperHeroes(listSuperHeroesModel.getSuperHeroes());
    }
    
    @Override
    public void showProblem(String message) {
        Toast.makeText(this, getString(R.string.problem_download_heroes), Toast.LENGTH_LONG).show();
        Log.e(TAG, "l> " + "Problema descargando los super héroes: " + message);
    }
    
    private void goToDetailSuperHero(SuperHeroModel superHeroModel) {
        Intent intent = new Intent(this, DetailMarvelSuperHeroActivity.class);
        intent.putExtra(Constants.DATA_SUPER_HERO, superHeroModel);
        startActivity(intent);
    }
}
