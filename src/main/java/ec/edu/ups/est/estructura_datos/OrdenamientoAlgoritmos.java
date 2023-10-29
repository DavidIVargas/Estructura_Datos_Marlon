/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructura_datos;

/**
 *
 * @author davidvargas
 */
public class OrdenamientoAlgoritmos {
    public void ordenamientoSeleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Iteración " + (i + 1) + ":");
            System.out.print("Valores a comparar: ");
            for (int j = i + 1; j < n; j++) {
                System.out.print(arr[i] + " y " + arr[j] + "  ");
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println();
        }
    }

    public void ordenamientoInsercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            System.out.println("Iteración " + i + ":");
            int key = arr[i];
            int j = i - 1;
            System.out.println("Valores a comparar (A y B): " + key + " y " + arr[j]);
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                System.out.println("Intercambio: " + arr[j] + " por " + key);
                j--;
                if (j >= 0) {
                    System.out.println("Valores a comparar (A y B): " + key + " y " + arr[j]);
                }
            }
            arr[j + 1] = key;
        }
    }

    public void ordenamientoBurbujaConAjuste(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Iteración " + (i + 1) + ":");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("Valores a comparar (A y B): " + arr[j] + " y " + arr[j + 1] + "  ");
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println();
        }
    }
}
