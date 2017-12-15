/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_de_un_numero;

import java.util.Scanner;

/**
 *Pedir un número y calcular su factorial.
 * @author Camilo
 */
public class Factorial_de_un_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double factorial;
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce Un numero");
        numero = entrada.nextInt();
        
        factorial = 1;// es importante inicializarlo a 1, ya que multiplicará-
        // por ejemplo: el factorial de 10 es:
        // 10*9*8*7*6*5*4*3*2*1
        
        for (int i = numero; i > 0; i--) {
            factorial = factorial*i;
            
        }
        
        System.out.println("El factorial de :" + numero+ " Es : "+ factorial);
        
    }
    
}
