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

    @SerializedName("simpleName")
    @Expose
    private String simpleName;

    @SerializedName("abbreviation")
    @Expose
    private String abbreviationT;

    public Item(String name, String logoUrl, String locationT, String arenaT, String simpleName, String abbreviationT){

        this.name = name;
        this.logoUrl = logoUrl;
        this.locationT = locationT;
        this.arenaT = arenaT;
        this.simpleName = simpleName;
        this.abbreviationT = abbreviationT;

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

    public String getAbbreviationT(){
        return abbreviationT;
    }

    public void setAbbreviationT(String abbreviationT){
        this.abbreviationT = abbreviationT;
    }

}
