import java.util.Scanner;

public class Shopping_List
{
   public static void main(String[] args)
{
Scanner KB = new Scanner(System.in);
double StateTax, SalesTax, SubTotal, Total, Price_1, Price_2, Price_3, Price_4, Price_5;
String Item_1, Item_2, Item_3, Item_4, Item_5;


System.out.println("Enter First Item");
Item_1 = KB.nextLine();
System.out.println("Enter First Item Price");
Price_1 = KB.nextDouble();
KB.nextLine();

System.out.println("Enter Second Item");
Item_2 = KB.nextLine();
System.out.println("Enter Second Item Price"); 
Price_2 = KB.nextDouble();
KB.nextLine();

System.out.println("Enter Third Item");
Item_3 = KB.nextLine();
System.out.println("Enter Third Item Price");
Price_3 = KB.nextDouble();
KB.nextLine();

System.out.println("Enter Fourth Item");
Item_4 = KB.nextLine();
System.out.println("Enter Fourth Item Price");
Price_4 = KB.nextDouble();
KB.nextLine();

System.out.println("Enter Fifth Item");
Item_5 = KB.nextLine();
System.out.println("Enter Fifth Item Price");
Price_5 = KB.nextDouble();
KB.nextLine();

Total = Price_1 + Price_2 + Price_3 + Price_4 + Price_5;

StateTax = .07;

SalesTax = StateTax * Total;

SubTotal = Total + SalesTax;

System.out.println("\tHere is your receipt");

System.out.println("*************************");

System.out.println(Item_1 + "\t\t $" + Price_1);
System.out.println(Item_2 + "\t\t $" + Price_2);
System.out.println(Item_3 + "\t $" + Price_3);
System.out.println(Item_4 + "\t\t $" + Price_4);
System.out.println(Item_5 + "\t\t $" + Price_5);
System.out.println("Sales Tax \t $" + SalesTax);
System.out.println("Subtotal \t $" + Total);
System.out.println("Total \t\t $" + SubTotal);

}
}
