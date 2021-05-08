//3. Write a Java program to divide two numbers and print on the screen. 
//Test Data : 50/3
//Expected Output : 16

import java.util.*;
class  P3
{
public static void main(String args [] )
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the 2 integer no. : ");
      int i = sc.nextInt();
      int j = sc.nextInt();
      int k = i / j;
	  System.out.println("Expected output: "+k);

	}
}
/*
output:
java Assignment3
enter the 2 integer no. :
50
3
Expected output: 16
*/