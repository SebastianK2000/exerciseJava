package org.example;

public class Main {
    public static void main(String[] args) {
        person p1 = new person(true, 23, "John");

        String komunikat = p1.tworz();
        System.out.println(komunikat);
    }



}