package ru.stqa.pft.sandbox;

public class Point {
  private double x;
  private double y;
  public Point (double x, double y) {
    this.x=x;
    this.y=y;

  }
  private double getX(){return x;}
  private double getY(){return y;}
  public static double distance (Point p1,Point p2){
    return Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
  }
}
