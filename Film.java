package com.company;

public class Film {
    private String name;
    private double ranking;
    private String category;
    private double imbdRanking;
    private boolean rented;

    public Film(String name, double ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public Film(String name, double ranking, String category) {
        this.name = name;
        this.ranking = ranking;
        this.category = category;
    }

    public Film(String name, double ranking, String category, double imbdRanking) {
        this.name = name;
        this.ranking = ranking;
        this.category = category;
        this.imbdRanking = imbdRanking;
    }

    public Film(String name, double ranking, String category, double imbdRanking, boolean rented) {
        this.name = name;
        this.ranking = ranking;
        this.category = category;
        this.imbdRanking = imbdRanking;
        this.rented = rented;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public double getImbdRanking() {
        return imbdRanking;
    }

    public void setImbdRanking(double imbdRanking) {
        this.imbdRanking = imbdRanking;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
}
