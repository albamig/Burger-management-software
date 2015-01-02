/**
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

    /**
     *
     * @param numeroCalorias Numero de calorias del <code>Plato</code>
     */
    public void setNumeroCalorias(int numeroCalorias) {
        this.numeroCalorias = numeroCalorias;
    }
}
