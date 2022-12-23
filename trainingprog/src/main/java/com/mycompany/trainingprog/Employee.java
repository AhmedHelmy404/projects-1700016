/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trainingprog;

/**
 *
 * @author Helmi
 */
public class Employee {
    
   private int id;
   private String name;
   private String depart;
   private double salary;
   private double bonus;
   private boolean resident;
    
   public Employee () 
      { id=1;
        name="ahmed";
        depart="industry";
        salary=3500;
        bonus=500;
        resident=true;
      }
   
   public Employee (int i , String n)
      { id=i;
        name=n;
      }     
   
   
   public Employee (int i , String n , boolean r)
      { this(i , n); // constractor chaining
        resident=r;
      }   
   
   
   public Employee (int i , String n , String d , boolean r , double s , double b )
      { id=i;
        name=n;
        depart=d;
         resident=r;
        salary=s;
        bonus=b;
       
      }   
   
   
   public void setid (int i)
   { id=i;
   }
   
    public void setname (String n)
   { name=n;
   }
    
     public void setdepart (String d)
   { depart=d;
   }
     
      public void setsalary (double s)
   { salary=s;
   }
      
       public void setsalary (double s ,double b )
   {   this.setsalary(s);
       bonus=b;
   }
   
    public void setresident (boolean r)
   { resident=r;
   }
    
    
    
     public int getid ()
   { return id;
   }
     
     public String getname ()
   { return name;
   }
     
     public String getdepart ()
   { return depart;
   }
     
     public double getsalary ()
   { return salary;
   }
     
     public double getbonus ()
   { return bonus ;
     
   }
     
     public boolean getresident ()
   { return resident;
   }
   
   
   
  
   
   
   
   
}







