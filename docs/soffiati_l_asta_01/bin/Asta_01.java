/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class Asta_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //dichiarazione variabili
        Scanner inp = new Scanner(System.in);
        float prezzo = 0;
        int compratore = 0;
        boolean asta = true;
        
        int tPrezzo;
    
    //code
        while (asta){
            
            //primo compratore
            System.out.print("\ninserire offerta del primo compratore: ");
            tPrezzo = Integer.parseInt(inp.nextLine());
            if (tPrezzo>prezzo){
                prezzo = tPrezzo;
                compratore = 0;
            }
            else if(tPrezzo == 0 ){
                asta = false;
            }
            
            //secondo compratore
            if (asta){
                System.out.print("\ninserire offerta del secondo compratore: ");
                tPrezzo = Integer.parseInt(inp.nextLine());
                if (tPrezzo>prezzo){
                    prezzo = tPrezzo;
                    compratore = 1;
                }
                else if(tPrezzo == 0 ){
                    asta = false;
                }
                
            }
            
        }
        
        System.out.print("\nIl vincitore è");
        
        if(compratore == 1){  System.out.print(" il primo compratore "); }
        else { System.out.print(" il secondo compratore "); }
        
        System.out.printf("con %f euro", prezzo);   
        
    }
    
}
