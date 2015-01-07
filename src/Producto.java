/**
 * La calse <code>Producto</code> implementa el nombre
 * y la descripcion de los productos.
 *
 * @author Alberto Amigo y Sergio Delgado
 */
public abstract class Producto {
    private String nombre;
    private String descripcion;

    /**
     *
     * @return Nombre del <code>Producto</code>
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return Descripcion del <code>Producto</code>
     */
    public String getDescripcion() {
        return descripcion;
    }

    public Producto(String nombre, String descripcion) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
