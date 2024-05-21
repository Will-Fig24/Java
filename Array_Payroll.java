import java.util.Scanner;
public class Array_Payroll
{
   public static void main(String[] args)
   {
      Scanner KB = new Scanner(System.in);

         int SIZE = 3;
         
         String [ ] F_Name = new String [SIZE];
         char [ ] MI = new char [SIZE];
         String [ ] L_Name = new String [SIZE];
         int [ ] ID = new int [SIZE];
         double [ ] rate = new double [SIZE];
         double [ ] hours = new double [SIZE];
         double [ ] pay = new double [SIZE];
         double [ ] OT = new double [SIZE];
         double [ ] overTime = new double [SIZE];
         double [ ] gross = new double [SIZE];
         double [ ] stateTax = new double [SIZE];
         double [ ] fedTax = new double [SIZE];
         double [ ] unionFee = new double [SIZE];
         double [ ] net = new double [SIZE];

         for (int workers = 0; workers < SIZE; workers++)
            {
               System.out.println("First Name?");
               F_Name [workers] = KB.nextLine();

               System.out.println("Middle Initial?");
               MI [workers] = KB.next().charAt(0);

               System.out.println("Last Name?");
               KB.nextLine();
               L_Name [workers] = KB.nextLine();

               System.out.println("What is your ID #?");
               ID [workers] = KB.nextInt();
               
               System.out.println("What is your hourly rate?");
               rate [workers] = KB.nextDouble();
               
                  if(rate [workers] < 0)
                     {
                        System.out.println("Error! Please double check your rate!");
                        rate [workers] = KB.nextDouble();
                     }
               
               System.out.println("How many hours did you work?");
               hours [workers] = KB.nextDouble();
               KB.nextLine();
                  
                  if(hours [workers] < 0)
                     {
                        System.out.println("Error! Please double check your hours!");
                        hours [workers] = KB.nextDouble();
                     }
            }
            
         for (int workers = 0; workers < SIZE; workers++)
            {
                  if(hours [workers] > 40)
                     {
                        overTime [workers] = (hours [workers] - 40) * rate [workers] *  1.5;
                     }
                   
                   else
                     {
                        pay [workers] = rate [workers] * hours [workers];
                     }
            
               OT [workers] = hours [workers] - 40;
                  if (hours [workers] < 40) 
                     {
                        System.out.print("");
                     }
               gross [workers] = (rate [workers] * hours [workers] + overTime [workers]);
               stateTax [workers] = (gross [workers] * .06);
               fedTax [workers] = (gross [workers] * .12);
               unionFee [workers] = (gross [workers] * .01);
               net [workers] = gross [workers] - (stateTax [workers] + fedTax [workers] + unionFee [workers]);
            }
               
         System.out.printf("%60s", "Data Housing Corp. Payroll \n");
         System.out.println("==============================================================================" +
         "================");
         
         System.out.printf("%s %3s %5s %3s %7s %10s %7s %11s %11s %11s %8s", "F.Name", "MI", "L.Name", "ID", 
         "Rate", "OT Hours", "Gross", "State Tax", "Fed Tax", "Union Fee", "Net \n");
         
         System.out.printf("%s %s %s %3s %8s %10s %2s %11s %10s %11s %11s", "=======", "===", "=====", 
         "==", "======", "========", "=======", "=========", "=======", "=========", "======== \n");
               
         for (int workers = 0; workers < SIZE; workers++)
            {
               System.out.print(F_Name [workers] + "\t\t" + MI [workers] + "\t" + L_Name [workers] + 
               "\t " + ID [workers]); 
               System.out.print("\t$" + rate [workers] + "\t\t  " + OT [workers] + "\t$" + 
               gross [workers]);
               System.out.print("\t $" + stateTax [workers] + "\t\t  $" + fedTax [workers] + 
               "\t\t  $" + unionFee [workers]); 
               System.out.print("\t\t$" + net [workers] + "\n");
            }
   }
} 
