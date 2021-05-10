class Pattern18
{
 public static void main(String args[])
 {  
     char A=65;
   for(int i=4;i>=0;i--)
   {
     for(int j=0;j<=i;j++)
	 {
	   System.out.print((char)(A+j)+ " ");
	  
	   }
	   System.out.println( );
	 }
	}
  }
  
  /*
  java Pattern18
A B C D E
A B C D
A B C
A B
A

*/