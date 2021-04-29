/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialdeunnumerousuario;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Factorialdeunnumerousuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorial=1;
        int numero;
        
        Scanner cantidad = new Scanner (System.in);
        System.out.println("ingrese un numero");
        numero=cantidad.nextInt();
        
        for (int i = numero; i > 0; i--) {
            factorial=factorial*i;
        System.out.println("El factorial de : "+numero+ " es:"+factorial);
        //este codigo es para pedir a un usuario un numero parte 3 de la tarea
            
        }
    }
    
}
