package com.bridgelabz.empwagejavaoop;


import java.util.Random;
public class EmpWageOop {

    public static final int is_Absent = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;

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

        /**
         * UC2 CALCULATE DAILY EMPLOYEE WAGES
         *
         * @author prem
         * @version 9.2
         * @since 19/08/2021
         */


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


}
