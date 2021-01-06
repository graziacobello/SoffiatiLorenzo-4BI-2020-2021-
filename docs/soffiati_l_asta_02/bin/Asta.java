/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class Asta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //variabili
        
        Scanner inp = new Scanner(System.in);
    
        int prezzoTot = 0;
        
        int offerta1 = 0;
        int offerta2 = 0;
        int temp;
        
        int turno = 0;
        
        boolean asta = true;
        
        while (asta){
            
            do{
                System.out.print("\ninserire offerta del primo: ");
                temp = inp.nextInt();
                offerta1 += temp;
                
            }while(offerta1 < offerta2);
            
            if(temp != 0){
                do{
                System.out.print("\ninserire offerta del secondo: ");
                temp = inp.nextInt();
                offerta2 += temp;
                
                }while(offerta2 > offerta1);
                
                if(temp == 0){ asta = false; }
            }
            else{ asta = false; }
            
        }
        
        
        System.out.print("il vincitore dell'asta è ");
        
        if(offerta1 > offerta2){
            System.out.print("il primo con l'offerta di");
            System.out.println(offerta1);
        }
        else{
            System.out.print("il secondo con l'offerta di");
            System.out.println(offerta2);
        }
        
    }
    
}
