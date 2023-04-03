package org.example;

import java.util.Scanner;

/*Ingresar un número y validar que sea positivo. Si no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.*/
public class Ejercicio10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = -1;
        while (n < 0)
        {
            System.out.println("Ingrese un numero positivo: ");
            n = sc.nextInt();
        }
    }
}
