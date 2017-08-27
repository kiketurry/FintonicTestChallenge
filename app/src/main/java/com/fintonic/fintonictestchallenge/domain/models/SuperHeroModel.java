package com.fintonic.fintonictestchallenge.domain.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class SuperHeroModel implements Parcelable {
    
    private String name;
    private String photoUrl;
    private String realName;
    private String height;
    private String power;
    private String abilities;
    private String groups;
    
    public SuperHeroModel() {
    }
    
    protected SuperHeroModel(Parcel in) {
        name = in.readString();
        photoUrl = in.readString();
        realName = in.readString();
        height = in.readString();
        power = in.readString();
        abilities = in.readString();
        groups = in.readString();
    }
    
    public static final Creator<SuperHeroModel> CREATOR = new Creator<SuperHeroModel>() {
        @Override
        public SuperHeroModel createFromParcel(Parcel in) {
            return new SuperHeroModel(in);
        }
        
        @Override
        public SuperHeroModel[] newArray(int size) {
            return new SuperHeroModel[size];
        }
    };
    
    @Override
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(photoUrl);
        parcel.writeString(realName);
        parcel.writeString(height);
        parcel.writeString(power);
        parcel.writeString(abilities);
        parcel.writeString(groups);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhotoUrl() {
        return photoUrl;
    }
    
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    
    public String getRealName() {
        return realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }
    
    public String getHeight() {
        return height;
    }
    
    public void setHeight(String height) {
        this.height = height;
    }
    
    public String getPower() {
        return power;
    }
    
    public void setPower(String power) {
        this.power = power;
    }
    
    public String getAbilities() {
        return abilities;
    }
    
    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }
    
    public String getGroups() {
        return groups;
    }
    
    public void setGroups(String groups) {
        this.groups = groups;
    }
    
}
