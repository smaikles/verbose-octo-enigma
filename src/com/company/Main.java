package com.company;
public class Main {

    public static void main(String[] args) {
        double x1, x2;
        double a, b, c;
        double Discrimenant;
//  a*x^2 + b*x + c = 0;
        a = 2;
        b = 3;
        c = 4;

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
            System.out.println(Discrimenant);
            System.out.println("Дискрименант меньше 0");
        }
    }
}