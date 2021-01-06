/**
 *
 * @author Lorenzo Soffiati
 */

import java.util.Scanner;

public class ControlloInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int tot = 0;
        int num;
        
        do{
            
            System.out.print("\ninserire numero: ");
            num = inp.nextInt();
            
            do{
                System.out.print("\ninserire numero diverso da 0: ");
                num = inp.nextInt();
            }while(num<0);
            
            if(num>0){
                tot += num;
            }
            
        }while(num != 0);
        
        System.out.println("\n\nla somma dei numeri è: " + num);
        
    }
    
}
