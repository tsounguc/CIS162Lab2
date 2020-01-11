import java.util.Scanner;
/**
 * Description: This code prompts the user to enter one integer for the number of seconds. 
 * It then converts that value into hours, minutes and secons .
 *
 * @author Christian Tsoungui Nkoulou
 * @version 1/16/2018
 */
public class ConvertFromSeconds
{
    public static void main(String [] args ) {
        System.out.println("Hello! This program converts from seconds. ");
        Scanner scnr = new Scanner (System.in); 
        int Hours;
        int minutes; 
        int seconds;
        int x;
        System.out.print("Enter seconds: ");
        x = scnr.nextInt();
        Hours = x / 3600;
        x %= 3600;
        minutes = x/60;
        x %= 60;
        seconds = x;
        
        System.out.println("This is " + Hours + " hours " + minutes + " minutes " + seconds + " seconds");
 
    }
}