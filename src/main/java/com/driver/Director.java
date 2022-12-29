package com.driver;

public class Director {
    public String name;
    public int numberOfMovies;
    public double imdbRating;
    public Director(){

    }
    public Director(String name,int numberOfMovies,double imdbRating){
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdbRating = imdbRating;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setImdbRating(double imdbRating){
        this.imdbRating = imdbRating;
    }
    public void setNumberOfMovies(int numberOfMovies){
        this.numberOfMovies = numberOfMovies;
    }
    public String getName(){
        return this.name;
    }
    public int getNumberOfMovies(){
        return this.numberOfMovies;
    }
    public double getImdbRating(){
        return this.imdbRating;
    }
}
