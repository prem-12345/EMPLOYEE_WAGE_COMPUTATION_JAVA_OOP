package com.bridgelabz.empwagejavaoop;

import java.util.Random;

public class EmpWageOop {

    public static final int is_Absent = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_DAYS=20;
    public static final int TOTAL_WORKING_HRS=100;


    public static int emp_Hrs = 0;
    public static int emp_Wage = 0;


    public static boolean empPresentOrAbsent() {

        /* UC1 CHECK EMPLOYEE PRESENT OR ABSENT */

        Random random = new Random();
        int empCheck = random.nextInt(2);

        if (empCheck == is_Absent) {
            System.out.println("Employee is Absent");
            return false;
        } else {
            System.out.println("Employee is Present");
            return true;
        }
    }

    public static boolean dailyEmpWage() {

        /* UC2 CALCULATE DAILY EMPLOYEE WAGES */

        boolean status;

        status = empPresentOrAbsent();
        if (status) {
            emp_Hrs = 8;
            emp_Wage = (EMP_RATE_PER_HR * emp_Hrs);
            System.out.println(emp_Wage);

        } else {
            emp_Hrs = 0;
            emp_Wage = (EMP_RATE_PER_HR * emp_Hrs);
            System.out.println(emp_Wage);

        }
        return true;

    }

    public static int addPartTime() {

        /* UC3 ADD PART TIME EMPLOYEE AND WAGE */

        Random random = new Random();
        int empCheck = random.nextInt(3);

        if (empCheck == is_Absent) {
            System.out.println("Employee is Absent");
            emp_Hrs = 0;

        } else if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Full time");
            emp_Hrs = 8;

        } else {
            System.out.println("Employee is Part time");
            emp_Hrs = 4;

        }
        emp_Wage = (EMP_RATE_PER_HR * emp_Hrs);
        System.out.println(emp_Wage);
        return emp_Wage;

    }

    public static void twentyDaysWage(){

        /* UC4 CALCULATE WAGES FOR MONTH */

        int total_Emp_Wage = 0;
        int day = 0;

        for ( day=0;day<NUM_OF_DAYS;day++ ){

            addPartTime();
            total_Emp_Wage = total_Emp_Wage + addPartTime();

        }
        System.out.println(total_Emp_Wage);

    }

    public static void conditionOfHrs(){

        /**
         *UC5 CALCULATE WAGES TILL THE CONDITION REACHED 100 HRS AND 20 DAYS
         *
         * @author prem
         * @version 9.5
         * @since 19/08/2021
         */

        int totalEmpHrs=0;
        int totalWorkingDays=0;

        while( totalEmpHrs <= TOTAL_WORKING_HRS && totalWorkingDays <  NUM_OF_DAYS ){

            totalWorkingDays++;

            Random random = new Random();
            int empCheck = random.nextInt(3);

            if (empCheck == is_Absent) {
                System.out.println("Employee is Absent");
                emp_Hrs = 0;

            } else if (empCheck == IS_FULL_TIME) {
                System.out.println("Employee is Full time");
                emp_Hrs = 8;

            } else {
                System.out.println("Employee is Part time");
                emp_Hrs = 4;

            }totalEmpHrs = totalEmpHrs + emp_Hrs;
            System.out.println( " Days " + totalWorkingDays + " Emp hr " + totalEmpHrs );

        }
        int totalEmployeeWage=(totalEmpHrs*EMP_RATE_PER_HR);
        System.out.println("Total Employee Wage:"+totalEmployeeWage);

    }


}
