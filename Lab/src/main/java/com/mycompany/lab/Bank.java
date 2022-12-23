/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;
import java.util.Scanner;
/**
 *
 * @author Helmi
 */
public class Bank {
    Scanner in = new Scanner(System.in);
    String customedName , customedId ;
    int balance , prevtarns;
    
    Bank (String cName , String cID , int b)
    {
        this.customedName = cName ;
        this.customedId = cID ;
        this.balance = b ;
    }
    
    
    void deposit (int amount)
    {
        if (amount > 0)
        {
            prevtarns = amount ;
            balance  = balance+amount ;
        }
    }
    
    
    void withdraw (int amount)
    {
        if (amount <= balance && amount > 0)
        {
            prevtarns = -amount ;
            balance  = balance - amount ;
        }
        else 
            System.out.println("Not enough");
    }
    
    void getprevious ()
    {
        if (prevtarns > 0)
        {
            System.out.println("the previous transaction is deposit with amount = " + prevtarns);
        }
        if (prevtarns < 0)
        {
            System.out.println("the previous transaction is withdraw with amount = " );
        }
    }
    
    
     void printOption ()
    {
        char option;
        do{
            System.out.println("\nplease enter your choice ......");
            System.out.println("To deposit : D \tTo withdraw : w \tTo show your Balance : B");
            System.out.println("To getprevious : G \tTo End : E"); 
            option = in.next().charAt(0);
            switch(option){
                case 'D' :
                    System.out.println("please enter the amount");
                    int d = in.nextInt();
                    deposit (d);
                    break;
                case 'W' :
                    System.out.println("please enter the amount");
                    int w = in.nextInt();
                    withdraw (w);
                    break;
                case 'B' :
                    System.out.println("the Balance = " + balance);
                    break;
                case 'G' :
                    getprevious();
                    break;
                default:
                    System.out.println("please enter valid choice...");
        }
    }while(option!='E');
       
    }
}

   
