/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author DELL
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double var1 = Math.sqrt(81);
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1; 
        double var7 = 100/25; 
        double var8 = Math.sqrt(100);
        
        boolean resultado = (var1 + var2 / var3 == var4) || (var5 > var6) && (var7 > var8);
        
        System.out.println (resultado);
        
    }
    
}
