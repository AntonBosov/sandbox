package ru.stqa.pft.sandbox;

import java.awt.*;

import static ru.stqa.pft.sandbox.Point.distance;

public class Points{

  public static void main(String[] args) {
    Point p1 = new Point(0, 1);
    Point p2 = new Point(2, -2);
    System.out.println("points distance2 =" + distance2(p1, p2));
    System.out.println("points distance =" + distance(p1, p2));
    Assert.assertEquals(distance2(p1, p2), distance(p1, p2));
  }
  public static double distance (Point p1,Point p2){
    return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
  }
}
