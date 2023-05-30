//*************************************************************************
//Week 12 - Practice Assignment
//TestPerson.java
//Date: 04/26/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: A Test Driver for the Person class
//*************************************************************************

public class TestPerson {
    public static void main(String[] args) {

        // Test Student class
        Student s1 = new Student("James Mack", "123 Main St", "Computer Science", 2, 300.53);
        System.out.println(s1);

        // Test Staff class
        Staff s2 = new Staff("Ms. Jackson", "456 Main Dr", "UoT", 2500.05);
        System.out.println(s2);

    }
}