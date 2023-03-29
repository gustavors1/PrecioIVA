public class Main {
    public static void main(String[] args) {

        double monto = 355;
        double IVA = 0.10;
        String obtenerCuenta = obtenerCuenta(monto * IVA + monto);
        System.out.println(obtenerCuenta);

    }

    static String obtenerCuenta(double v) {
        return "Buenas tardes, su cuenta es: " + v;


    }
}