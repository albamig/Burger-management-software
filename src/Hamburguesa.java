import java.util.ArrayList;

/**
 * La clase <code>Hamburguesa</code> implementa las caracteristicas
 * del <code>Plato</code> hamburguesa.
 *
 *@author Alberto Amigo y Sergio Delgado
 */
public class Hamburguesa extends Plato {
    private ArrayList<String> ingredientes;

    /**
     *
     * @return Lista de ingredientes de la <code>Hamburguesa</code>
     */
    public ArrayList<String> getIngeredientes() {
        return ingredientes;
    }

    /**
     *
     * @param ingeredientes Lista de ingredientes de la <code>Hamburguesa</code>
     */
    public void setIngeredientes(ArrayList<String> ingeredientes) {
        this.ingredientes = ingeredientes;
    }

    /**
     *
     * @param nombre Nombre de la <code>Hamburguesa</code>
     * @param precio Precio de la <code>Hamburguesa</code>
     * @param calorias Numero de calorias de la <code>Hamburguesa</code>
     * @param ingredientes Lista de ingredientes de la <code>Hamburguesa</code>
     */
    public Hamburguesa(String nombre, double precio, int calorias, ArrayList<String> ingredientes){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setNumeroCalorias(calorias);
        this.ingredientes = ingredientes;
    }
}
