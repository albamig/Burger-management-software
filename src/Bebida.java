/**
 *La clase <code>Bebida</code> implementa las caracteristicas
 * del <code>Plato</code> Bebida.
 *
 *@author Alberto Amigo
 *@author Sergio Delgado
 */
public class Bebida extends Plato {
    private boolean tieneCafeina;
    private boolean tieneAzucar;

    /**
     *Devuelve verdadero o falso dependiendo de si la bebida
     *tiene o no cafeina
     *
     * @return Si la <code>Bebida</code> tiene cafeina
     */
    public boolean isTieneCafeina() {
        return tieneCafeina;
    }

    /**
     *Devuelve verdadero o falso dependiendo de si la bebida
     *tiene o no azucar
     *
     * @return Si la <code>Bebida</code> tiene azucar
     */
    public boolean isTieneAzucar() {
        return tieneAzucar;
    }

    /**
     *Constructor que recibe cinco parametros: nombre, precio
     * calorias, las opciones de si tiene cafeina o si tiene azucar
     * e inicializa la <code>Bebida</code>
     *
     * @param nombre Nombre de la <code>Bebida</code>
     * @param precio Precio de la <code>Bebida</code>
     * @param calorias Numero de calorias de la <code>Bebida</code>
     * @param tieneCafeina Opcion de si la <code>Bebida</code> tiene cafeina
     * @param tieneAzucar Opcion de si la <code>Bebida</code> tiene azucar
     */
    public Bebida(String nombre, String descripcion, double precio, int calorias, boolean tieneCafeina, boolean tieneAzucar){
        super(nombre, descripcion, precio, calorias);
        this.tieneAzucar = tieneCafeina;
        this.tieneCafeina = tieneAzucar;
    }
}
