/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos;

/**
 *
 * @author EdiX
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String DiaS[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int valores[] = {20, 50, 100, 200, 500, 1000, 2000};
        for (int i = 0; i < DiaS.length; i ++){
            System.out.println(DiaS[i] + " - "+ valores[i]);
        }
    }
    
}
