//*************************************************************************
//Week 12 - Practice Assignment
//Student.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Student class models a school student with a program, school year, and fee
//*************************************************************************

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String superPower() {
        return null;
    }

    public String toString() {
        String phrase;
        phrase = super.toString() + "\n---Student Class Data--- \nProgram: " + program + "\nYear: " + year + "\nFee: $" + fee;

        return phrase;
    }
}
