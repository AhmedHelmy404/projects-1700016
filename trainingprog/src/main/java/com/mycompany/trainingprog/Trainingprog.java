/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trainingprog;
 import java.util.Scanner;
/**
 *
 * @author Helmi
 */
public class Trainingprog {

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

     int choice;
        System.out.println("please enter choice");
        System.out.println(" 1 :for Rectangler ");
        System.out.println(" 2 :for Car ");
        System.out.println(" 3 :for Employee ");
        choice=scanner.nextInt();
        switch(choice){
    case 1 :                 {
       Rectangler r1 = new Rectangler();
       
       /* r1.setlength(10);
       r1.setwidth(4);
       
       /* r1.getlength();
       r1.getwidth();
       r1.getArea();*/
       
              System.out.println(r1.getlength());
              System.out.println(r1.getwidth());
       System.out.println("Area = " + r1.getArea());
       
       Rectangler r2 = new Rectangler(20,30); //object 
       
        System.out.println(r2.getlength());
              System.out.println(r2.getwidth());
       System.out.println("Area = " + r2.getArea());
       }
       
       
    case 2 :                 { 
       Car c1 = new Car();
       
       c1.setmaker("BMW");
       c1.setmodel(2015);
       System.out.println(c1.getmodel());
       System.out.println(c1.getmaker());
      }
       
    case 3 :                 { 
       Employee e1=new Employee();
        System.out.println (e1.getid());
        System.out.println(e1.getname());
        System.out.println(e1.getdepart());
        System.out.println(e1.getsalary());
        System.out.println(e1.getbonus());
        System.out.println(e1.getresident());
              
              
              
              Employee e2 = new Employee(1 , "Ahmed"  );
              System.out.println (e2.getid());
              System.out.println(e2.getname());
              
       Employee e3 = new Employee(1 , "Mohmed" , false  );
        System.out.println (e3.getid());
              System.out.println(e3.getname());
                      System.out.println(e3.getresident());

                      
        Employee e4 = new Employee(1 ,  "Ahmed" , "IT" , true , 5000 , 500  );
        System.out.println(e4.getid());
        System.out.println(e4.getname());
        System.out.println(e4.getdepart());
        System.out.println(e4.getbonus());
        System.out.println(e4.getsalary());
        System.out.println(e4.getresident());
                System.out.println("////////////////////////////////////////////////////");
               e4.setsalary(6000,800);
                        System.out.println(e4.getsalary());
        System.out.println(e4.getbonus());

      }

 
              
       
       
}}}
