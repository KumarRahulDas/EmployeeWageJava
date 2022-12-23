package com.bridglabz.employeeWage;
import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int attendance = random.nextInt();

        int WAGEPERHOUR = 20;
        int FULLDAYHOURS = 8;
        int WAGEPERDAY = 0;

        if (attendance == 1) {
            System.out.println("Employee Present..");
            WAGEPERDAY = WAGEPERHOUR * FULLDAYHOURS;
        } else
            System.out.println("Employee Absent");

        System.out.println("Employee Wage Per Day: " + WAGEPERDAY);
    }
}
