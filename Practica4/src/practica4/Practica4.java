
package practica4;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class Practica4 {

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
            
        if(Cad.charAt(i) == 'a'){
            System.out.println("a");
        }else if(Cad.charAt(i) == 'e'){
            System.out.println("e");
        }else if(Cad.charAt(i) == 'i'){
            System.out.println("i");
        }else if(Cad.charAt(i) == 'o'){
            System.out.println("o");
        }else if(Cad.charAt(i) == 'u'){
            System.out.println("u");
        }else{
            System.out.println("");
        }
        }
    }
    
}
