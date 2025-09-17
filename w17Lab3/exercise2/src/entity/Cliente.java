package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un cliente dentro del sistema.
 * <p>
 * Cada cliente tiene un identificador único, un nombre,
 * una edad y una lista de direcciones asociadas.
 * El identificador se genera automáticamente a partir
 * de un contador estático.
 * </p>
 *
 * @author Fregaladol
 * @version 1.0
 */
public class Cliente {

    /** Identificador único del cliente. */
    private Long id;

    /** Nombre del cliente. */
    private String nombre;

    /** Lista de direcciones asociadas al cliente. */
    private List<Direccion> direcciones = new ArrayList<>();

    /** Edad del cliente (debe ser mayor que cero). */
    private double edad;

    /** Contador estático usado para asignar IDs automáticos. */
    private static Long contador = 0L;

    /**
     * Constructor vacío de la clase.
     * <p>
     * Crea un cliente sin valores iniciales.
     * </p>
     */
    public Cliente() {
    }

    /**
     * Constructor con parámetros principales.
     * <p>
     * Crea un cliente con nombre, edad e
     * inicializa su lista de direcciones con una dirección.
     * </p>
     *
     * @param nombre      el nombre del cliente
     * @param edad        la edad del cliente (debe ser mayor que cero)
     * @param direccion   una dirección inicial para el cliente
     */
    public Cliente(String nombre, double edad, Direccion direccion) {
        contador++;
        setNombre(nombre);
        setEdad(edad);
        setDireccion(direccion);
        setId(contador);
    }

    /**
     * Obtiene el identificador único del cliente.
     *
     * @return el id del cliente
     */
    public Long getId() {
        return id;
    }

    /**
     * Asigna un identificador al cliente.
     *
     * @param id el id que se desea asignar
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre al cliente.
     *
     * @param nombre el nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del cliente.
     *
     * @return la edad del cliente
     */
    public double getEdad() {
        return edad;
    }

    /**
     * Asigna la edad del cliente.
     * <p>
     * La edad debe ser mayor que cero, de lo contrario
     * no se actualizará y se mostrará un mensaje de error.
     * </p>
     *
     * @param edad la edad a asignar
     */
    public void setEdad(double edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }

    /**
     * Muestra por consola todas las direcciones del cliente.
     */
    public void mostrarDirecciones() {
        for (Direccion dir : direcciones) {
            System.out.println(dir);
        }
    }

    /**
     * Agrega una nueva dirección a la lista de direcciones del cliente.
     *
     * @param direccion la dirección a agregar
     */
    public void setDireccion(Direccion direccion) {
        this.direcciones.add(direccion);
    }
}
