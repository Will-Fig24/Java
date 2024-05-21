/*William Figueroa
Prof. F. Aljamal
CSC-117-02
Due Date: 3/3/20

Write a java program to calculate the circumference for the following shapes:
1 for Triangle
2 for Rectangle
3 for Square*/

import java.util.Scanner;

public class CircumferenceCaseInt
{
   public static void main(String[] args)
   {
      Scanner KB = new Scanner(System.in);
      
      int shape;
      double sideTri1, sideTri2, sideTri3;
      double widthRect, lengthRect;
      double sideSqare;
      double cirTriangle, cirRectangle, cirSquare;
      
      System.out.println("Make a choice: \n" + 
                         "1 for Triangle \n" +
                         "2 for Rectangle \n" +
                         "3 for Square");
                         
      shape = KB.nextInt();
         
         switch (shape) 
         {
            case 1:
            System.out.println("Side 1 of Triangle is:");
            sideTri1 = KB.nextDouble();
      
            System.out.println("Side 2 of Triangle is:");
            sideTri2 = KB.nextDouble();
      
            System.out.println("Side 3 of Triangle is:");
            sideTri3 = KB.nextDouble();
      
            cirTriangle = sideTri1 + sideTri2 + sideTri3;
      
            System.out.println("Triangle: ");
            System.out.println("\t Side 1 = " + sideTri1 + 
                               "\t Side 2 = " + sideTri2 +
                               "\t Side 3 = " + sideTri3);
            System.out.println("Circumference = " + cirTriangle);
               break;
        
         case 2:
            System.out.println("Width of Rectangle is: ");
            widthRect = KB.nextDouble();
            
            System.out.println("Length of Rectangle is: ");
            lengthRect = KB.nextDouble();
      
            cirRectangle = (widthRect * 2) + (lengthRect * 2);
      
            System.out.println("Rectangle: ");
            System.out.println("\tLength = " + lengthRect + 
                               "\tWidth = " + widthRect);
            System.out.println("\tCircumference = " + cirRectangle);      
               break;
          
          case 3:
            System.out.println("Side of Square is: ");
            sideSqare = KB.nextDouble();
            
            cirSquare = sideSqare * 4;
            
            System.out.println("Square: ");
            System.out.println("\tSide = " + sideSqare);
            System.out.println("\tCircumference = " + cirSquare);
               break; 
          
          default:
            System.out.println("Invalid");
          }
   }
 }
