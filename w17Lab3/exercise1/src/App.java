/**
 * Clase principal de la aplicación que demuestra el uso de la clase {@link Asistente}.
 * <p>
 * Esta aplicación simula la entrega de tickets numerados de manera incremental
 * a los asistentes de un concierto. Cada asistente recibe un número de ticket
 * único que se asigna automáticamente según el orden de llegada.
 * </p>
 *
 * <p><b>Ejercicio:</b></p>
 * <ul>
 *   <li>Crear la clase {@code Asistente} con nombre, apellido y número de ticket.</li>
 *   <li>Instanciar varios asistentes en el método {@code main}.</li>
 *   <li>Verificar que los números de ticket se asignan de manera autoincremental y única.</li>
 * </ul>
 *
 * @author Fregaladol
 * @version 1.0
 */
public class App {

    /**
     * Método principal de la aplicación.
     * <p>
     * Crea varios objetos {@link Asistente} y muestra en consola
     * el número de ticket junto con el nombre y apellido de cada asistente.
     * </p>
     *
     * @param args argumentos de línea de comandos (no utilizados en este ejemplo)
     * @throws Exception en caso de error durante la ejecución
     */
    public static void main(String[] args) throws Exception {

        Asistente asistente1 = new Asistente("Julian", "Alvarez");
        Asistente asistente2 = new Asistente("Julian", "Alvarez");
        Asistente asistente3 = new Asistente("Carmen", "Salinas");
        Asistente asistente4 = new Asistente();

        System.out.printf("El ticket n.%d pertenece a %s %s.\n",
                asistente1.getNumTicket(), asistente1.getNombre(), asistente1.getApellido());
        System.out.printf("El ticket n.%d pertenece a %s %s.\n",
                asistente2.getNumTicket(), asistente2.getNombre(), asistente2.getApellido());
        System.out.printf("El ticket n.%d pertenece a %s %s.\n",
                asistente3.getNumTicket(), asistente3.getNombre(), asistente3.getApellido());

        System.out.println(asistente4.toString());
    }
}
