/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.suma.recursiva;
//Importamos libreria scanner
import java.util.Scanner;

/**
 *
 * @author Roberto Calero
 */

public class SumaRecursiva {
    static int suma;
    public static void main(String[] args) {
        System.out.println("Suam recursiva");
        //Llamamos al medoto
        sumaRecursiva();
        System.out.println("La suma es: " + suma);
    }
    
    
    
    public static void sumaRecursiva(){
        //Definicion de variable
        int num;
        //Definimos variable Scanner
        Scanner temp = new Scanner(System.in);
        //Solicitud de accion/Petidion de numero/Mensaje
        System.out.println("Ingerese numero");
        num = temp.nextInt();
        if(num==0){
            return;
        }
        suma = suma + num;
        sumaRecursiva();
    }
    
}
/*
Ejercicio de recursividad
Problema;
Realizar una suma recursiva la cual sume numeros hasta ingresar el cero y muestre la suma de los numeros ingresados
*/