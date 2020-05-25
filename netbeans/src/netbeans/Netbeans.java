/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans;

import java.util.Scanner;

/**
 *
 * @author EL LOL
 */
public class Netbeans {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite un numero");

        int numero = entrada.nextInt();
        /*4.  Leer un número entero de dos dígitos y determinar 
        a cuánto es igual la suma de sus dígitos. */
 /*Leer un número entero de dos dígitos
                y determinar si ambos dígitos son pares.*/
        //Leer dos números enteros y determinar cuál es el mayor. 

        if (numero % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println(" es impar");
        }
    }

}
