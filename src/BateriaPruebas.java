import java.util.ArrayList;

public class BateriaPruebas {
    public static void main(String args[]) {
        System.out.println("Errores clase Hamburguesa:");
        hamburguesa();
        System.out.println("Errores clase Bebida:");
        bebida();
        System.out.println("Errores de clase Combo: ");
        combo();
        System.out.println("Errores de clase Complementos:");
        complemento();
    }

    public static void hamburguesa() {
        ArrayList<String> ing = new ArrayList<String>();
        ing.add("Queso"); ing.add("Carne");
        Hamburguesa ham1 =  new Hamburguesa("ham1", "Con queso", 3.9, 54, ing);

        if (ham1.getIngeredientes() != ing) {
            System.out.println("Error en getIngrediente()");
        }
        if (!ham1.getDescripcion().equals("Con queso")) {
            System.out.println("Error en getDescripcion()");
        }
        if (!ham1.getNombre().equals("ham1")) {
            System.out.println("Error en getNombre()");
        }
        if (ham1.getNumeroCalorias() != 54) {
            System.out.println("Error en getNumeroCalorias()");
        }
        if (ham1.getPrecio() != 3.9) {
            System.out.println("Error en getPrecio()");
        }
        ham1.setPrecio(5.4);
        if (ham1.getPrecio() != 5.4) {
            System.out.println("Error en setPrecio()");
        }
        try {
            ham1 =  new Hamburguesa("ham1", "Con queso", -3.9, 54, ing);
            System.out.println("Error en assert precio > 0 constructor");
        }
        catch (AssertionError e) {}
        try {
            ham1 =  new Hamburguesa("ham1", "Con queso", 3.9, -54, ing);
            System.out.println("Error en assert numeroCalorias > 0 constructor");
        }
        catch (AssertionError e) {}
        try {
            ham1 =  new Hamburguesa("ham1", "Con queso", 3.9, 54, ing);
            ham1.setPrecio(-34);
            System.out.println("Error en assert precio < 0 setPrecio()");
        }
        catch (AssertionError e) {}
        try {
            ArrayList<String> ing1 = new ArrayList<String>();
            ham1 =  new Hamburguesa("ham1", "Con queso", 3.9, 54, ing1);
            System.out.println("Error assert ingredientes.size() > 0");
        }
        catch (AssertionError e) {}
        try {
            ham1 =  new Hamburguesa(null, "Con queso", 3.9, 54, ing);
            System.out.println("Error assert nombre != null constructor");
        }
        catch (AssertionError e) {}
        try {
            ham1 =  new Hamburguesa("Con queso", null, 3.9, 54, ing);
            System.out.println("Error assert descripcion != null constructor");
        }
        catch (AssertionError e) {}
    }

    public static void bebida() {
        Bebida beb1 = new Bebida("beb1", "Ricarica", 3.21, 34, true, false);

        if (beb1.isTieneAzucar() != false) {
            System.out.println("Error en isTieneAzucar()");
        }
        if (beb1.isTieneCafeina() != true) {
            System.out.println("Error en isTieneCafeina()");
        }
        if (!beb1.getDescripcion().equals("Ricarica")) {
            System.out.println("Error en getDescripcion()");
        }
        if (!beb1.getNombre().equals("beb1")) {
            System.out.println("Error en getNombre()");
        }
        if (beb1.getNumeroCalorias() != 34) {
            System.out.println("Error en getNumeroCalorias()");
        }
        if (beb1.getPrecio() != 3.21) {
            System.out.println("Error en getPrecio()");
        }
        beb1.setPrecio(5.4);
        if (beb1.getPrecio() != 5.4) {
            System.out.println("Error en setPrecio()");
        }
        try {
            beb1 = new Bebida("beb1", "Ricarica", -3.21, 34, true, false);
            System.out.println("Error en assert precio > 0 constructor");
        }
        catch (AssertionError e) {}
        try {
            beb1 = new Bebida("beb1", "Ricarica", 3.21, -34, true, false);
            System.out.println("Error en assert numeroCalorias > 0 constructor");
        }
        catch (AssertionError e) {}
        try {
            beb1 = new Bebida("beb1", "Ricarica", 3.21, 34, true, false);
            beb1.setPrecio(-34);
            System.out.println("Error en assert precio < 0 setPrecio()");
        }
        catch (AssertionError e) {}
        try {
            beb1 = new Bebida(null, "Ricarica", 3.21, 34, true, false);
            System.out.println("Error assert nombre != null constructor");
        }
        catch (AssertionError e) {}
        try {
            beb1 = new Bebida("beb1", null, 3.21, 34, true, false);
            System.out.println("Error assert descripcion != null constructor");
        }
        catch (AssertionError e) {}
    }

