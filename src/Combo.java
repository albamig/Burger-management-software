import java.util.ArrayList;

/**
 * La clase <code>Combo</code> implementa los platos contenidos
 * en un combo y sus caracteristicas.
 *
 * @author Alberto Amigo
 * @author Sergio Delgado
 */
public class Combo extends Producto {
    private ArrayList<Plato> grupoPlatos;
    private double descuento = 20;

    /**
     * Devuelve el porcentaje de descuento del <code>Combo</code>
     *
     * @return El porcentaje de descuento del <code>Combo</code>
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Permite elegir el porcentaje de descuento del <code>Combo</code>
     *
     * @param descuento porcentaje de descuento del <code>Combo</code>
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * Devuelve la lista de paltos de los que esta formado el combo.
     *
     * @return Lista de platos de los que esta formado el <code>Combo</code>
     */
    public ArrayList<Plato> getGrupoPlatos() {
        return grupoPlatos;
    }

    /**
     * Constructor que recibe tres parametros: nombre, descripcion y
     * grupoPlatos con los cuales inicizliza el <code>Combo</code>
     *
     * @param nombre Nombre del <code>Combo</code>
     * @param descripcion Descripcion dle <code>Combo</code>
     * @param grupoPlatos Lista de los <code>Platos</code> de los que se compone el <code>Combo</code>
     */
    public Combo(String nombre, String descripcion, ArrayList<Plato> grupoPlatos) {
        super(nombre, descripcion);
        assert (grupoPlatos.size() > 1);
        this.grupoPlatos = grupoPlatos;
    }

    /**
     * Constructor que recibe cuatro parametros: nombre, descripcion,
     * grupoPlatos y descuento con los cuales inicizliza el <code>Combo</code>
     *
     * @param nombre Nombre del <code>Combo</code>
     * @param descripcion Descripcion dle <code>Combo</code>
     * @param grupoPlatos Lista de los <code>Platos</code> de los que se compone el <code>Combo</code>
     * @param descuento Porcentaje de descueno del <code>Combo</code>
     */
    public Combo(String nombre, String descripcion, ArrayList<Plato> grupoPlatos, double descuento) {
        super(nombre, descripcion);
        assert (grupoPlatos.size() > 1);
        this.grupoPlatos = grupoPlatos;
        assert (descuento > 0);
        this.descuento = descuento;
    }

    /**
     * Calcula el precio del <code>Combo</code>
     *
     * @return Precio del <code>Combo</code>
     */
    @Override
    public double getPrecio() {
        double precio = 0;

        for (int i = 0; i < grupoPlatos.size(); i++) {
            precio += grupoPlatos.get(i).getPrecio();
        }

        return precio*(1-descuento/100);
    }

    /**
     * Calcula el numero de calorias del <code>Combo</code>
     *
     * @return Numero de calorias del <code>Combo</code>
     */
    @Override
    public int getNumeroCalorias() {
        int numeroCalorias = 0;

        for (int i = 0; i < grupoPlatos.size(); i++) {
            numeroCalorias += grupoPlatos.get(i).getNumeroCalorias();
        }

        return numeroCalorias;
    }

    public void añadirPlato (Plato plato) {
        grupoPlatos.add(plato);
    }

    public void añadirCombo(Combo combo) {
        for (int i = 0; i < combo.getGrupoPlatos().size(); i++) {
            grupoPlatos.add(combo.getGrupoPlatos().get(i));
        }
    }
}