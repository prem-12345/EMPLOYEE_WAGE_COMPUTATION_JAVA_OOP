package com.bridgelabz.empwagejavaoop;

import java.util.Random;

/**
 * UC7 COMPUTE EMPLOYEE WAGE FOR MULTIPLE COMPANIES
 *
 * @author prem
 * @version 9.7
 * @since 19/08/2021
 */


class CompanyEmployeeWage {

    public static final int is_Absent = 0;
    public static final int IS_FULL_TIME = 1;
    private static int emp_rate_per_hr = 20;
    private static int num_of_days = 20;
    private static int total_working_hrs = 10;
    private final String company;


    public CompanyEmployeeWage(String company,int new_emp_rate_per_hr, int new_num_of_days, int new_total_working_hrs) {
        this.company = company;
        this.emp_rate_per_hr = new_emp_rate_per_hr;
        this.num_of_days = new_num_of_days;
        this.total_working_hrs = new_total_working_hrs;

    }

    public void setEmp_rate_per_hr(int new_emp_rate_per_hr) {
        this.emp_rate_per_hr = new_emp_rate_per_hr;
    }

    public void setNum_of_days(int new_num_of_days) {
        this.num_of_days = new_num_of_days;
    }

    public void setTotal_working_hrs(int new_total_working_hrs) {
        this.total_working_hrs = new_total_working_hrs;
    }

    public int getEmp_rate_per_hr() {
        return this.emp_rate_per_hr;
    }

    public int getNum_of_days() {
        return this.num_of_days;
    }

    public int getTotal_working_hrs() {
        return this.total_working_hrs;
    }

    public static void main(String[] args) {

        CompanyEmployeeWage companyWage = new CompanyEmployeeWage("tata",10,10,10);

        int emp_Hrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= total_working_hrs && totalWorkingDays < num_of_days) {

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
        int totalEmployeeWage = (totalEmpHrs * emp_rate_per_hr);
        System.out.println("Total Employee Wage of "+ companyWage.company +" is "+ totalEmployeeWage);



    }


}