package com.bridgelabz;

public class EmpWage {

    public static void main(String[] args) {
        calculateWage();
    }

    private static void calculateWage() {
        double IS_PRESENT = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PRESENT) {
            double EmpRatePerHr = 20;
            double EmpHrs = 8;
            double salary = (EmpRatePerHr * EmpHrs);
            System.out.println(salary);
        } else {
            System.out.println("salary is 0");
        }
    }
}





