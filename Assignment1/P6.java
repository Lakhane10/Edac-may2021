//6. Write a Java program to print the sum (addition), multiply, subtract, divide and 
//remainder of two numbers. 
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000125 / 24 = 5
//125 mod 24 = 5

import java.util.*;
class P6
{
    public static void main(String args [] )
   {
     Scanner sc = new Scanner (System.in);
     System.out.println(" Input first no. : ");
        int a = sc. nextInt();
      System.out.println(" Input secound no. : ");
        int b = sc. nextInt();
      System.out.println(" expected output. : ");
         int c = a+b;
      System.out.println(a+" + "+b +" = "+c);
         int d = a-b;
      System.out.println(a+" - "+b +" = "+d);
          int e = a*b;
      System.out.println(a+" X "+b +" = "+e);
           int f = a/b;
      System.out.println(a+" / "+b +" = "+f);
            int g = a%b;
     System.out.println(a+" mod "+b +" = "+g);
    }
}

/*
output: java Assignment4
 Input first no. :
125
 Input secound no. :
24
 expected output. :
125 + 24 = 149
125 - 24 = 101
125 X 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/