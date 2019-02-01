/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestre2ejercicio6;

/**
 *
 * @author Usuario DAM 1
 */
public class Trimestre2Ejercicio6 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
    Tiempo t1 = new Tiempo(1, 20, -5);
    Tiempo t2 = new Tiempo(0, 30, 40);
    Tiempo t3 = new Tiempo(0, 35, 20);
         System.out.println(t1.toString());
    System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
    System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
  }
    
}
