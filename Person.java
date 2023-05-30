//*************************************************************************
//Week 12 - Practice Assignment
//Person.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Person class models a person with a name and address
//*************************************************************************

abstract public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String superPower();

    public String toString() {
        String phrase;
        phrase = "\n---Person Class Data--- \nName: " + name + "\nAddress: " + address + "\n";
        return phrase;
    }
}
