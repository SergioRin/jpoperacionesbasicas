import controller.Controlador;
import view.Vista;

/**
 * @author Sergio Felipe Rincon Rincon
 * @version 1.0
 * @since 2025-03-31
 * @license UMD
 */
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Object-Oriented Programming MVC Pattern Class");

        Vista objVista = new Vista();
        Controlador objControlador = new Controlador(objVista);

        objControlador.ejecutar();
    }
}
