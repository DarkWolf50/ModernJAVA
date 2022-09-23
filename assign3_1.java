/*
 * Write a Java program to create a super class Vehicle having members Company and price. 
 * Derive 2 different classes LightMotorVehicle (members – mileage) and HeavyMotorVehicle (members – capacity-in-tons).
 *  Accept the information for n vehicles and display the information in appropriate form. 
 * While taking data, ask the user about the type of vehicle first
 */
import java.io.*;
import java.util.Scanner;
class Vehicle{ 
 String company;
 double price;
 public void accept() throws IOException{
  System.out.println("Enter the Company and price of the Vehicle: ");
  Scanner sc=new Scanner(System.in);
  company=sc.next();
  price=sc.nextInt();
  
 }
 public void display(){
  System.out.println("Company: "+company+" Price: "+price);
 }
 
}
class LightMotorVehicle extends Vehicle{
 double mileage;
 public void accept() throws IOException{
  super.accept();
  System.out.println("Enter the mileage of the vehicle: ");
  Scanner sc=new Scanner(System.in);
  mileage=sc.nextInt();
 }
 public void display(){
  super.display();
  System.out.println("Mileage: "+mileage);
 }
}
class HeavyMotorVehicle extends Vehicle{
 double captons;
 public void accept() throws IOException{
  super.accept();
  System.out.println("Enter the capacity of vehicle in tons: ");
  Scanner sc=new Scanner(System.in);
  captons=sc.nextInt();
 }
 public void display(){
  super.display();
  System.out.println("Capacity in tons: "+captons);
 }
}

public class assign3_1 {
 public static void main(String [] args) throws IOException{
  int i;
  System.out.println("Enter the type of vehicle: ");
  Scanner sc=new Scanner(System.in);
  System.out.println("1.Light Vehicle");
  System.out.println("2.Heavy Vehicle");
  int ch=sc.nextInt();
  switch(ch){
  case 1: 
   System.out.println("Enter the number of Light vehicles: ");
   int n=sc.nextInt();
   LightMotorVehicle [] l=new LightMotorVehicle[n];
   for(i=0;i<n;i++){
    l[i]=new LightMotorVehicle();
    l[i].accept();
   }
   for(i=0;i<n;i++){
    l[i].display();
   }
   break;
  case 2:
   System.out.println("Enter the number of Heavy vehicles: ");
   int m=sc.nextInt();
   HeavyMotorVehicle [] h=new HeavyMotorVehicle[m];
   for(i=0;i<m;i++){
     h[i]=new HeavyMotorVehicle();
     h[i].accept(); 
    }
   for(i=0;i<m;i++){
    h[i].display();
   }
   break; 
   } 
  } 

} 
