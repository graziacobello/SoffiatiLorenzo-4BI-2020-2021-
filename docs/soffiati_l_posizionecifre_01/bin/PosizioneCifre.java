/**
 *
 * @author Lorenzo soffiati
 */

import java.util.Scanner;

public class PosizioneCifre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int num, l;
        String nume;
        boolean corretto = true;
        char carattere;

        
        num = inp.nextInt();
        nume = String.valueOf(num);
        
        if(nume.length()<11){
            for(int i=0; i<nume.length() && corretto; i++){
                carattere = nume.charAt(i);
                if((int) carattere < i+48){
                    corretto = false;
                }
                
            }
            
        }
        else corretto = false;
        
        
        if(corretto)System.out.println("proprietà rispettata");
        else System.out.println("proprietà non rispettata");
        
        
    }
}
