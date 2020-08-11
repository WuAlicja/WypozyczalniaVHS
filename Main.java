package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Film> films = new ArrayList<>();
        films.add(new Film("Gwiezdne wojny", 0.1, "science-fiction", 0.3, false));
        films.add(new Film("Seksmisja", 0.9, "komedia", 0.4, false));
        films.add(new Film("Zorro", 0.4, "kostiumowy", 0.5, false));
        films.add(new Film("Mis Uszatek", 0.99, "bajka", 0.6, true));
        films.add(new Film("Szczeki", 0.5, "thriller", 0.7, false));
        films.add(new Film("Incepcja", 0.8, "thriller", 0.8, true));
        films.add(new Film("Ptaki", 0.7, "thriller", 0.9, false));

        recommendFilm(films, 0.8, 0.2);
        System.out.println("-------");
        recommendFilmFromCategory(films, "thriller", 0.5, 0.1);
        System.out.println("-------");
        setFilmAsRented("Ptaki", films);
        returnFilm("Incepcja", films);
        returnFilmAndGiveNote("Mis Uszatek", films, 0.5);
    }

    static void recommendFilm(List<Film> films, double rankWeight, double imbdRankWeight) {
        double max = 0;
        String name = "Wszystkie filmy sa wypozyczone";
        for (Film film : films
        ) {
            if (!film.isRented()) {
                if ((rankWeight * film.getRanking() + imbdRankWeight * film.getImbdRanking()) / 2.0 > max) {
                    max = film.getRanking();
                    name = film.getName();
                }
            }
        }
        System.out.println("Rekomendowany film to: "+name);
    }


    static void recommendFilmFromCategory(List<Film> films, String category, double rankWeight, double imbdRankWeight) {
        double max = 0;
        String name = "Wszystkie filmy sa wypozyczone";
        for (Film film : films
        ) {
            if (!film.isRented()) {
                if (film.getCategory().equals(category)) {
                    if ((rankWeight * film.getRanking() + imbdRankWeight * film.getImbdRanking()) / 2.0 > max) {
                        max = film.getRanking();
                        name = film.getName();
                    }
                }
            }
        }
        System.out.println("Rekomendowany film z kategorii "+category+" to "+name);
    }

    static void setFilmAsRented(String filmName, List<Film> films) {
        for (Film film : films
        ) {
            if (film.getName().equals(filmName) && (!film.isRented())) {
                film.setRented(true);
                System.out.println("Film " + filmName + " wypozyczony");
            }
        }
    }

    static void returnFilm(String filmName, List<Film> films) {
        for (Film film : films
        ) {
            if (film.getName().equals(filmName) && (film.isRented())) {
                film.setRented(false);
                System.out.println("Film " + filmName + " zwrocony");
            }
        }
    }

    static void returnFilmAndGiveNote(String filmName, List<Film> films, double note) {
        for (Film film : films
        ) {
            if (film.getName().equals(filmName) && (film.isRented())) {
                film.setRented(false);
                film.setRanking(note);
                System.out.println("Film zwrocony i oceniony na " + note);
            }
        }
    }
}
