/*
22. Write a Java program to convert a binary number to decimal number. 
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4
*/

import java.util.Scanner;
public class P22
{
  public static void main(String args[])
  {
	 
     int decimal[]=new int [20];
	 int index=0;
	 int power=0;
	 	System.out.print("Input a decimal number: ");
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();

	while(n>0)
	{
	  decimal[index] = n%10;
	  	  n += index*math.pow(2,power);
	  n=n/10;
       index++;
	  base= base *2;;
	
	  }
	  for(int i=index-1;i>=0;i--)
      {
        System.out.print(decimal[i]);
       }
   }
}   
