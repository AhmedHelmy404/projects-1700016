/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Helmi
 */


public class Cumma {
 public  String deleteCumma(String  str){
     
     String s = str;
     s = s.replace(",", "\0");
     return s;
     
 }
         
}

