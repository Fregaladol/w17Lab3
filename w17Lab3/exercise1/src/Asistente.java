/**
 * Representa a un asistente de un evento/concierto.
 * <p>
 * Cada asistente tiene un nombre, un apellido y un número de ticket
 * que se asigna automáticamente de manera incremental según el orden de llegada.
 * </p>
 * 
 * <p>El número de ticket es único y no puede modificarse una vez asignado.</p>
 * 
 * @author Fregaladol
 * @version 1.0
 */
public class Asistente {

    /** Nombre del asistente. */
    private String nombre;

    /** Apellido del asistente. */
    private String apellido;

    /** Número de ticket único del asistente. */
    private final Long numTicket;

    /** Contador estático que lleva la cuenta de tickets asignados. */
    private static Long contador = 0L;

    /**
     * Constructor vacío.
     * <p>
     * Crea un asistente sin nombre ni apellido y asigna un número de ticket incremental.
     * </p>
     */
    public Asistente() {
        contador++;
        this.numTicket = contador;
    }

    /**
     * Constructor con nombre y apellido.
     * <p>
     * Asigna automáticamente un número de ticket incremental.
     * </p>
     *
     * @param nombre  nombre del asistente
     * @param apellido apellido del asistente
     */
    public Asistente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        contador++;
        this.numTicket = contador;
    }

    /** @return el nombre del asistente */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre el nombre a asignar */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return el apellido del asistente */
    public String getApellido() {
        return apellido;
    }

    /** @param apellido el apellido a asignar */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /** @return el número de ticket del asistente */
    public Long getNumTicket() {
        return numTicket;
    }

    /**
     * Devuelve una representación en cadena del asistente.
     * 
     * @return cadena con nombre, apellido y número de ticket
     */
    @Override
    public String toString() {
        return String.format("Asistente [nombre=%s, apellido=%s, numTicket=%d]", 
                nombre, apellido, numTicket);
    }
}
