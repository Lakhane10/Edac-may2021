/*
19. Write a Java program to convert a decimal number to binary number. 
Input Data:
Input a Decimal Number : 5
Expected OutputBinary number is: 101
*/
import java.util.Scanner;
public class P19
{
  public static void main(String args[])
  {
    int binary[] = new int [20];
	int index =0;
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();
	while(n>0)
	{
	  binary[index] =n%2;
	  n=n/2;
	  index++;
	  }
	  for(int i=index-1;i>=0;i--)
      {
        System.out.print(binary[i]);
       }
   }
}   

/*
output:
java P19
10
1010
*/