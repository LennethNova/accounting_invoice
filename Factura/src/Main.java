// Main class
public class Main {
    public static void main(String[] args) {
        // Two invoice different data same folio
        Factura f1 = new Factura("FAC001", "Juan Perez", 1450.00);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.00);

        //Show both
        System.out.println(f1);
        System.out.println(f2);

        // Compare
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
