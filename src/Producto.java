/**
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
     * @param nombre Nombre del <code>Producto</code>
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Descripcion del <code>Producto</code>
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion Descripcion del <code>Producto</code>
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
