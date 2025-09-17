package entity;

/**
 * Representa una dirección física compuesta por calle, ciudad y código postal.
 * <p>
 * Esta clase se utiliza para asociar información de ubicación
 * a un cliente u otra entidad del sistema.
 * </p>
 *
 * @author Fregaladol
 * @version 1.0
 */
public class Direccion {

    /** Nombre de la calle. */
    private String calle;

    /** Nombre de la ciudad. */
    private String ciudad;

    /** Código postal asociado a la dirección. */
    private int codigoPostal;

    /**
     * Constructor vacío de la clase.
     * <p>
     * Crea una dirección sin valores iniciales.
     * </p>
     */
    public Direccion() {
    }

    /**
     * Constructor con parámetros principales.
     * <p>
     * Crea una dirección con calle, ciudad y código postal.
     * </p>
     *
     * @param calle        nombre de la calle
     * @param ciudad       nombre de la ciudad
     * @param codigoPostal código postal de la dirección
     */
    public Direccion(String calle, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return la calle de la dirección
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Asigna el nombre de la calle.
     *
     * @param calle la calle a asignar
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el nombre de la ciudad.
     *
     * @return la ciudad de la dirección
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Asigna el nombre de la ciudad.
     *
     * @param ciudad la ciudad a asignar
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el código postal.
     *
     * @return el código postal de la dirección
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Asigna el código postal.
     *
     * @param codigoPostal el código postal a asignar
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Devuelve una representación en cadena de la dirección.
     *
     * @return una cadena con el formato:
     *         "Dirección: calle [calle], ciudad [ciudad], código postal [codigoPostal]."
     */
    @Override
    public String toString() {
        return String.format("Dirección: calle %s, ciudad %s, código postal %d.", 
                calle, ciudad, codigoPostal);
    }
}
