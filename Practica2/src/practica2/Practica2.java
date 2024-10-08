
package practica2;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int Num1, Num2;
        System.out.println("Introduce 2 numeros: ");
        Num1 = captu.nextInt();
        Num2 = captu.nextInt();
        System.out.println(Num1);
        Num2 = Num2 - 1;
        
        for(int i = Num1; i <= Num2; i++){
           System.out.println(i + 1);
        }
        Num2 = Num2 + 1;
        Num1 = Num1 + 1;
        for(int i = Num2; i >= Num1; i--){
        System.out.println(i - 1);
    }
        
    }
    
}
