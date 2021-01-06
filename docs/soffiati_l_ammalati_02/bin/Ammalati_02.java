/**
 *
 * @author Lorenzo Soffiati
 */
import java.util.Scanner;

public class Ammalati_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        int ammalati;
        int giorni = 0;
        float percent;
        
        System.out.print("inserire numero di ammalati: ");
        ammalati = Integer.parseInt(inp.nextLine());
        
        System.out.print("\ninserire percentuale guariti giornalieri: ");
        percent = Float.parseFloat(inp.nextLine());
        
        
        while (ammalati>=100){
            ammalati -= (ammalati*percent)/100;
            giorni++;
        }
        
        System.out.printf("ci voranno %d giorni affinche il numero di ammalati sia %d \n", giorni, ammalati);
        
    }
    
}
