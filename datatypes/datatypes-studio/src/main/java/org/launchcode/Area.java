package org.launchcode;
import java.util.Scanner;
public class Area {
  public static void main(String[] arg){
      Scanner scan = new Scanner(System.in);
      System.out.println("Hello, please enter a radius: ");
      double radius = scan.nextDouble();
      double area = Circle.getArea(radius);
      System.out.println("The area of a circle with radius " + radius + " is equal to " + area + " . ");
  }
}
