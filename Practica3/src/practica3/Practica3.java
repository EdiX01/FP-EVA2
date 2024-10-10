
package practica3;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String Cad;
        System.out.println("Introduce una cadena de texto: ");
        Cad = captu.nextLine();
        
        for(int i = 0; i <= Cad.length(); i++){
            System.out.println(Cad.charAt(i));
        }
    }
    
}
