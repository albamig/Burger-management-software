import java.util.ArrayList;

public class Combo extends Producto{
    private ArrayList<Plato> grupoPlatos;

    public ArrayList<Plato> getGrupoPlatos() {
        return grupoPlatos;
    }

    public void setGrupoPlatos(ArrayList<Plato> grupoPlatos) {
        this.grupoPlatos = grupoPlatos;
    }

    public void añadirPlato() {}
    public void quitarPlato() {}
}
