package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hotelName = "Continental";
        System.out.print("Witam w systemie rezerwacji dla hotelu " + hotelName);
        Scanner input = new Scanner(System.in);

        int option = getActionFromUser(input);

        if (option == 1) {
            Guest guest = createNewGuest(input);
        } else if (option == 2) {

            Room room = createNewRoom(input);

        } else if (option == 3) {
            System.out.println("Wybrano opcję 3.");
        } else {
            System.out.println("Wybrano niepoprawną akcję.");
        }
        input.close();
    }

    private static int getActionFromUser(Scanner in) {
        System.out.println(" ");
        System.out.println("1. Dodaj nowego gościa.");
        System.out.println("2. Dodaj nowy pokój.");
        System.out.println("3. Wyszukaj gościa.");
        System.out.println("Wybierz opcję: ");
        int actionNumber = 0;
        try {
            actionNumber = in.nextInt();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane wejsciowe, wprowadz liczbę.");
            e.printStackTrace();
        }
        return actionNumber;
    }

    private static Guest createNewGuest(Scanner input) {
        Scanner name = new Scanner(System.in);
        System.out.println("Podaj imię gościa: ");
        String firstName = name.nextLine();

        Scanner last = new Scanner(System.in);
        System.out.println("Podaj nazwisko gościa: ");
        String lastName = last.nextLine();

        Scanner year = new Scanner(System.in);
        System.out.println("Podaj wiek gościa: ");
        int age = year.nextInt();

        Guest guest = new Guest(firstName, lastName, age);

        System.out.printf("Dodano nowego gościa %s %s%n", guest.getLastName(), guest.getFirstName());
        return guest;
    }

    private static Room createNewRoom(Scanner input) {
        Scanner number = new Scanner(System.in);
        System.out.println("Podaj numer pokoju: ");
        int roomNumber = number.nextInt();

        Scanner bed = new Scanner(System.in);
        System.out.println("Podaj ilość łóżek: ");
        int beds = bed.nextInt();

        Room room = new Room(roomNumber, beds);

        System.out.printf("Wybrano pokój numer " + room.getRoomNumber() + " z " + room.getBeds() + " łóżkami");
        return new Room(room.getRoomNumber(), room.getBeds());
    }
}