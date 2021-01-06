/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class SerieNumeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        int numero;
        int numPrimo = 0;
        boolean primo;
        
        int i;
        
        
        do{
            System.out.print("inserire un numero che fisca con 1: ");
            numero = inp.nextInt();
            numero /= 10;
            primo = true;
            i = 2;
            while(primo == true && i<=numero/2 ){
                if(numero%i==0){ primo = false; }
                i++;
            }
            if(primo){ numPrimo++;}
            
            
        }while(numero != 1);
        
        System.out.println("numeri primi inseriti: " + --numPrimo);
    
    }
}
