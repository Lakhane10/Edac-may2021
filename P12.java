//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


import java.util.*;
class P12
{
  public static void main(String args[])
  {  
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Input first no.: ");
	 
	     int num1 = sc.nextInt();
	   
	       System.out.println("Input secound no.: ");
	     
	          int num2 = sc.nextInt();
	   
	            System.out.println("Input third no.: ");
	 
	              int num3 = sc.nextInt();
				  
				  System.out.println("output: " + (num1 + num2 + num3) / 3);
    }
 }
 
 /*
 output:
 Assignment 1>java P12
Input first no.:
10
Input secound no.:
20
Input third no.:
30
output: 20
*/