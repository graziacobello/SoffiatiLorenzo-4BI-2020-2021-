/**
 *
 * @author Lorenzo Soffiati
 * 
 */

import java.util.Scanner;

public class DepositoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int saldo;
        int interesse;
        int soglia;
        int anno = 0;
        
        System.out.print("inserire il saldo iniziale: ");
        saldo = Integer.parseInt(inp.nextLine());
        System.out.print("\ninserire la percentuale di interesse: ");
        interesse = Integer.parseInt(inp.nextLine());
        
        System.out.println("\ninserire la soglia che si vuole raggiungere: ");
        soglia = Integer.parseInt(inp.nextLine());
        
        while(saldo<soglia){
            saldo += (saldo/100)*interesse;
            anno++;
            
        }
        
        System.out.printf("in %d anni ha raggiunto un saldo di %d", anno, saldo);
          
    }
    
}
