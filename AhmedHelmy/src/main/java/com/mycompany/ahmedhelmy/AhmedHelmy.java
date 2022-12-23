/*provided by                          
                                             # AHMED HELMY #
*/

/*                                
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ahmedhelmy;
import java.util.Scanner;
/**
 *
 * @author Helmi
 */
public class AhmedHelmy {
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
    area a1 = new area();
    matrix m1 = new matrix();
    int choice;   
    System.out.println("1-area of the circle");
    System.out.println("2-area of triangle ");
    System.out.println("3-area of rectangular");
    System.out.println("4-area of cube");
    System.out.println("5-addition of two matrices");
    System.out.println("6-substrcation of two matrices");
    System.out.println("7-multiplication of two matrices");
    System.out.println("---------------");
    System.out.println("please enter your choice");
    choice=input.nextInt();
    
        double [][] arr1 = new double[3][3];
        double [][] arr2 = new double[3][3];
    
    switch( choice)  
     {
         case 1 :
             
             System.out.println("please enter your radius");
             double radius=input.nextDouble();
             a1.areaOfCircle(radius);
             break;
        
         case 2:
            System.out.println("please enter the length and the height");
             double length=input.nextDouble();
             double height=input.nextDouble();
             a1.areaOfTriangle(length,height);
            break;
         
         case 3:
            System.out.println("please enter the length and the width");
             double lengthOfRect=input.nextDouble();
             double width=input.nextDouble();
             a1.areaOfRectangular(lengthOfRect,width);
            break;  
        
         case 4:
           System.out.println("please enter the length ");
             double lengthOfcube=input.nextDouble();        
             a1.areaOfcube(lengthOfcube);
            break;  
         
         case 5:
             System.out.println("please fill the elements of matrix number 1");
             m1.fillArray(arr1);
             System.out.println("please fill the elements of matrix number 2");
             m1.fillArray(arr2);
             System.out.println("the addition result =");
             m1.add(arr1,arr2);
           break; 
         case 6:
             System.out.println("please fill the elements of matrix number 1");
             m1.fillArray(arr1);
             System.out.println("please fill the elements of matrix number 2");
             m1.fillArray(arr2);
             System.out.println("the multiplication result =");
             m1.multiply(arr1, arr2);
             break; 
         case 7:
             System.out.println("please fill the elements of matrix number 1");
             m1.fillArray(arr1);
             System.out.println("please fill the elements of matrix number 2");
             m1.fillArray(arr2);
             System.out.println("the substrcation result =");
             m1.sub(arr1,arr2);
             break; 
        
         default:
              System.out.println("wrong input");
    }
}
}
