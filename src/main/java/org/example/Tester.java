package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;
    public static final  int a=3;

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate");
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    public void printInfo(boolean includeSalary) {
        printInfo();
        if (includeSalary) {
            System.out.println("Salary: " + salary);

        }
    }

    public void printInfo(String additionalInfo) {
        printInfo();
        System.out.println("Additional Info: " + additionalInfo + a);
    }


    public static void printStaticInfo() {
        System.out.println("Hello,World!Name.");
    }
    @Override
    public  String toString (){
        return "Tester {";
    }
}

