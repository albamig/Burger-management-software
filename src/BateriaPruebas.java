import java.util.ArrayList;

public class BateriaPruebas {
    public static void main(String args[]) {

    }

    public static void hamburguesa() {
        ArrayList<String> ing = new ArrayList<String>();
        ing.add("Queso"); ing.add("Carne");
        Hamburguesa ham1 =  new Hamburguesa("ham1", "Con queso", 3.9, 54, ing);
        if (ing != ham1.getIngeredientes()) {
            System.out.println();
        }
    }
}
