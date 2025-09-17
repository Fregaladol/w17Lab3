package app;

import entity.Cliente;
import entity.Direccion;

/**
 * Clase principal de la aplicación.
 * <p>
 * Demuestra el uso de las clases {@link Cliente} y {@link Direccion},
 * creando instancias y mostrando la información de un cliente junto
 * con sus direcciones asociadas.
 * </p>
 *
 * <p><b>Ejercicio:</b></p>
 * <ul>
 *   <li>Crear un objeto {@code Direccion} y un objeto {@code Cliente}.</li>
 *   <li>Asociar direcciones al cliente.</li>
 *   <li>Mostrar en consola la información del cliente con todas sus direcciones.</li>
 * </ul>
 *
 * <p><b>Extra:</b> Permitir que un cliente tenga varias direcciones
 * almacenadas en una {@code ArrayList}.</p>
 *
 * @author Fregaladol
 * @version 1.0
 */
public class App {

    /**
     * Método principal de la aplicación.
     * <p>
     * Crea direcciones y un cliente, luego imprime por consola
     * los datos del cliente junto con todas sus direcciones.
     * </p>
     *
     * @param args argumentos de línea de comandos (no utilizados en este ejemplo)
     * @throws Exception en caso de que ocurra un error durante la ejecución
     */
    public static void main(String[] args) throws Exception {
        
        Direccion direccion1 = new Direccion("Bailen", "Barcelona", 8013); 
        Direccion direccion2 = new Direccion("Gran Vía 123", "Madrid", 28013);

        Cliente cliente1 = new Cliente("Juan Díaz", 29, direccion1);
        cliente1.setDireccion(direccion2);

        System.out.printf("%s con ID: %d; tiene %.2f años y tiene por direcciones:\n", 
                cliente1.getNombre(), cliente1.getId(), cliente1.getEdad());
        
        cliente1.mostrarDirecciones();
    }
}
