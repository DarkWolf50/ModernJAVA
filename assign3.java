//Create an abstract class Shape with methods calc_area and calc_volume. Derive three classes Sphere(radius) , 
//Cone(radius, height) and Cylinder(radius, height), Box(length, breadth, height) from it. 
//Calculate area and volume of all. (Use Method overriding).
import java.io.*;
import java.util.*;

abstract class shape{
 abstract public void calc_area();
 abstract public void calc_volume();
 final float pi=3.14f;
}

class sphere extends shape{
 double r;
 private double area;
 private double volume;
 public void accept() throws IOException{
  System.out.println("Enter the radius of the Sphere: ");
  Scanner sc=new Scanner(System.in);
  r=sc.nextDouble();
 }
 public void calc_area(){
  area=pi*r*r;
 }
 public void calc_volume(){
  
  volume=1.33333333334*pi*r*r*r;
 }
 public void display(){
  calc_area();
  calc_volume();
  System.out.println("The area of sphere is: "+area);
  System.out.println("The volume of sphere is: "+volume);
 }
}

class cone extends shape{
 double h,r,area,volume;

 public void accept() throws IOException{
  System.out.println("Enter radius and height of the Cone: ");
  Scanner sc=new Scanner(System.in);
  r=sc.nextInt();
  h=sc.nextInt();
 }
 public void calc_area(){
  
  double sq=h*h+r*r;
  area=pi*r*(r+java.lang.Math.sqrt(sq));
 }
 public void calc_volume(){
  double d=h/3;
  volume=pi*r*r*d;
 }
 public void display(){
  calc_area();
  calc_volume();
  System.out.println("The area of Cone is: "+area);
  System.out.println("The volume of Cone is: "+volume);
 }
}

class cylinder extends shape{
 double r,h,area,volume;
 public void accept() throws IOException{
  System.out.println("Enter radius and height of the Cylinder: ");
  Scanner sc=new Scanner(System.in);
  r=sc.nextInt();
  h=sc.nextInt();
 }
 public void calc_area(){
  area=(2*pi*r*h)+(2*pi*r*r);
 }
 public void calc_volume(){
  volume=pi*r*r*h;
 }
 public void display(){
  calc_area();
  calc_volume();
  System.out.println("The area of Cylinder is: "+area);
  System.out.println("The volume of Cylinder is: "+volume);
 }
}

class box extends shape{
 double l,b,h,area,volume;
 public void accept() throws IOException{
  System.out.println("Enter length, breadth and height of the Box: ");
  Scanner sc=new Scanner(System.in);

  l=sc.nextInt();
  b=sc.nextInt();
  h=sc.nextInt();

 }
 public void calc_area(){
  area=(2*l*b)+(2*b*h)+(2*l*h);
 }
 public void calc_volume(){
  volume=l*b*h;
 }
 public void display(){
  calc_area();
  calc_volume();
  System.out.println("The area of Box is: "+area);
  System.out.println("The volume of Box is: "+volume);
 }
}

public class assign3 {
 public static void main(String [] args)throws IOException{
  sphere s=new sphere();
  s.accept();
  s.display();
  cone co=new cone();
  co.accept();
  co.display();
  cylinder cy=new cylinder();
  cy.accept();
  cy.display();
  box b=new box();
  b.accept();
  b.display(); 
 }
}