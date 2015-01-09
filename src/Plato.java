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
     * Devuelve el precio del <code>Plato</code>
     *
     * @return Precio del <code>Plato</code>
     */
    @Override
    public double getPrecio() {
        return precio;
    }

    /**
     * Permite seleccionar el precio del <code>Plato</code>
     *
     * @param precio Precio del <code>Plato</code>
     */
    public void setPrecio(double precio) {
        assert precio > 0;
        this.precio = precio;
    }

    /**
     * Devuelve el numero de calorias del <code>Plato</code>
     *
     * @return Numero de calorias del <code>Plato</code>
     */
    @Override
    public int getNumeroCalorias() {
        return numeroCalorias;
    }

    /**
     * Constructor que recibe cuatro parametros: nombre, descripcion,
     * precio y numero de calorias e inicializa el <code>Plato</code>
     *
     * @param nombre nombre del <code>Plato</code>
     * @param descripcion descripcion del <code>Palto</code>
     * @param precio precio del <code>Plato</code> que ha de cumplir
     * la precondicion de precio > 0
     * @param numeroCalorias numero de calorias del <code>Plato</code> que ha de cumplir
     * la precondicion de numeroDeCalorias > 0
     */
    public Plato(String nombre, String descripcion, double precio, int numeroCalorias) {
        super(nombre, descripcion);
        assert (precio > 0);
        this.precio = precio;
        assert (numeroCalorias > 0);
        this.numeroCalorias = numeroCalorias;
    }
}
