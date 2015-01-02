/**
 *@author Alberto Amigo y Sergio Delgado
 */
public class Bebida extends Plato {
    private boolean tieneCafeina;
    private boolean tieneAzucar;

    /**
     *
     * @return Si la <code>Bebida</code> tiene cafeina
     */
    public boolean isTieneCafeina() {
        return tieneCafeina;
    }

    /**
     *
     * @param tieneCafeina Opcion si la <code>Bebida</code> tiene cafeina
     */
    public void setTieneCafeina(boolean tieneCafeina) {
        this.tieneCafeina = tieneCafeina;
    }

    /**
     *
     * @return Si la <code>Bebida</code> tiene azucar
     */

    public boolean isTieneAzucar() {
        return tieneAzucar;
    }

    /**
     *
     * @param tieneAzucar Opcion si la <code>Bebida</code> tiene azucar
     */
    public void setTieneAzucar(boolean tieneAzucar) {
        this.tieneAzucar = tieneAzucar;
    }

    /**
     *
     * @param nombre Nombre de la <code>Bebida</code>
     * @param precio Precio de la <code>Bebida</code>
     * @param calorias Numero de calorias de la <code>Bebida</code>
     * @param tieneCafeina Opcion de si la <code>Bebida</code> tiene cafeina
     * @param tieneAzucar Opcion de si la <code>Bebida</code> tiene azucar
     */
    public Bebida(String nombre, double precio, int calorias, boolean tieneCafeina, boolean tieneAzucar){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setNumeroCalorias(calorias);
        this.tieneAzucar = tieneCafeina;
        this.tieneCafeina = tieneAzucar;
    }
}
