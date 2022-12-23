package com.bridglabz.employeeWage;
import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
        int attendance = random.nextInt(3); // Generate 3 random number 0,1,2

        int WAGEPERHOUR = 20;
        int FULLDAYHOUR = 8;
        int PARTTIMEHOUR = 4;
        int WAGEPERDAY = 0;

        switch (attendance) {

            case 0:
                System.out.println("Employee Absent");
                break;

            case 1:
                System.out.println("Employee Part Time Present");
                WAGEPERDAY = WAGEPERHOUR * PARTTIMEHOUR;
            default:
                System.out.println("Employee Full Day Present..");
                WAGEPERDAY = WAGEPERHOUR * FULLDAYHOUR;
        }

        System.out.println("Employee Wage Per Day :-" + WAGEPERDAY);
    }
    }
