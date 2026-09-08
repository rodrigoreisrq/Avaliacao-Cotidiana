package com.reis.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("tv");
        set.add("notebook");
        set.removeIf(x -> x.length() >= 3); // remove todos que sao maiores que 3
        // não mantem a ordem -- se a ordem nao importa esse é o mais indicado

        System.out.println(set.contains("notebook"));

        for (String p: set){
            System.out.println(p);
        }


        Set<String> treeSet = new TreeSet<>();
        set.add("tv");
        set.add("notebook");
        //mantem a ordem

        System.out.println(set.contains("notebook"));

        for (String p: set){
            System.out.println(p);
        }

        Set<String> linked = new LinkedHashSet<>();
        set.add("tv");
        set.add("notebook");
        //mantem a ordem

        System.out.println(set.contains("notebook"));

        for (String p: set){
            System.out.println(p);
        }
    }
    }



