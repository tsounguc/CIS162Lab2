import java.util.Scanner;
/**
 * Write a description of class ConvertToDollars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConvertToDollars
{
    public static void main (String [] args)
    {
        int Quarters, Dimes, Nickels, Pennies;
        double Dollars;
        Scanner scnr = new Scanner (System.in);
        System.out.print("Enter quarters: ");
        Quarters = scnr.nextInt();
        
        System.out.print("\nEnter dimes:");
        Dimes = scnr.nextInt();
        
        System.out.print("\nEnter nickles:");
        Nickels = scnr.nextInt();
        
        System.out.print("\nEnter pennies:");
        Pennies = scnr.nextInt();
        
        Dollars = (Quarters*25 + Dimes*10 + Nickels*5 + Pennies)/100.0;
        
        System.out.println("This is equivalent to $" + Dollars);
        
        
    }
}
