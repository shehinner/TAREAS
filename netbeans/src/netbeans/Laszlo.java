/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Laszlo {
    public static void main(String[] args) {
        System.out.println("20$eG,pjFf20");
        // determinar si un numero si tiene tres digitos
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        if(numero<1000 & numero>99 ){
            System.out.println("tiene tres digitos");
        }else{
            System.out.println("no tiene tres digitos");
        }
    }
}