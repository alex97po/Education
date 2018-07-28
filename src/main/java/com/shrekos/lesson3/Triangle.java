package com.shrekos.lesson3;

public class Triangle {
   public static Points point1 = new Points(2, -3);
   public static Points point2 = new Points(1,1);
   public static Points point3 = new Points (-6, 5);

   public static double S = ((point1.x - point3.x)*(point2.y - point3.y)-(point2.x - point3.x)*(point1.y - point3.y))/2;

    public static void main(String[] args) {
        System.out.println(S);
    }
}
