package com.fintonic.fintonictestchallenge.data.datastores.net.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kiketurry on 26/08/2017.
 */

public class SuperHeroEntity {
    
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("photo")
    @Expose
    public String photoUrl;
    @SerializedName("realName")
    @Expose
    public String realName;
    @SerializedName("height")
    @Expose
    public String height;
    @SerializedName("power")
    @Expose
    public String power;
    @SerializedName("abilities")
    @Expose
    public String abilities;
    @SerializedName("groups")
    @Expose
    public String groups;
}
