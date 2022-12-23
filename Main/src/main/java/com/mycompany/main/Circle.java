/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Helmi
 */


public class Circle {
    private float redius;
    private final float PI = 3.14f;
    public void setRedius (float r){
      this.redius = r;
    }
    public float getArea (){
      return this.PI * this.redius * this.redius;
    }
    public float getCircumference (){
      return 2 * PI * redius;
    }    
}

