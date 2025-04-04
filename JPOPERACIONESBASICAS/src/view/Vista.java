package view; 

import java.util.Scanner;

/**
 * @author Sergio Felipe Rincon Rincon
 * @version 1.8
 * @since 2025-03-31
 * @license UMD
 */
public class Vista {

    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public double leerNumero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarResultado(String mensaje, double resultado) {
        System.out.println(mensaje + resultado);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}