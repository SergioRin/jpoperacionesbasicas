package model; 

/**
 * 
 * @author Sergio Felipe Rincon Rincon
 * @version 1.0
 * @since 2025-03-31
 * @license UMD
 */
public class Operaciones {
    private double numeroUno;

    private double numeroDos;

    public Operaciones() {
        this.numeroUno = 0;
        this.numeroDos = 0;
    }

    public Operaciones(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }


    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    public double mSuma(double numeroUno, double numeroDos) {
        return numeroUno + numeroDos;
    }

    public double mRestar(double numeroUno, double numeroDos) {
        return numeroUno - numeroDos; // Corregido: falta el operador de resta
    }

    public double mMultiplicar(double numeroUno, double numeroDos) {
        return numeroUno * numeroDos; // Corregido: falta el operador de multiplicación
    }
}