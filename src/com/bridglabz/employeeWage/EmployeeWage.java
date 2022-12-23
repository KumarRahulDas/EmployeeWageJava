package com.bridglabz.employeeWage;
//Employee Wage Computation Problems
import java.util.Random;

public class EmployeeWage
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int EMP_FULL_TIME = 1;
    static final int EMP_PART_TIME = 2;
    static final int WORKING_DAY =20;
    static final int TOTAL_WORKING_HOURS = 100;

    public static void main(String[] args)
    {
        int empWage = 0;
        int totalwage = 0;
        int totalworkinghours = 0;
        int totalworkingdays = 0;

        while (totalworkingdays < WORKING_DAY && totalworkinghours < TOTAL_WORKING_HOURS )
        {
            Random random = new Random();
            int empPresent = random.nextInt(3);
            System.out.println("Random Value for Employee Attendance is :" + empPresent);

            int x;
            switch (empPresent)
            {
                case EMP_FULL_TIME:
                    x = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    empWage = empWage + x;
                    totalworkinghours = totalworkinghours + FULL_TIME_HOUR;
                    System.out.println("Employee is present and the wage is : " + empWage);
                    totalworkingdays++;
                    break;

                case EMP_PART_TIME:
                    x = WAGE_PER_HOUR * PART_TIME_HOUR;
                    empWage = empWage + x;
                    totalworkinghours = totalworkinghours + PART_TIME_HOUR;
                    System.out.println("Employee is Part time present and the wage is : " + empWage);
                    totalworkingdays++;
                    break;


                default:
                    System.out.println("Employee is absent and the wage is : " + empWage);
                    break;

            }

        }
        System.out.println("Total Working Days :" +totalworkingdays);
        System.out.println("Total Working Hours :" +totalworkinghours);
        System.out.println("Total wage of employee for the month is : " + empWage);

        public class EmployeeWage {
            public static void main(String[] args) {
                System.out.println("Welcome to Employee Wage Computation Program");
                Random random = new Random();
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
                System.out.println("Employee Wage Per Day: " + WAGEPERDAY);

            }