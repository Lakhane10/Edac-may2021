class Pattern9
{
  public static void main(String args[])
  {
    char A=64;
	for(int i=1;i<=5;i++)
	{
	 for(int j=4;j>=i;j--)
	 {
	   System.out.print(" ");
	  }
	  for(int k=1;k<=i;k++)
	  {
	   System.out.print((char)(A+k)+" ");
	   }
	   System.out.println();
	  }
	}
 }
 /*
 java Pattern9
    A
   A B
  A B C
 A B C D
A B C D E
*/