/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Helmi
 */
public class Mavenproject1 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("please enter number of rows : ");
            int row = in.nextInt();
            System.out.println("please enter number of coloms : ");
            int col = in.nextInt();
            int arr[][]=new int [row][col];
            for (int i=0 ; i<row ; i++){
                for (int j =0; j<col ; j++)  {
                    System.out.println("please enter item "+i+"*"+j+":");
                    arr[i][j]=in.nextInt();
                }
            }
            int m = arr[0][0];
              for (int i=0 ; i<row ; i++){
                for (int j =0; j<col ; j++)  {
                    if(m<arr[i][j])
                        m=arr[i][j];
                }
              }
              
        System.out.println("the largest number : " + m );
    }
}
