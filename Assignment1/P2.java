//2. Write a Java program to print the sum of two numbers.
//Test Data: 74 + 36
import java.util.*;
class  P2
{
public static void main(String args [] )
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the 2 integer no. : ");
      int i = sc.nextInt();
      int j = sc.nextInt();
      int k = i + j;
	  System.out.println(i+" + "+j +" = " +k);
	}
}
	 /*
	output: java  Assignment2
enter the 2 integer no. :
74
36
74 + 36 = 110
*/