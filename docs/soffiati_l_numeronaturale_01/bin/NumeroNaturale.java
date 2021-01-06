/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class NumeroNaturale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //variabili    
        Scanner inp = new Scanner(System.in);
        int num;
        int cifre;
    
    //code    
        System.out.print("inserire un numero: ");
        num = inp.nextInt();
        
        cifre = String.valueOf(num).length();
        
        System.out.printf("\n ilo numreo è composto da %d cifre", cifre);
        
       
    }
    
}
