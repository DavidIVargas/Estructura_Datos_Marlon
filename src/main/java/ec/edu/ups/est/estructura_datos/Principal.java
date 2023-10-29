/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.est.estructura_datos;

import java.util.Scanner;

/**
 *
 * @author davidvargas
 */
public class Principal {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingrese los elementos del arreglo uno por uno:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elija un método de ordenamiento:");
        System.out.println("1. Selección");
        System.out.println("2. Inserción");
        System.out.println("3. Burbuja con ajuste");
        int opcion = sc.nextInt();

        OrdenamientoAlgoritmos ordenador = new OrdenamientoAlgoritmos();

        switch (opcion) {
            case 1:
                ordenador.ordenamientoSeleccion(arr);
                break;
            case 2:
                ordenador.ordenamientoInsercion(arr);
                break;
            case 3:
                ordenador.ordenamientoBurbujaConAjuste(arr);
                break;
            default:
                System.out.println("Opción no válida");
        }

        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
