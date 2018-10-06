package com.alextrainings.lesson3;

public class Triangle {
    public static Points point1;
    public static Points point2;
    public static Points point3;

    public Triangle() {
    }

    public Triangle (Points point1, Points point2, Points point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    public static double S = ((point1.x - point3.x)*(point2.y - point3.y)-(point2.x - point3.x)*(point1.y - point3.y))/2;
    public static double Side12 = Math.sqrt(Math.pow((point1.x - point2.x),2) + Math.pow((point1.y - point2.y),2));
    public static double Side23 = Math.sqrt(Math.pow((point2.x - point3.x),2) + Math.pow((point2.y - point3.y),2));
    public static double Side13 = Math.sqrt(Math.pow((point1.x - point3.x),2) + Math.pow((point1.y - point3.y),2));
    public static double P = Side12 + Side23 + Side13;
}
  /* public static Points point1 = new Points(2, -3);
   public static Points point2 = new Points(1,1);
   public static Points point3 = new Points (-6, 5);

   public static double S = ((point1.x - point3.x)*(point2.y - point3.y)-(point2.x - point3.x)*(point1.y - point3.y))/2;
   public static double Side12 = Math.sqrt(Math.pow((point1.x - point2.x),2) + Math.pow((point1.y - point2.y),2));
   public static double Side23 = Math.sqrt(Math.pow((point2.x - point3.x),2) + Math.pow((point2.y - point3.y),2));
   public static double Side13 = Math.sqrt(Math.pow((point1.x - point3.x),2) + Math.pow((point1.y - point3.y),2));
   public static double P = Side12 + Side23 + Side13;

    public static void main(String[] args) {
        System.out.println("S = "+S);
        System.out.println("P = "+P);
    }
}
*/