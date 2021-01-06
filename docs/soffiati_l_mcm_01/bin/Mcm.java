/**
 *
 * @author Lorenzo soffiati
 */

import java.util.Scanner;


public class Mcm {
    
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
        int num1, num2;
        int mcm;
        
        do{
        System.out.print("inserire un numero: ");
        num1 = inp.nextInt();
        System.out.print("\ninserire un altro numero: ");
        num2 = inp.nextInt();
        }while(num1 != 0 && num2 != 0);
        
        mcm = (num1 * num2)/MCD(num1, num2);
        
        System.out.printf("\nl' mcm è %d", mcm);
        
    }
    
}
