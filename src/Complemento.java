/**
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
     * @param numeroPersonas Numero de comensales del <code>Complemento</code>
     * @param calorias Numero de calorias del <code>Complemento</code>
     */
    public Complemento(String nombre, double precio, int numeroPersonas, int calorias){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setNumeroCalorias(calorias);
        numeroComensales = numeroPersonas;

    }
}
