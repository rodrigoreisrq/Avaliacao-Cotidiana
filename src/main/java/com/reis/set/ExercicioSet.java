package com.reis.set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {
    public static void main(String[] args) {
        //String path = "C:\\Users\\rodri\\OneDrive\\Desktop\\in.txt\\";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogEntry> set = new HashSet<>(); // mais rapido e nao importa a ordem
            String line = br.readLine();
            while(line != null){
                String[]fields = line.split(" ");
                String username = fields[0];
                Date momentDate = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(username, momentDate)); // o proprio set barra o user name igual

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
