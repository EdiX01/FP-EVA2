
package practica.pkg1;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int Num;
        String Cad;
        System.out.println("Introduce una cadena de texto: ");
        Cad = captu.nextLine();
        System.out.println("Introduce el numero de veces que se va a repetir");
        Num = captu.nextInt();
        
        for(int i = 1 ; i <= Num; i++){
            System.out.println(Cad);
        }
        
    }
    
}
