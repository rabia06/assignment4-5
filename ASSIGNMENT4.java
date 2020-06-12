/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author rabia
 */
public class ASSIGNMENT4 {

    /**
     * @param args the command line arguments
     */
    
      public static String function(int num1, int num2, int num3)
      {
         String str = null;
          if(num1>num2 && num1>num3 && num1!=0)
          {
              str = num1+" is greater";
              System.out.println(num1 + str);
          }
          
          else if(num2>num1 && num2>num3 && num2!=num1)
          {
              str = num2+" is greater";
              System.out.println(num2 + str);
          }
          else if(num3>num1 && num3>num2 && num3!=0)
          {
              str=num3+" is greater";
              System.out.println(num3 + str);
          }
          else if (num2==num1 && num2==num3 && num1==num3)
          {
             str = "All numbers are equal";
              System.out.println(str);
          }
          else
          {
              str="Number Format error";
              System.out.println(str);
          }
          return str;
      }
    
    public static void main(String[] args) {
        // TODO code application logic here
        function(20,56,21);
        function(20,20,20);
        function(30,56,30);
        
    }
    
}
