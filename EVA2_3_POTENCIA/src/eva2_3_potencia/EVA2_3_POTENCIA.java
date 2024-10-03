/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int Ba,Ex, acum = 1;
        System.out.println("Captura la base: ");
        Ba = captu.nextInt();
        captu.nextLine();
        System.out.println("Captura el exponente: ");
        Ex = captu.nextInt();
        captu.nextLine();
        
        for(int i = 1; i <= Ex; i++){
        acum = acum * Ba;
    }
        System.out.println("Resultado de la potencia = "+acum);
    }
    
}
