/**
 * La clase <code>Complemento</code> implementa las
 * caracteristicas del <code>Plato</code> complemento.
 *
 *@author Alberto Amigo
 *@author Sergio Delgado
 */
public class Complemento extends Plato{
    private int numeroComensales;
    /**
     *Devuelve el nuemro de comensales del <code>Complemento</code>
     *
     * @return Numero de comensales del <code>Complemento</code>
     */
    public int getNumeroComensales() {
        return numeroComensales;
    }

    /**
     * Permite seleccionar el numero de comensales del <code>Complemento</code>
     *
     * @param numeroComensales Numero de comensales del <code>Complemento</code>
     */
    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    /**
     *Constructor que recibe cuatro parametros: nombre, precio,
     * numero de calorias y numero de comensales e inicializa
     * el <code>Complemento</code>
     *
     * @param nombre Nombre del <code>Complemento</code>
     * @param precio Precio del <code>Complemento</code>
     * @param numeroComensales Numero de comensales del <code>Complemento</code>
     * que ha de cumplir la precondicion de numero de comensales > 0
     * @param numeroCalorias Numero de calorias del <code>Complemento</code>
     */
    public Complemento(String nombre, String descripcion, double precio, int numeroCalorias, int numeroComensales){
        super(nombre, descripcion, precio, numeroCalorias);
        assert (numeroComensales > 0);
        this.numeroComensales = numeroComensales;

    }
}
