/*
20. Write a Java program to convert a decimal number to hexadecimal number. 
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F
*/

import java.util.Scanner;
public class P20
{
  public static void main(String args[])
  {
	char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
     int rem,j;
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();
	System.out.print("Input a decimal number: ");
	while(n>0)
	{
	   hex[j] = n%16;
	  n=n/16;
	  j++;
	  }
	  for(int i=j-1;i>=0;i--)
      {
        System.out.print("Hexadecimal number: "+n);
       }
   }
}   
