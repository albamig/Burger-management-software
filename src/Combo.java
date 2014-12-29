import java.util.ArrayList;

public class Combo extends Producto {
    private ArrayList<Plato> grupoPlatos;

    public ArrayList<Plato> getGrupoPlatos() {
        return grupoPlatos;
    }

    public void setGrupoPlatos(ArrayList<Plato> grupoPlatos) {
        this.grupoPlatos = grupoPlatos;
    }

    public Combo(ArrayList<Plato> grupoPlatos) {
        this.grupoPlatos = grupoPlatos;
    }

    public double getPrecio() {
        double precio = 0;

        for (int i = 0; i < grupoPlatos.size(); i++) {
            precio += grupoPlatos.get(i).getPrecio();
        }

        return precio*0.2;
    }

    public int getNumeroCalorias() {
        int numeroCalorias = 0;

        for (int i = 0; i < grupoPlatos.size(); i++) {
            numeroCalorias += grupoPlatos.get(i).getNumeroCalorias();
        }

        return numeroCalorias;
    }

    public void añadirPlato() {
    }

    public void quitarPlato() {
    }
}