package com.momento1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);

        System.out.println("Ingrese el consumo mensual de energía en kilovatios-hora: ");
        double consumo = entradaDatos.nextDouble();
        System.out.println("Ingrese el costo por kilovatio: ");
        double costo = entradaDatos.nextDouble();
        System.out.println("Ingrese la categoria del usuario R = Residencial y C = Comercial: ");
        String usuario = entradaDatos.next();

        double costoInicial = (consumo * costo);

        // Consumo clasificado.
        
        if (consumo < 100) {
            System.out.println("BAJO");
        } else if (consumo >= 100 && consumo < 500) {
            System.out.println("MEDIO");
        } else if (consumo >= 500) {
            System.out.println("ALTO");
        }

        System.out.println("El costo incial es: " + costoInicial);

        // Costo final.

        if (usuario.equals("R") && consumo >= 500) {
            double total = costoInicial * 1.10;
            System.out.println("El costo final tiene un 10% de incremento el total a pagar es: " + total);
        } else if (usuario.equals("C") && consumo >= 100 && consumo < 500) {
            double total = costoInicial * 1.05;
            System.out.println("El costo final tiene un 5% de incremento el total a pagar es: " + total);
        } else{
            System.out.println("Por su consumo no tiene incremento. El valor a final es: " + costoInicial);
        }

    }

}
