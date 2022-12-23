/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bank;
import java.util.Scanner;
/**
 *
 * @author Helmi
 */
public class Lab{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your Name : ");
        String name = in.nextLine();
        System.out.println("please enter your ID : ");
        String id = in.nextLine();
        System.out.println("please enter your Balance : ");
        int b = in.nextInt();
        Bank bank = new Bank (name , id , b);
        bank.printOption();
        
        
    }
}
