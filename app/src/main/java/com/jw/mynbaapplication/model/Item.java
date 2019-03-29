package com.jw.mynbaapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("logo")
    @Expose
    private String logoUrl;

    @SerializedName("location")
    @Expose
    private String locationT;

    @SerializedName("arena")
    @Expose
    private String arenaT;

    @SerializedName("simplename")
    @Expose
    private String simpleName;


    public Item(String name, String logoUrl, String locationT, String arenaT, String simpleName){

        this.name = name;
        this.logoUrl = logoUrl;
        this.locationT = locationT;
        this.arenaT = arenaT;
        this.simpleName = simpleName;
    }


    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = name;
    }

    public String getLogoUrl(){
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl){
        this.logoUrl = logoUrl;
    }

    public String getLocationT(){
        return locationT;
    }

    public void setLocationT(String locationT){
        this.locationT = locationT;
    }

    public String getArenaT(){
        return arenaT;
    }

    public void setArenaT(String arenaT){
        this.arenaT = arenaT;
    }

    public String getSimpleName(){
        return simpleName;
    }

    public void setSimpleName(String simpleName){
        this.simpleName = simpleName;
    }

}
