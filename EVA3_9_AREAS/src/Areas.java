import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    areaCirculo();
                    break;
                case 2:
                    areaRectangulo();
                    break;
                case 3:
                    areaTrapecio();
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
        {
        }
    }

    public static void imprimirMenu() {
        System.out.println("FORMULAS DE AREAS");
        System.out.println("1. Area de un circulo");
        System.out.println("2. Area de un rectangulo");
        System.out.println("3. Area de un trapecio");
        System.out.println("4. Salir del sistema");
        System.out.println("Escoge una opcion");
    }

    public static void areaCirculo() {
        Scanner teclado = new Scanner(System.in);
        double radio;
        System.out.println("Captura el radio del circulo: ");
        radio = teclado.nextDouble();
        System.out.println("El area de tu circulo es: " + calcularArea(radio));
    }

    public static double calcularArea(double radio) {
        double pi = 3.1416;
        double resu = pi * radio * radio;
        return resu;
    }

    public static void areaRectangulo() {
        double base;
        double altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Captura la base: ");
        base = teclado.nextDouble();
        System.out.println("Captura la altura: ");
        altura = teclado.nextDouble();
        System.out.println("El area tu rectangulo es: " + calcularArea(base, altura));
    }

    public static double calcularArea(double base, double altura) {

        double resu = base * altura;
        return resu;
    }

    public static void areaTrapecio() {
        Scanner teclado = new Scanner(System.in);
        double baseMenor, baseMayor, altura;
        System.out.println("Caputura la base menor: ");
        baseMenor = teclado.nextDouble();
        System.out.println("Captura la base mayor: ");
        baseMayor = teclado.nextDouble();
        System.out.println("Captura la altura: ");
        altura = teclado.nextDouble();
        System.out.println("El area de tu trapecio es: " + calcularArea(baseMenor, baseMayor, altura));
    }

    public static double calcularArea(double baseMenor, double baseMayor, double altura) {
        double resu = baseMayor + baseMenor * altura / 2;
        return resu;
    }
}
