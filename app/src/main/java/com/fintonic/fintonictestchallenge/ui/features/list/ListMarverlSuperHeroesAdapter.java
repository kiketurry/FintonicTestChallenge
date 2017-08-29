package com.fintonic.fintonictestchallenge.ui.features.list;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fintonic.fintonictestchallenge.R;
import com.fintonic.fintonictestchallenge.domain.models.SuperHeroModel;
import com.fintonic.fintonictestchallenge.utils.StringUtils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.functions.Action1;

/**
 * Created by Kiketurry on 27/08/2017.
 */

public class ListMarverlSuperHeroesAdapter extends RecyclerView.Adapter<ListMarverlSuperHeroesAdapter.SuperHeroViewHolder> {
    
    private final Context context;
    private Action1<SuperHeroModel> actionClickOnSuperHero;
    private ArrayList<SuperHeroModel> listSuperHeroes;
    
    public static class SuperHeroViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.super_hero_card_view)
        CardView superHeroCardView;
        @BindView(R.id.super_hero_image)
        ImageView superHeroImage;
        @BindView(R.id.super_hero_name)
        TextView superHeroName;
        
        public SuperHeroViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
    
    public ListMarverlSuperHeroesAdapter(Context context, Action1<SuperHeroModel> actionClickOnSuperHero) {
        this.context = context;
        this.actionClickOnSuperHero = actionClickOnSuperHero;
    }
    
    @Override
    public SuperHeroViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_marvel_super_heroes, viewGroup, false);
        SuperHeroViewHolder superHeroViewHolder = new SuperHeroViewHolder(view);
        return superHeroViewHolder;
    }
    
    @Override
    public void onBindViewHolder(SuperHeroViewHolder superHeroViewHolder, int position) {
        SuperHeroModel superHeroModel = listSuperHeroes.get(position);
        Glide.with(context)
                .load(superHeroModel.getPhotoUrl())
                .into(superHeroViewHolder.superHeroImage);
        superHeroViewHolder.superHeroName.setText(StringUtils.nickAndName(superHeroModel.getName(), superHeroModel.getRealName()));
        superHeroViewHolder.superHeroCardView.setOnClickListener(view -> actionClickOnSuperHero.call(superHeroModel));
    }
    
    @Override
    public int getItemCount() {
        return listSuperHeroes != null ? listSuperHeroes.size() : 0;
    }
    
    public void addSuperHeroes(ArrayList<SuperHeroModel> listSuperHeroes) {
        this.listSuperHeroes = listSuperHeroes;
        notifyDataSetChanged();
    }
}
