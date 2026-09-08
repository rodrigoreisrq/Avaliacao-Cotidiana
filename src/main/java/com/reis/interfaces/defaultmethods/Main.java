package com.reis.interfaces.defaultmethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("amount");
        double amount = scanner.nextDouble();
        System.out.println("months");
        int months = scanner.nextInt();
        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);
        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));
    }
}
