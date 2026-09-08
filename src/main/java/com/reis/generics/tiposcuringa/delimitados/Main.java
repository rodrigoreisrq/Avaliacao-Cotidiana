package com.reis.generics.tiposcuringa.delimitados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Rectangle(4.0, 2.0));

        //System.out.println("Total area: " + totalArea(shapes));

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3.0, 2.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        System.out.println("Total area: " + totalArea(shapes));
        System.out.println("Total area: " + totalArea(rectangles));

    }
    public static double totalArea(List<? extends Shape> list){
       // lista pode ser de shape ou de qualquer tipo que extenda de shape
        double sum = 0.0;
        for(Shape s: list){
            sum += s.area();
        }
        return sum;
    }
}
