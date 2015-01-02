import java.util.ArrayList;

/**
 *@author Alberto Amigo y Sergio Delgado
 */
public class Combo extends Producto {
    private ArrayList<Plato> grupoPlatos;

    /**
     *
     * @return Lista de platos de los que esta formado el <code>Combo</code>
     */
    public ArrayList<Plato> getGrupoPlatos() {
        return grupoPlatos;
    }

    /**
     *
     * @param grupoPlatos Lista de platos de los que esta formado el <code>Combo</code>
     */
    public void setGrupoPlatos(ArrayList<Plato> grupoPlatos) {
        this.grupoPlatos = grupoPlatos;
    }

    /**
     *
     * @param grupoPlatos Lista de platos de los que esta formado el <code>Combo</code>
     */
    public Combo(ArrayList<Plato> grupoPlatos) {
        this.grupoPlatos = grupoPlatos;
    }

    /**
     *Calcula el precio del <code>Combo</code>
     *
     * @return Precio del <code>Combo</code>
     */
    public double getPrecio() {
        double precio = 0;

        for (int i = 0; i < grupoPlatos.size(); i++) {
            precio += grupoPlatos.get(i).getPrecio();
        }

        return precio*0.8;
    }

    /**
     *Calcula el numero de calorias del <code>Combo</code>
     *
     * @return Numero de calorias del <code>Combo</code>
     */
    public int getNumeroCalorias() {
        int numeroCalorias = 0;

        for (int i = 0; i < grupoPlatos.size(); i++) {
            numeroCalorias += grupoPlatos.get(i).getNumeroCalorias();
        }

        return numeroCalorias;
    }

}