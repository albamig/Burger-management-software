import java.util.ArrayList;

public class Hamburguesa extends Plato {
    private ArrayList<String> ingredientes;

    public ArrayList<String> getIngeredientes() {
        return ingredientes;
    }

    public void setIngeredientes(ArrayList<String> ingeredientes) {
        this.ingredientes = ingeredientes;
    }

    public Hamburguesa(String nombre, double precio, int calorias, ArrayList<String> ingredientes){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setNumeroCalorias(calorias);
        this.ingredientes = ingredientes;
    }
}
