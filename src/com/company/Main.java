package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double x1, x2;
        double a, b, c;
        double Discrimenant;
//  a*x^2 + b*x + c = 0;
        a = 1;
        b = 8;
        c = 1;

        Discrimenant = b * b - 4 * a * c;

        if (Discrimenant == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("x1 = " + x1);
        }
        else if (Discrimenant > 0) {
            x1 = (-b + Math.sqrt(Discrimenant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discrimenant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            System.out.println("Дискрименант меньше 0");
        }
    }
}
