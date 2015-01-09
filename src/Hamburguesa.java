import java.util.ArrayList;

/**
 * La clase <code>Hamburguesa</code> implementa las caracteristicas
 * del <code>Plato</code> hamburguesa.
 *
 *@author Alberto Amigo
 *@author Sergio Delgado
 */
public class Hamburguesa extends Plato {
    private ArrayList<String> ingredientes;

    /**
     *Devuelve la lista de ingredientes de la <code>Hamburguesa</code>
     *
     * @return Lista de ingredientes de la <code>Hamburguesa</code>
     */
    public ArrayList<String> getIngeredientes() {
        return ingredientes;
    }

    /**
     * Constructor que recibe cuatro parametros: nombre, precio
     * calorias e ingredientes e inicializa la <code>Hamburguesa</code>
     *
     * @param nombre Nombre de la <code>Hamburguesa</code>
     * @param precio Precio de la <code>Hamburguesa</code>
     * @param calorias Numero de calorias de la <code>Hamburguesa</code>
     * @param ingredientes Lista de ingredientes de la <code>Hamburguesa</code>
     * que ha de cumplir la precondicion de ingredientes.size > 0
     */
    public Hamburguesa(String nombre, String descripcion, double precio, int calorias, ArrayList<String> ingredientes){
        super(nombre, descripcion, precio, calorias);
        assert (ingredientes.size() > 0);
        this.ingredientes = ingredientes;
    }
}
