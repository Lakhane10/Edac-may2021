class Pattern5
{
  public static void main(String args[])
  {
      char A=64;
    for(int i=1;i<=5;i++)
	{
	  for(int j=1;j<=i;j++)
	  {
	    System.out.print((char)(A+i)+" ");
	   }
	  System.out.println();
	 } 
   }
}
/*
java Pattern5
A
B B
C C C
D D D D
E E E E E
*/