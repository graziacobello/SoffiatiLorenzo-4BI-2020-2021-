/**
 *
 * @author Lorenzo Soffiati
 */
import java.util.Scanner;

public class PersoneAmmalate_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int popolazione;
        int tAmmalati = 1;
        int ammalati = 1;
        int giorni = 0;
        
        
        System.out.print("inserire la in numero di abitanti: ");
        popolazione = Integer.parseInt( inp.nextLine());
        
        System.out.print("\ninserire tasso di infettività: ");
        tAmmalati = Integer.parseInt( inp.nextLine());
        
        
        while(ammalati < popolazione/2){
            ammalati *= tAmmalati;
            giorni++;
        }
        
        System.out.printf("in %d giorni si avranno %d ammalati", giorni, ammalati);
        
    }
    
}
