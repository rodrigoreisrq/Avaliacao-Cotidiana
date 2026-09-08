package com.reis.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();
        System.out.print("How many values? ");
        int quantidade = sc.nextInt();

        for(int i = 1; i <= quantidade; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();

        System.out.print("First: " + ps.first());

    }
}
