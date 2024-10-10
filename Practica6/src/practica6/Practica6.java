/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class Practica6 {

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
        Num = Num + 2;
        for(int i = Num; i >= 1; i--){
            acum = "*";
            for(int x = 2; x <= i; x++){
                acum = acum + "*";
            }
            System.out.println(acum);
        }
    }
    
}
