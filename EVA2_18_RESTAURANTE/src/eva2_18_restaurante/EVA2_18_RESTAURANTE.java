/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_restaurante;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA2_18_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu[] = {"Dogos", "Hamburguesa", "Boneless", "Tacos", "Montados", "Camarones"};
        int precios[] = {50, 80, 120, 150, 70, 200};
        Scanner captu = new Scanner(System.in);
        int Can, Pro;
        for (int i = 0 ; i < menu.length; i++){
            System.out.println(i + " - "+ menu[i] + " $"+ precios[i]);
        }
        System.out.println("Cual es tu orden? (Introduce un numero del menu)");
        Pro = captu.nextInt();
        System.out.println("Cuantas ordenes?");
        Can = captu.nextInt();
        System.out.println("el costo total es de $"+ Can * precios[Pro]);
        
        
    }
    
}
