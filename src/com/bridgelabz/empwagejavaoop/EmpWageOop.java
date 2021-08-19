package com.bridgelabz.empwagejavaoop;

import java.util.Random;

/**
 * UC6 COMPUTING EMPLOYEE WAGE USING CLASS METHOD (REFACTOR THE CODE)
 *
 * @author prem
 * @version 9.6
 * @since 19/08/2021
 */

class EmployeeWageClassMethod {

    public static final int is_Absent = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_DAYS = 20;
    public static final int TOTAL_WORKING_HRS = 100;

    public static int computeEmployeeWage() {

        int emp_Hrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= TOTAL_WORKING_HRS && totalWorkingDays < NUM_OF_DAYS) {

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

            }
            totalEmpHrs = totalEmpHrs + emp_Hrs;
            System.out.println(" Days " + totalWorkingDays + " Emp hr " + totalEmpHrs);
        }
        int totalEmployeeWage = (totalEmpHrs * EMP_RATE_PER_HR);
        System.out.println("Total Employee Wage:" + totalEmployeeWage);
        return totalEmployeeWage;


    }

}






