
package practica5;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int Num;
        String acum = "*";
        System.out.println("Introduce un numero: ");
        Num = captu.nextInt();
        System.out.println("*");
        Num = Num - 2;
        
        for(int i = 0; i <= Num; i++){
                acum = acum + "*";
                System.out.println(acum);
            }
        
    }
    
}
