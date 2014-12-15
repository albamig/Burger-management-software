public abstract class Plato extends Producto {
    private double precio;
    private int numeroCalorias;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroCalorias() {
        return numeroCalorias;
    }

    public void setNumeroCalorias(int numeroCalorias) {
        this.numeroCalorias = numeroCalorias;
    }
}
