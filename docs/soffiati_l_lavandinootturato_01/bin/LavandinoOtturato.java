/**
 *
 * @author Lorenzo Soffiati
 */
import java.util.Scanner;

public class LavandinoOtturato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //variabili
        Scanner inp = new Scanner(System.in);
        
        int perdRub, perdLav;
        int inizio, maxAcq;
        int i=0;
        
    //code
    
        System.out.print("qunto perde il rubinetto: ");
        perdRub = inp.nextInt();       
        System.out.println("quanto perde il lavandino: ");
        perdLav = inp.nextInt();
        
        System.out.println("capacita massimo del lavandino: ");
        maxAcq = inp.nextInt();   
        System.out.println("quanta acqua c'è all'inizio: ");
        inizio = inp.nextInt();
        
        
        while(i<21 || inizio >= maxAcq || inizio <= 0){
            if(i%3==0){
                inizio += perdRub;
            }
            inizio -= perdLav;
            
            i++;
        }
        
        
        System.out.printf("in %d secondi nel lavandino ci sono %d cl", i, inizio);
    }
    
}
