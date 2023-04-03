package org.example;

import java.util.Scanner;

/*Ingresar un número n y a continuación n números positivos. Informar la cantidad de mayores a 5 que se hayan ingresado.*/
public class Ejercicio9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Cuantos numeros van a ser?: \n");
        int n = sc.nextInt();
        int cont = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.printf("Ingrese un numero entero positivo: \n");
            int num = sc.nextInt();
            if (num > 0)
            {
                if (num > 5) {
                    cont++;
                }
            }
        }
        System.out.printf("La cantidad de numeros mayores a 5 es: " + cont);
    }
}
