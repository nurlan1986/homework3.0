package com.geektech;

public class Main {

    public static void main(String[] args) {
       double [] mass = new double [15];
       mass[0] = 2.1;
       mass[1] = 4.2;
       mass[2] = 9.6;
       mass[3] = -5.5;
       mass[4] = -7.4;
       mass[5] = 2.2;
       mass[6] = 1.3;
       mass[7] = 2.5;
       mass[8] = 8.7;
       mass[9] = 4.3;
       mass[10] = 1.4;
       mass[11] = 5.4;
       mass[12] = 4.3;
       mass[13] = 9.1;
       mass[14] = 2.7;

        System.out.println(mass.length);
        double summass = 0;
        for(double i=0;i<mass.length;i++){
           summass = summass + mass[(int) i];
        }
       System.out.println("сумма элементов массива = " + summass);
    }

    private static void mass(double i) {

    }

}
