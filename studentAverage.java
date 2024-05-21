import java.util.Scanner;

public class studentAverage
{
   public static void main (String[] args)
   {
      Scanner KB = new Scanner (System.in);
      
      int score1, score2, score3, ID;
      double avg;
      String studentFirst, studentLast;
      
      
      for (int ct = 0; ct < 3; ct++)
      { 
         System.out.printf("What is the student's first name \n");
         studentFirst = KB.nextLine();
         
         System.out.printf("What is the student's last name \n");
         studentLast = KB.nextLine();
         
         System.out.printf("Enter student ID \n");
         ID = KB.nextInt();
     
         System.out.printf("Enter first score 1: \n");
         score1 = KB.nextInt();
      
         System.out.printf("Enter first score 2: \n");
         score2 = KB.nextInt();
         
         System.out.printf("Enter first score 3: \n");
         score3 = KB.nextInt();
      
         System.out.printf("ID : %d \n", ID);
         System.out.printf("First Name: %s \n", studentFirst);
         System.out.printf("Last Name: %s \n", studentLast);
         System.out.printf("Score 1: %d \n", score1);
         System.out.printf("Score 2: %d \n", score2);
         System.out.printf("Score 3: %d \n", score3);
         avg = (score1 + score2 + score3)/3; 
         System.out.printf("Average is: %.1f \n", avg);
         KB.nextLine();
      }
   }
}