/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;


public class FattoriPrimi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int numero;
        int count;
        
        System.out.print("inserire un numero: ");
        numero = inp.nextInt();
        
        if(numero == 0){
            System.out.println("lo 0 non si può fattorizzare");
        }else{
            
            count = 2;
            System.out.println("la fattorizzazione del numero è: ");
            while(numero != 1){
                
                if(numero%count == 0){
                    numero /= count;
                    System.out.print(count);
                    if(numero!=1){
                        System.out.print("*");
                    }
    
                }else{ count++; }
            }
            
            System.out.println("");
        
        }
    }
    
}
