//7. Write a Java program that takes a number as input and prints its multiplication 
//table upto 10. 
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

import java.util.*;
class P7
{
    public static void main(String args [] )
    {
       Scanner sc = new Scanner (System.in);
       System.out.println(" Input a no. : ");
        int a = sc. nextInt();
          for(int i=1;i <=10; i++)
           {
	         int c = a * i;
			 
              System.out.println(a+ " x " +i + " = "+c);
            }
    }

}
/*
output: java Assignment7
 Input a no. :
8
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
*/