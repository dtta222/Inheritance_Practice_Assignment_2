//*************************************************************************
//Week 12 - Practice Assignment
//Staff.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: The Staff class models a school staff member with a school and pay
//*************************************************************************

public class Staff extends Person{

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name,address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String superPower() {
        return null;
    }

    public String toString() {
        String phrase;
        phrase = super.toString() + "\n---Staff Class Data--- \nSchool: " + school + "\nPay: $" + pay;

        return phrase;
    }
}
