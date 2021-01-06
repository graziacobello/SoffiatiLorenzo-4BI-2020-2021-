/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class SerieNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numPrecedente = 0;
        int num = 0;
        
        do{
            System.out.println("\nInserire un intero: ");
            num = Integer.parseInt(inp.nextLine());
            if(num != numPrecedente){
                numPrecedente = num;
            }
            
        }while(numPrecedente == num);
        
        System.out.println("\n\nfine");
        
        
    }
    
}
