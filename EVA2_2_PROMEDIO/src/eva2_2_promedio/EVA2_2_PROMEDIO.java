/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Cal, acum = 0;
        Scanner captu = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Estudiante #"+i);
            System.out.println("Introduce tu calificacion");
            Cal = captu.nextInt();
            captu.nextLine();
            acum = acum + Cal;
        }
        System.out.println("Promedio = "+(acum/10.0));
    }
    
}
