package org.example;

import java.util.Scanner;

/*Ingresar 10 números por teclado, informar su suma y promedio.*/
public class Ejercicio8
{
    public static void main(String[] args)
    {
        float acumulador = 0;
        float promedio = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
     for (int i = 0;i < 10; i++ )
     {
         System.out.printf("Ingrese un numero: " );
         acumulador += sc.nextFloat();
         cont++;
     }
        System.out.printf(" La suma de los numeros ingresados es: " + acumulador);
        System.out.println(" El promedio es de: " + (acumulador/ cont));
    }
}
