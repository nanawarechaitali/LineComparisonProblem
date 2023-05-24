package com.bridgelabz;

import java.util.Random;

public class LineComparison {
    public  void Length1(){
        Random random = new Random();
        int x1 = random.nextInt(10);
        int y1 = random.nextInt(20);
        int x2 = random.nextInt(30);
        int y2 = random.nextInt(40);
        System.out.println("Point x1 is " + x1  + " " +  "and" + " "  + "Point y1 is" + y1);
        System.out.println("Point x2 is " + x2  + " " +  "and" + " "  + "Point y2 is" + y2);


        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of the line is " + length);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Comparison Computation on master branch");
        LineComparison obj = new LineComparison();
        obj.Length1();

    }

}


