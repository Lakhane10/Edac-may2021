class Inverted_fullpyramid
{
  public static void main(String[] args)
  {
	for (int i=1;i<=5;i++)
	{
		for(int j=1;j<=i-1;j++)
		{
		System.out.print(" ");
		}
		for(int k=0;k<=5-i;k++)
		{
		 System.out.print("* ");
		}
				
			System.out.println();
			}
		}
}
/*
java Inverted_fullpyramid
* * * * *
 * * * *
  * * *
   * *
    *

*/