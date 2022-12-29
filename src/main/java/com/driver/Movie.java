package com.driver;

public class Movie {
    public String name;
    public int durationInMinutes;
    public double imdbRating;
    public Movie() {

    }
    public Movie(String name,int durationInMinutes,double imdbRating) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.imdbRating = imdbRating;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }
    public void setImdbRating(double imdbRating){
        this.imdbRating = imdbRating;
    }

    public String getName(){
        return this.name;
    }
    public int getDurationInMinutes(){
        return this.durationInMinutes;
    }
    public double getImdbRating(){
        return this.imdbRating;
    }

}
