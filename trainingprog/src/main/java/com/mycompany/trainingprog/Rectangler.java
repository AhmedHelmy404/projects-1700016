/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainingprog;

/**
 *
 * @author Helmi
 */
public class Rectangler {
    private  double length;
    private double width;
    
    public Rectangler () //constructor
    { length =5;
      width =3;
    }
    
    public Rectangler (double l , double w)  //constructor overloading
    { length =l;
      width =w;
    }
    public void setlength (double l)
    {
        length=l; 
    }
    
     public void setwidth (double w)
    {
        width=w; 
    }
     
      public double getlength ()
    {
        return length; 
    }
      
       public double getwidth ()
    {
        return width; 
    }
    
        public double getArea ()
    {
        return length*width ; 
    }
    
}
