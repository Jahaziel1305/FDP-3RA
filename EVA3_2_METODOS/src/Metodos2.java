import java.util.Scanner;

public class Metodos2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensaje;
        int valor;
        System.out.println("Captura mensaje: ");
        mensaje = teclado.nextLine();
        System.out.println("Captura repeticiones: ");
        valor = teclado.nextInt();
        inprimirMensaje(mensaje, valor);
    }
    public static void inprimirMensaje(String mensaje, int repeticion) {
        for (int i = 0; i < repeticion; i++) {
            System.out.println(mensaje);
        }
    }
}
