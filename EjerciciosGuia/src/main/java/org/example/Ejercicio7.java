package org.example;

import java.util.Scanner;

/*
 *Una empresa de alquiler de autos cobra $300 por día si no se superan los 200 km de uso diario.
 * Por cada km extra hasta los 1000 km cobra $5 adicionales, y a partir de los 1000 cobra $10 adicionales.
 * Hacer un programa que solicite la cantidad de km realizados por un cliente e indique el importe que se le debe cobrar.
 * */
public class Ejercicio7 {
    public static void main(String[] args) {
        float montoCobrar = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de km realizados");
        float kmRealizados = sc.nextFloat();
        System.out.printf("Cantidad de dias");
        int dias = sc.nextInt();
        if (kmRealizados > 1000)
        {
            montoCobrar = (dias * 300) + ((kmRealizados - 1000) * 10);
        } else
        {
            if (kmRealizados > 200)
            {
                montoCobrar = (dias * 300) + ((kmRealizados - 1000) * 5);
            } else {
                montoCobrar = (dias * 300);
            }
        }
        System.out.printf("El monto a cobrar por usar el vechiculo " + dias + " dias, es de: $" + montoCobrar);
    }
}
