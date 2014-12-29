import java.util.ArrayList;

public class Combo extends Producto {
    private ArrayList<Plato> grupoPlatos;
    private int numeroCalorias;
    private double precioCombo;

    public double getPrecioCombo() {
        return precioCombo;
    }

    public void setPrecioCombo(double precioCombo) {
        this.precioCombo = precioCombo;
    }

    public ArrayList<Plato> getGrupoPlatos() {
        return grupoPlatos;
    }

    public void setGrupoPlatos(ArrayList<Plato> grupoPlatos) {
        this.grupoPlatos = grupoPlatos;
    }

    public int getNumeroCalorias() {
        return numeroCalorias;
    }

    public void setNumeroCalorias(int numeroCalorias) {
        this.numeroCalorias = numeroCalorias;
    }

    public void añadirPlato() {
    }

    public void quitarPlato() {
    }

    public Combo(ArrayList<Plato> platosCombo) {
        grupoPlatos = platosCombo;
        for (int i = 0;i < grupoPlatos.size(); i++){
            numeroCalorias += grupoPlatos.get(i).getNumeroCalorias();
            precioCombo += grupoPlatos.get(i).getPrecio();
        }
        precioCombo = precioCombo*0.8;
    }
}