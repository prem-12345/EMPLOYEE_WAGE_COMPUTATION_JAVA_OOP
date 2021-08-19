package com.bridgelabz.empwagejavaoop;

/**
 * UC1 CHECK EMPLOYEE PRESENT OR ABSENT
 *
 * @author prem
 * @version 9.1
 * @since 19/08/2021
 */

import java.util.Random;
public class EmpWageOop {

    public static final int is_Absent = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;


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


}
