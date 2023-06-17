package co.com.repuestos.ps.util;

import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Restaurante los asados de Juan");
        System.out.println("1. Churrasco");
        System.out.println("2. Pollo a la plancha");
        System.out.println("3. Lomo de cerdo a la plancha");
        System.out.print("Ingrese el número que desea ordenar: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elegido un churrasco.");
                break;
            case 2:
                System.out.println("Has elegido un pollo a la plancha. ");
                break;
            case 3:
                System.out.println("Has elegido un lomo de cerdo a la plancha.");
                break;
            default:
                System.out.println("Por favor seleccione una opción válida.");
                break;
        }

        scanner.close();
    }
}