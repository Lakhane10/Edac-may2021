//5. Write a Java program that takes two numbers as input and display the product of two numbers. 
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125

import java.util.*;
class P5
{
    public static void main(String args [] )
    {
      Scanner sc = new Scanner (System.in);
	  
      System.out.println(" Input first no. : ");
	  
         int a = sc. nextInt();
		 
      System.out.println(" Input secound no. : ");
	  
         int b = sc. nextInt();
		 
      System.out.println(a+" X "+b +" = " + (a*b));
    }
}

/*
output: javac Assignment5.java

D:\test>java Assignment5
 Input first no. :
25
 Input secound no. :
5
25 X 5 = 125
*/