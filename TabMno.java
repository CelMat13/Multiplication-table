/**
 *
 * @author mcelejewski
 */
package tabmno;

import java.util.Scanner;


public class TabMno
{
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int a=1, b=1;
        
        System.out.print("Wpisz wiersz: ");
        a = keyboard.nextInt();
        
        System.out.print("Wpisz kolumny: ");
        b = keyboard.nextInt();
        
        for (int i=1; i<=a; i++)
        {
            for (int j=1; j<=b; j++)
            {
                int w = i*j;
                System.out.printf("%4d", w);
                
            }
            System.out.println(); 
        }
       
    }
    
}
