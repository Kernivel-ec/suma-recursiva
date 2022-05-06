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
    //Definimos una variable global/Utilizable desde cualquier metodo o funcion
    static int suma;
    //Metodo principal
    public static void main(String[] args) {
        System.out.println("Suam recursiva");
        //Llamamos al medoto recursivo
        sumaRecursiva();
        //Salida de resultado suma
        System.out.println("La suma es: " + suma);
    }
    //Metodo creado para la recursividad
    public static void sumaRecursiva(){
        //Definicion de variable local/Utilizable solo por el metodo
        int num;
        //Definimos variable Scanner
        Scanner temp = new Scanner(System.in);
        //Solicitud de accion/Petidion de numero/Mensaje
        System.out.println("Ingerese numero");
        //Guardado de numero ingresado por teclado
        num = temp.nextInt();
        //Condicion de salida, si el verdadero detiene la recursividad
        if(num==0){
            return;
        }
        //Suma de variable global con local
        suma = suma + num;
        //Llamada a si mismo/Recursividad
        sumaRecursiva();
    }   
}
/*
Ejercicio de recursividad
Problema;
Realizar una suma recursiva la cual sume numeros hasta ingresar el 0 y muestre la suma de los numeros ingresados
El proceso es el mismo en resta, division y multiplicacio, puede necesitar arreglos dependiendo de la logica del problema
*/