package com.divhacks.divhacksbackend.models;

import jakarta.persistence.*;

@Entity
public class Org {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String label;
    @Column
    private String typeoforg;
    @Column
    private String tags;
    @Column
    private String Descript;
    @Column
    private int Twitter_Followers;
    @Column
    private int FB_Followers;
    @Column
    private int Funding2015;
    @Column
    private int Funding2016;
    @Column
    private int Funding2017;
    @Column
    private int Three_Year_Funding;
    @Column
    private int Social_Reach;
    @Column
    private int Impact;
    @Column
    private String Scale;
    @Column
    private String URL;
    @Column
    private String Image;
    @Column
    private String Interdependence;
    @Column
    private String Polarization;
    @Column
    private String Holistic;
    @Column
    private String Cultural_Isolation;
    @Column
    private String Mindset;
    @Column
    private String Behavior;

    public void setlabel(String label) {
        this.label = label;
    }
    public String getlabel() {
        return label;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescript() {
        return Descript;
    }

    public void setDescript(String descript) {
        Descript = descript;
    }

    public int getTwitter_Followers() {
        return Twitter_Followers;
    }

    public void setTwitter_Followers(int twitter_Followers) {
        Twitter_Followers = twitter_Followers;
    }

    public int getFunding2015() {
        return Funding2015;
    }

    public void setFunding2015(int funding2015) {
        Funding2015 = funding2015;
    }

    public int getFB_Followers() {
        return FB_Followers;
    }

    public void setFB_Followers(int FB_Followers) {
        this.FB_Followers = FB_Followers;
    }

    public int getFunding2016() {
        return Funding2016;
    }

    public void setFunding2016(int funding2016) {
        Funding2016 = funding2016;
    }

    public int getFunding2017() {
        return Funding2017;
    }

    public void setFunding2017(int funding2017) {
        Funding2017 = funding2017;
    }

    public int getThree_Year_Funding() {
        return Three_Year_Funding;
    }

    public void setThree_Year_Funding(int three_Year_Funding) {
        Three_Year_Funding = three_Year_Funding;
    }

    public int getSocial_Reach() {
        return Social_Reach;
    }

    public void setSocial_Reach(int social_Reach) {
        Social_Reach = social_Reach;
    }

    public int getImpact() {
        return Impact;
    }

    public void setImpact(int impact) {
        Impact = impact;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getInterdependence() {
        return Interdependence;
    }

    public void setInterdependence(String interdependence) {
        Interdependence = interdependence;
    }

    public String getPolarization() {
        return Polarization;
    }

    public void setPolarization(String polarization) {
        Polarization = polarization;
    }

    public String getHolistic() {
        return Holistic;
    }

    public void setHolistic(String holistic) {
        Holistic = holistic;
    }

    public String getCultural_Isolation() {
        return Cultural_Isolation;
    }

    public void setCultural_Isolation(String cultural_Isolation) {
        Cultural_Isolation = cultural_Isolation;
    }

    public String getMindset() {
        return Mindset;
    }

    public void setMindset(String mindset) {
        Mindset = mindset;
    }

    public String getBehavior() {
        return Behavior;
    }

    public void setBehavior(String behavior) {
        Behavior = behavior;
    }

    public String getTypeoforg() {
        return typeoforg;
    }

    public void setTypeoforg(String typeoforg) {
        this.typeoforg = typeoforg;
    }
}
