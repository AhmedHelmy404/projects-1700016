/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Helmi
 */

//package oop;
public class Triangle {
    private float baseLength;
    private float length2;
    private float length3;
    private float hight;
    
    public void setLength (float b, float L2, float L3, float h){
      this.baseLength = b;
      this.length2 = L2;
      this.length3 = L3;
      this.hight = h;
    }
    
    public float getArea (){
      return 0.5f * this.baseLength * this.hight;
    }
    public float getCircumference (){
      return this.baseLength + this.length2 + this.length3;
    }    
}

