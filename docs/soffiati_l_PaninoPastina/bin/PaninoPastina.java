/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class PaninoPastina {
    
    
    public static void out(){
        
        System.out.println("\ndigitare un numero in base alla scelta fatta");
        System.out.println("[1] pastina");
        System.out.println("[2] panino");
        System.out.println("[3] niente");
        System.out.print("\ninseritre opzione: ");
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        
        double soldi;
        double pastina = 1.0;
        double panino = 1.5;
        String scelta;
        boolean abbastanza = true;
        
        int gMangiato = 0;
        int gPastine = 0;
        int gPanini = 0;
        int gTot = 0;
        
        
        
        System.out.print("inserire quanti soldi ha Mario: ");
        soldi = Float.parseFloat(inp.nextLine());
        System.out.println("\n");
        
        while(abbastanza && soldi >= 1.0){
            out();
            scelta = inp.nextLine();
            
            if(scelta.contains("1") && soldi-pastina >= 0){
                soldi -= pastina;
                gMangiato++;
                gPastine++;
            }
            else if(scelta.contains("2") && soldi-panino >= 0){
                soldi -= panino;
                gMangiato++;
                gPanini++;
            }
            else if(!scelta.contains("3")){
                abbastanza = false;
                System.out.println("non ha abbastanza soldi");
            }
            
            if(abbastanza){
                gTot++;
            }
            System.out.println(soldi);
        }
        
        System.out.printf("Mario ha mangiato %d giorni su %d di cui %d giorni con pastine e %d giorni con panini ",gMangiato, gTot, gPastine, gPanini);
        
        
    }
    
}
