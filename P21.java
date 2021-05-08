/*
21. Write a Java program to convert a decimal number to octal number. 
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17
*/

import java.util.Scanner;
public class P21
{
  public static void main(String args[])
  {
    int octal[] = new int [20];
	int index =0;
		System.out.print("Enter a decimal number:");
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();

	while(n>0)
	{
	  octal[index] =n%8;
	  n=n/8;
	  index++;
	  }
	  for(int i=index-1;i>=0;i--)
      {
        System.out.print(octal[i]);
       }
   }
}   

/*
output:
java P21
Enter a decimal number:15
17
*/