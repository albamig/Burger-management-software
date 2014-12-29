public class Bebida extends Plato {
    private boolean tieneCafeina;
    private boolean tieneAzucar;

    public boolean isTieneCafeina() {
        return tieneCafeina;
    }

    public void setTieneCafeina(boolean tieneCafeina) {
        this.tieneCafeina = tieneCafeina;
    }

    public boolean isTieneAzucar() {
        return tieneAzucar;
    }

    public void setTieneAzucar(boolean tieneAzucar) {
        this.tieneAzucar = tieneAzucar;
    }

    public Bebida(String nombre, double precio, int calorias, boolean cafeina, boolean azucar){
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setNumeroCalorias(calorias);
        tieneAzucar = azucar;
        tieneCafeina = cafeina;
    }
}
