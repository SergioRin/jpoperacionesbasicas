package controller;

import model.Operaciones;
import view.Vista;

/**
 * @author Sergio Felipe Rincon Rincon
 * @version 1.0
 * @since 2025-03-31
 * @license UMD
 */
public class Controlador {

    private Vista objVista;
    private Operaciones objOperaciones;

    public Controlador(Vista vista) {
        this.objVista = vista;
    }

    public void ejecutar() {
        double numeroUno = objVista.leerNumero("Ingrese el primer número:");
        double numeroDos = objVista.leerNumero("Ingrese el segundo número:");

        objOperaciones = new Operaciones(numeroUno, numeroDos);

        objVista.mostrarResultado("La suma es: ", objOperaciones.mSuma(numeroUno, numeroDos));
        objVista.mostrarResultado("La resta es: ", objOperaciones.mRestar(numeroUno, numeroDos));
        objVista.mostrarResultado("La multiplicación es: ", objOperaciones.mMultiplicar(numeroUno, numeroDos));

        objVista.cerrarScanner();
    }
}
