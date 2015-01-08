/**
 * La clase <code>Plato</code> implementa el precio y el numero
 * de calorias de la clase <code>Producto</code> de la que hereda.
 *
 * @author Alberto Amigo
 * @author Sergio Delgado
 */
public abstract class Plato extends Producto {
    private double precio;
    private int numeroCalorias;

    /**
     * Devuelve el precio del <code>Palto</code>
     *
     * @return Precio del <code>Plato</code>
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Permite seleccionar el precio del <code>Plato</code>
     *
     * @param precio Precio del <code>Plato</code>
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el numero de calorias del <code>Palto</code>
     *
     * @return Numero de calorias del <code>Plato</code>
     */
    public int getNumeroCalorias() {
        return numeroCalorias;
    }

    /**
     * Constructor que recive cuatro parametros: nombre, descripcion,
     * precio y numero de calorias e inicializa el <code>Plato</code>
     *
     * @param nombre nombre del <code>Plato</code>
     * @param descripcion descripcion del <code>Plto</code>
     * @param precio precio del <code>Plato</code>
     * @param numeroCalorias numero de calorias del <code>Plato</code>
     */
    public Plato(String nombre, String descripcion, double precio, int numeroCalorias) {
        super(nombre, descripcion);
        this.precio = precio;
        this.numeroCalorias = numeroCalorias;
    }
}
