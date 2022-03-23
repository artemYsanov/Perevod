package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        float course = in.nextFloat();
        System.out.print("Введите количество рублей: ");
        float ruble = in.nextFloat();
        System.out.println("У вас: " + course * ruble + "$");
    }
}
