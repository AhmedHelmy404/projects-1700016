/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.task;
import java.util.Scanner;

/**
 *
 * @author Helmi
 */
public class Task {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float PI = 3.14f , Area , Perimeter ;
        int radius ;
        
        System.out.println("enter radius");
        radius = input.nextInt();
        
        Area = PI * radius * radius ;
        System.out.println( "Area of circle = " + Area);
        
        Perimeter = 2 * PI * radius ;
        System.out.println("Perimeter of circle = " + Perimeter);


    }
}
