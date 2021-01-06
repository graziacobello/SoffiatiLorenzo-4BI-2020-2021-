/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class Alghe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int inizio;
        int raggiungere;
        int anni = 0;
        
        System.out.print("inserire la popolazione iniziale: ");
        inizio = Integer.parseInt(inp.nextLine());
        System.out.print("\ninserire la popolazione che si vuole raggiungere: ");
        raggiungere = Integer.parseInt(inp.nextLine());
        
        while (inizio < raggiungere){
            
            inizio*=2;
            if (inizio < raggiungere){
                inizio -= inizio/3;
                anni += 2;
            }
            else{ anni++; }
        }
        
        System.out.printf("la popolazione arriva a %d dopo %d anni",inizio, anni);
        
    }
    
}
