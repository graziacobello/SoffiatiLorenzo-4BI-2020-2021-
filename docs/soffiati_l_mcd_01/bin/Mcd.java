/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class Mcd {
    
    public static int MCD (int num1, int num2){
        
        //variabili
        int resto;
        
        while(num2 != 0){
            
            resto = num1 % num2;
            num1 = num2;
            num2 = resto;
            
        }
        
    return num2;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int num1,num2;
        
        System.out.print("inserire il primo numero: ");
        num1 = inp.nextInt();
        
        System.out.print("inserire il secondo numero: ");
        num2 = inp.nextInt();
        
        
        System.out.println("l' MCD è: " + MCD(num1, num2));
    }
    
}
