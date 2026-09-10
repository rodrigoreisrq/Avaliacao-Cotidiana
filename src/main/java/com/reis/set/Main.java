package com.reis.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();


        System.out.println("Quantos alunos contém o curso A? ");
        int quantidade = sc.nextInt();
        for(int i =0; i< quantidade; i++){
            int number = sc.nextInt();
            a.add(number);
        }
        System.out.println("Quantos alunos contém o curso B? ");
        int quantidadeB = sc.nextInt();
        for(int i =0; i< quantidadeB; i++){
            int number = sc.nextInt();
            b.add(number);
        }
        System.out.println("Quantos alunos contém o curso C? ");
        int quantidadeC = sc.nextInt();
        for(int i =0; i< quantidadeC; i++){
            int number = sc.nextInt();
            c.add(number);
        }
        Set<Integer>total =new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total: "+ total.size());
    }
}
