public class Pasoreferencia {
    public static void main(String[] args) {
        int valor[] = new int[1];
        valor[0] = 3;
        System.out.println(valor);
        System.out.println("Valor (antes) = " + valor[0]);
        incrementar(valor);
        System.out.println("Valor (despues) = " + valor[0]);
    }

    public static void incrementar(int[] val) {
        System.out.println(val);
        for (int i = 0; i < val.length; i++) {
            val[i] = val[i] + 1;
        }
    }
}
