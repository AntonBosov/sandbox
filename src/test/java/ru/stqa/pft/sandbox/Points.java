package ru.stqa.pft.sandbox;

public class Points{

  public static void main(String[] args) {

    Point P = new Point(0, 1, 2, -2);
    System.out.println("points distance =" + distance(P));
  }
  public static double distance (Point P){
    return Math.sqrt((P.p3-P.p1)*(P.p3-P.p1)+(P.p4-P.p2)*(P.p4-P.p2));
  }
}
