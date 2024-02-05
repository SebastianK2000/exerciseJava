package main;

public class Main {
    public static void main(String[] args) {

        Movie avatar = new Movie();
        avatar.title = "Avatar";
        avatar.year = 2009;
        avatar.director = "James Cameron";
        avatar.genre = "Science Fiction";
        avatar.rating = 9;
        System.out.println("Tytuł: " + avatar.title + ", Rok produkcji: " + avatar.year + ", Reżyser: " + avatar.director + ", Gatunek: " + avatar.genre + ", Ocena: " + avatar.rating);

        Movie joker = new Movie();
        joker.title = "Joker";
        joker.year = 2019;
        joker.director = "Todd Phillips";
        joker.genre = "Drama";
        joker.rating = 8;
        System.out.println("Tytuł: " + joker.title + ", Rok produkcji: " + joker.year + ", Reżyser: " + joker.director + ", Gatunek: " + joker.genre + ", Ocena: " + joker.rating);

    }
}