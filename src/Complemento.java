public class Complemento extends Plato{
    private int numeroComensales;

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public Complemento(String nombre, double precio, int numeroPersonas, int calorias){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setNumeroCalorias(calorias);
        numeroComensales = numeroPersonas;

    }
}
