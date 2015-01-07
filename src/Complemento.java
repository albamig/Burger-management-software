/**
 * La clase <code>Complemento</code> implementa las
 * caracteristicas del <code>Plato</code> complemento.
 *
 *@author Alberto Amigo y Sergio Delgado
 */
public class Complemento extends Plato{
    private int numeroComensales;

    /**
     *
     * @return Numero de comensales del <code>Complemento</code>
     */
    public int getNumeroComensales() {
        return numeroComensales;
    }

    /**
     *
     * @param numeroComensales Numero de comensales del <code>Complemento</code>
     */
    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    /**
     *
     * @param nombre Nombre del <code>Complemento</code>
     * @param precio Precio del <code>Complemento</code>
     * @param numeroCalorias Numero de comensales del <code>Complemento</code>
     * @param calorias Numero de calorias del <code>Complemento</code>
     */
    public Complemento(String nombre, String descripcion, double precio, int numeroCalorias, int calorias){
        super(nombre, descripcion, precio, numeroCalorias);
        this.numeroComensales = numeroComensales;

    }
}
