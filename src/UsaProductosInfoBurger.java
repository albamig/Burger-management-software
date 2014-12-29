import java.util.ArrayList;

public class UsaProductosInfoBurger {
    public static void main (String args[]) {
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("sida");

        Hamburguesa bbq = new Hamburguesa("barbaquiu", 2.88, 500, ingredientes);
        Bebida cola = new Bebida("sidacola", 1.5, 200, true, true);
        Hamburguesa barber = new Hamburguesa("barba", 2.88, 500, ingredientes);

        ArrayList<Plato> platos = new ArrayList<Plato>();
        platos.add(bbq);
        platos.add(barber);
        platos.add(cola);
        Combo menus = new Combo(platos);

        System.out.println(menus.getNumeroCalorias());
        System.out.println(menus.getPrecio());
    }
}
