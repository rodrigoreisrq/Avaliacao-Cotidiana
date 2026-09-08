package com.reis.generics.tiposcuringa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // supertipo de qualquer tipo de lista é List<?>
//        List<?> objs = new ArrayList<>();
//        List<Integer> numbers = new ArrayList<>();
//        objs = numbers; // é permitido o upcasting
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        print(numbers);

        List<String> names = new ArrayList<>();
        names.add("rd");
        names.add("ray");
        print(names);

    }
    public static void print(List<?> list){
        // list.add(); --> nao é possivel adicionar em tipos curingas
        for(Object obj: list){
            System.out.println(obj);
        }
    }
    // o metodo permite imprimir qualquer tipo de lista usando o tipo curinga (?)
}
