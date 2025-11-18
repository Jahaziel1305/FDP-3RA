public class Paso {
    public static void main(String[] args) {
        int valor = 5;
        System.out.println("Valor (antes) = " + valor);
        incrementar(valor);
        System.out.println("Valor (despues) = " + valor);
    }
    public static void incrementar(int val) {
        val = val + 1;

    }
}