//15. Write a Java program to swap two variables. 


import java.util.Scanner;
class P15
{
  public static void main(String args[])
   {
 	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println(" enter the 2 no.:");
	  
	 int a = sc.nextInt();
	  int b = sc.nextInt();
	  int temp;
	   
	   System.out.println(" Before Swapping: ");
         System.out.println(" a : "+a); 
		 System.out.println(" b : "+b);
		  
		  temp = a;
		  a = b;
		  b =  temp;
      
         System.out.println(" after Swapping: ");	
          System.out.println(" a : "+a);	
           System.out.println(" b : "+b);	
    }
}

/*
output: java P15
 enter the 2 no.:
10
20
 Before Swapping:
 a : 10
 b : 20
 after Swapping:
 a : 20
 b : 10

*/ 
		 
