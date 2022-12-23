/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author Helmi
 */

                                  


                              /*      AHMED HELMY 
                                          #A7        */                                  


                              /*    AHMED HELMY 
                                          #A7           */        
import java.util.Scanner;

import java.util.Scanner;


public class Main {
  public static void main(String args[]){
      
      System.out.println("enter your choice:");
      System.out.println(" 1- max & min array:");
      System.out.println(" 2- cumma:");
      System.out.println(" 3- triangle:");
      System.out.println(" 4- circle:");
      System.out.println(" 5- Two D Array:");

      
      Scanner scanner = new Scanner(System.in);
      byte choice = scanner.nextByte();

      switch (choice){
          case 1:
          {
              System.out.println("max & min array:");
              System.out.println("Enter 10 numbers: ");
               double array[] = new double[10];
                for(int i=0;i<10;i++){
                  array[i] = scanner.nextDouble();
                }
               double max = array[0] , min = array[0];
                for(int i=1;i<10;i++){
                  if(array[i] > max)
                      max = array[i];
                  else
                      min = array[i];
              }
              System.out.println("The max number is: " + max);
              System.out.println("The minimum number is: " + min);

          break;}
          case 2:
          {
              System.out.println("cumma:");       
              System.out.println("Enter string:");
              String input = scanner.next();
              Cumma1 cumma = new Cumma1();
              System.out.println( cumma.deleteCumma(input) );
              break;
          }
          case 3:
          {
              System.out.println("Triangle:");
              float l1,l2,b,h;
              
              System.out.println("enter l1:");
              l1 = scanner.nextFloat();
              
              System.out.println("enter l2:");
              l2 = scanner.nextFloat();
              
              System.out.println("enter b:");
              b = scanner.nextFloat();
              
              System.out.println("enter h:");
              h = scanner.nextFloat();
              
              Triangle triangle = new Triangle();
              triangle.setLength(b, l1, l2,h);
              System.out.println( "The Area = " + triangle.getArea() );
              System.out.println( "The circumference = " + triangle.getCircumference() );
              break;
          }
          case 4:
          {
              System.out.println("Circle:");
              float r;
              r = scanner.nextFloat();
              Circle circle = new Circle();
              circle.setRedius(r);
              System.out.println( "The Area = " + circle.getArea() );
              System.out.println( "The circumference = " + circle.getCircumference() );
              break;  
          }
          case 5:
          {
              System.out.println("Two D Array:");
              int[][] arr={{5,4,1},{7,8,9},{5,1,5},{1,4,2}};
      
              for(int i=0;i<3;i++){
                 for(int k=0;k<4;k++){
                  System.out.print(arr[k][i]);
                }
              System.out.println();     
             }    
          }
}        
 
}
}
