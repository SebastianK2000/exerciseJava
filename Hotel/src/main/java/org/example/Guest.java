package org.example;
public class Guest {
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    String firstName;
    String lastName;
    int age;
    public Guest(String newFirstName, String newLastName, int newAge) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.age = newAge;
    }


}