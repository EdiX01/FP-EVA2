/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int Num,Fact = 1;
        System.out.println("Introduce un numero para sacarle factorial: ");
        Num = captu.nextInt();
        captu.nextLine();
        
        for (int i = Num; i >= 1; i--){
            Fact = Fact * i;
        }
        System.out.println("La Factorial de "+Num+" es: "+Fact);
        
    }
    
}
