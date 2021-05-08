/* 
13. Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5
Expected OutputArea is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

class P13
{
  public static void main(String args[])
  {
    double width = 5.6;
	
	    double  height = 8.5;
	
	         double  perimeter = 2*(height + width);
	
                System.out.println("Perimeter is 2 * (5.6 + 8.5) = " + perimeter);
		
                     double area = width * height;
		
	                  System.out.println("Expected OutputArea is 5.6 * 8.5 = " + area);
   }
}

/*
java P13
Perimeter is 2 * (5.6 + 8.5) = 28.2
Expected OutputArea is 5.6 * 8.5 = 47.599999999999994

*/