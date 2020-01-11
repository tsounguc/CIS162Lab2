import java.util.Scanner;
/**
 * Description: This code prompts the user to enter three integers for hours, minutes and seconds. 
 * It then converts those values into seconds .
 *
 * @author Christian Tsoungui Nkoulou
 * @version 1/16/2018
 */
public class ConvertToSeconds
{
    public static void main(String [] args ) {
        System.out.println("Hello! This program converts time to seconds. ");
        Scanner scnr = new Scanner (System.in); 
        int Hours;
        int minutes; 
        int seconds;
        int x;
        System.out.print("Enter hours: ");
        Hours = scnr.nextInt();
        System.out.print("\nEnter minutes: ");
        minutes = scnr.nextInt();
        System.out.print("\nEnter seconds: ");
        seconds = scnr.nextInt();
        x = Hours*3600 + minutes*60 + seconds;
        System.out.print("This is equivalent to " + x + " seconds");
 
    }
}