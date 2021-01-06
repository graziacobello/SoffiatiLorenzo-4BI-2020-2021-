/**
 *
 * @author Lopi
 */

import java.util.Scanner;

public class SerieNumeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        int maggiore = 0;
        int numero = 0;
        
        
        do{
        System.out.print("inserire un numero intero: ");
        numero = Integer.parseInt(inp.nextLine());
        if(numero > maggiore){
            maggiore = numero;
        }
        }while(numero >= maggiore); 
        
        System.out.println("fine");
    
    }
}
