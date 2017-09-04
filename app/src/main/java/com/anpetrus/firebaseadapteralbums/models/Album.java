package com.anpetrus.firebaseadapteralbums.models;

import java.io.Serializable;

/**
 * Created by USUARIO on 04-09-2017.
 */

public class Album implements Serializable{

    private String band, gender, name;
    private int release;

    public Album() {
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
