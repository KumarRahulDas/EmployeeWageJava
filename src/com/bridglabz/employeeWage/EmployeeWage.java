package com.bridglabz.employeeWage;
import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random();
<<<<<<< HEAD
        int attendance = random.nextInt();

        int WAGEPERHOUR = 20;
        int FULLDAYHOURS = 8;
        int WAGEPERDAY = 0;

        if (attendance == 1) {
            System.out.println("Employee Present..");
            WAGEPERDAY = WAGEPERHOUR * FULLDAYHOURS;
        } else
            System.out.println("Employee Absent");

=======
        int attendance = random.nextInt(3);

        int WAGEPERHOUR = 20;
        int FULLDAYHOURS = 8;
        int PARTTIMEHOURS = 4;
        int WAGEPERDAY = 0;

        switch (attendance) {
            case 0:
                System.out.println("Employee Absent.");
                break;
            case 1:
                WAGEPERDAY = PARTTIMEHOURS * WAGEPERHOUR;
                break;
            default:
                WAGEPERDAY = FULLDAYHOURS * WAGEPERHOUR;

        }
>>>>>>> 0876ed613bbf86270e447df6e50d48392985b9cf
        System.out.println("Employee Wage Per Day: " + WAGEPERDAY);
    }
}
