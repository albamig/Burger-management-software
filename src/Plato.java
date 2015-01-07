/**
 * La clase <code>Plato</code> implementa el precio y el numero
 * de calorias de la clase <code>Producto</code> de la que hereda.
 *
 * @author Alberto Amigo y Sergio Delgado
 */
public abstract class Plato extends Producto {
    private double precio;
    private int numeroCalorias;

    /**
     *
     * @return Precio del <code>Plato</code>
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio Precio del <code>Plato</code>
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return Numero de calorias del <code>Plato</code>
     */
    public int getNumeroCalorias() {
        return numeroCalorias;
    }

    public Plato(String nombre, String descripcion, double precio, int numeroCalorias) {
        super(nombre, descripcion);
        this.precio = precio;
        this.numeroCalorias = numeroCalorias;
    }
}
