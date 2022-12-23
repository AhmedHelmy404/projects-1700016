/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahmedhelmy;

import java.util.Scanner;
/**
 *
 * @author Helmi
 */
class matrix {
static Scanner input=new Scanner(System.in);
int a =3, b =3 ;
      
        
    void fillArray(double [][]arr) 
    {

        for (int row = 0 ; row <a ; row ++)
        {
            for ( int col=0 ; col<b ; col++ )
            {
                System.out.println("enter the value of row no "+ (row+1) +"and col no"+ (col+1));

                 arr[row][col]=input.nextInt();
            }
        }
    }
    
    void add(double [][]arr1,double [][]arr2) 
    {
    int a =3,b=3; // size of the matrix 2 rows and 2 columns 
    
    for(int i = 0; i < a; i++) {
            for (int j = 0; j <b; j++) {
                double[][] add=new double[a][b];
                add[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print( add [i][j] + " " );
            }
            System.out.println(); 
           
        }
   
    }
    
    void multiply(double [][]arr1,double [][]arr2) 
    {
    int a =3,b=3;
    
    for(int i = 0; i < a; i++) {
            for (int j = 0; j <b; j++) {
                double[][] add=new double[a][b];
                add[i][j] = arr1[i][j] * arr2[i][j];
                System.out.print( add [i][j] + " " );
            }
            System.out.println(); 
           
        }
   
    }
    
     void sub(double [][]arr1,double [][]arr2) 
    {
    int a =3,b=3;
    
    for(int i = 0; i < a; i++) {
            for (int j = 0; j <b; j++) {
                double[][] add=new double[a][b];
                add[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print( add [i][j] + " " );
            }
            System.out.println(); 
           
        }
   
    }
    
    
    
}    

