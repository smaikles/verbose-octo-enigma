package com.company;
public class Main {

    public static void main(String[] args) {
//a*x^2 + b*x+c=0;
        double x1, x2;
        double Discrimenant;
        double a, b, c;
        a = 43;
        b = 545;
        c = 45;
        // ветка master (new)
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
            System.out.println("Дискрименант равен: " + Discrimenant);
            System.out.println("Дискрименант меньше 0");
        }
    }
}