    public static void combo() {
        ArrayList<Plato> grupoPlatos = new ArrayList<Plato>();
        ArrayList<Plato> grupoPlatos2 = new ArrayList<Plato>();
        ArrayList<String> ing = new ArrayList<String>();
        ing.add("Queso");
        Hamburguesa hamb1 = new Hamburguesa("Infoburguer", "Hamburguesa con queso, huevo, y ensalada", 2.88, 500, ing);
        Bebida beb1 = new Bebida("Infocola", "Refresco de cola", 1.5, 200, true, true);
        Complemento comp1 = new Complemento("Alitas", "Alitas de pollo", 1.99, 300, 3);
        Hamburguesa hamb2 = new Hamburguesa("Doble de queso", "Hamburguesa con doble de queso", 3.4, 600, ing);
        grupoPlatos.add(hamb1);
        grupoPlatos.add(beb1);
        grupoPlatos.add(comp1);
        grupoPlatos2.add(hamb2);
        grupoPlatos2.add(beb1);

        try {
            Combo comb3 = new Combo(null, "Delicioso combo", grupoPlatos);
            System.out.println("Error aserto nombre != null constructor");
        } catch (AssertionError e) {
        }
        try {
            Combo comb3 = new Combo("Burguer", null, grupoPlatos);
            System.out.println("Error aserto descripcion != null constructor");
        } catch (AssertionError e) {
        }
        try {
            ArrayList<Plato> platos = new ArrayList<Plato>();
            Combo comb3 = new Combo("Burguer", null, platos);
            System.out.println("Error aserto platos.size() > 0");
        } catch (AssertionError e) {
        }

        Combo comb1 = new Combo("InfoMenu", "Delicioso menu", grupoPlatos);
        Combo comb2 = new Combo("InfoMenu2", "Exquisito menu", grupoPlatos2, 40);

        if (comb1.getPrecio() != 5.096) {
            System.out.println("Error en getPrecio()");
        }
        if (comb1.getNumeroCalorias() != 1000) {
            System.out.println("Error en getCalorias()");
        }
        if (comb1.getDescuento() != 20) {
            System.out.println("Error en getDescuento()");
        }
        if (comb1.getGrupoPlatos() != grupoPlatos) {
            System.out.println("Error en getGrupoPlatos()");
        }
        if (!comb1.getDescripcion().equals("Delicioso menu")) {
            System.out.println("Error en getDescripcion()");
        }
        if (!comb1.getNombre().equals("InfoMenu")) {
            System.out.println("Error en getNombre()");
        }
        comb1.setDescuento(50);
        if(comb1.getDescuento() != 50){
            System.out.println("Error en setDescuento()");
        }
        comb1.añadirCombo(comb2);
        if (comb1.getGrupoPlatos().size() < grupoPlatos.size()) {
            System.out.println("Error en añadirCombo()");
        }
        comb2.añadirPlato(hamb2);
        if (comb2.getGrupoPlatos().size() < grupoPlatos2.size()) {
            System.out.println("Error en añadirPlato()");
        }


    }

    public static void complemento() {
        Complemento comp1 = new Complemento("Patatas chips", "Deliciosas patatas", 2.5, 300, 3);
        try{
            Complemento comp2 = new Complemento(null, "Deliciosas patatas", 2.5, 300, 3);
            System.out.println("Error en aserto nombre != null constructor");
        }catch (AssertionError e){}
        try{
            Complemento comp2 = new Complemento("Patatas chips", null, 2.5, 300, 3);
            System.out.println("Error en aserto descripcion != null constructor");
        }catch (AssertionError e){}
        try{
            Complemento comp2 = new Complemento("Patatas chips", "Deliciosas patatas", -2.5, 300, 3);
            System.out.println("Error en aserto precio < 0 constructor");
        }catch (AssertionError e){}
        try{
            Complemento comp2 = new Complemento("Patatas chips", "Deliciosas patatas", 2.5, -300, 3);
            System.out.println("Error en aserto calorias < 0 constructor");
        }catch (AssertionError e){}
        try{
            Complemento comp2 = new Complemento("Patatas chips", "Deliciosas patatas", 2.5, 300, -3);
            System.out.println("Error en aserto comensales < 0 constructor");
        }catch (AssertionError e){}

        if(comp1.getNumeroCalorias() != 300){
            System.out.println("Error en getNumeroCalorias()");
        }
        if(comp1.getNumeroComensales() != 3){
            System.out.println("Error en getNumeroComensales()");
        }
        if(!comp1.getNombre().equals("Patatas chips")){
            System.out.println("Error en nombre de Complemento");
        }
        if(!comp1.getDescripcion().equals("Deliciosas patatas")){
            System.out.println("Error en getDescripcion()");
        }
        if(comp1.getPrecio() != 2.5){
            System.out.println("Error en el getPrecio()");
        }
        comp1.setPrecio(2.95);
        if(comp1.getPrecio() != 2.95){
            System.out.println("Error en setPrecio()");

        }
        comp1.setNumeroComensales(5);
        if(comp1.getNumeroComensales() != 5){
            System.out.println("Error en setNumeroComensales()");
        }
    }
}
