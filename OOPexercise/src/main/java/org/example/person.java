package org.example;

public class person {
    boolean isMale;
    int age;
    String name;

    public person() {
    }

    public person(boolean isMale, int age, String name) {
        this.isMale = isMale;
        this.age = age;
        this.name = name;
    }

    public String tworz() {

        stworzPostac();
        personalizujPostac();
        zapiszPostac();
        if (usunPostac()) {
            System.out.println("Postać zopsowana");
        } else {
            wczytajPostac();
        }
        return "Koniec programu";
    }

    public void stworzPostac() {
        System.out.println("Stwórz postać");
    }

    public void personalizujPostac() {
        System.out.println("Personalizuj postać");
    }

    public void zapiszPostac() {
        System.out.println("Zapisz postać");
    }

    public void wczytajPostac() {
        System.out.println("Wczytaj postać");
    }

    public boolean usunPostac() {
        System.out.println("Usuń postać");
        return false;
    }

}
