import java.util.ArrayList;

/**
 *
 * @author Alberto Amigo
 * @author Sergio Delgado
 */
public class UsaProductosInfoBurger {
    /**
     *Imprime por pantalla la lista de platos de la carta con
     * su descripcion, numero de calorias y precio.
     *
     * @param carta Lista de <code>Plato</code> que contiene la carta.
     */
    public static void imprimeCarta(ArrayList<Plato> carta){
        System.out.println("Productos de la carta:");
        for(int i = 0; i < carta.size(); i++){
            System.out.println("Nombre: " + carta.get(i).getNombre() + "  Descripcion: " +
                    carta.get(i).getDescripcion() + " Calorias: " +
                    carta.get(i).getNumeroCalorias() + " Precio: " + carta.get(i).getPrecio() + "\n");
        }
    }

    public static void main (String args[]) {
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("Lechuga" + " Queso" + "Tomate" + "Cebolla" + "Ketchup");
        ArrayList<Plato> pedido = new ArrayList<Plato>();
        try {
            Hamburguesa hamburguesaConQueso = new Hamburguesa("Hamburguesa con queso", "", 2.85, 500, ingredientes);
            Bebida infocola = new Bebida("InfoCola", "", -1.50, 150, true, true);
            Complemento alitas = new Complemento("Alitas de pollo", "", 4.35, 5, 700);
            pedido.add(hamburguesaConQueso);
            pedido.add(infocola);
            pedido.add(alitas);
            Combo menu = new Combo("menu", "", pedido);
            System.out.println("El precio del pedido sin combo es: 8.7 euros \n");
            System.out.println("El precio del combo es: " + menu.getPrecio() + "euros \n");
            System.out.println("El numero de calorias del combo es: " +  menu.getNumeroCalorias() + "calorias \n");
            imprimeCarta(pedido);
        } catch (AssertionError error){
            System.out.println(error);
        }



    }


}
