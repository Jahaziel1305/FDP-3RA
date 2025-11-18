import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    calcularPotencia();
                    break;
                case 2:
                    calcularSuma();
                    break;
            }
        } while (opcion != 3);
        {
        }
    }

    public static void imprimirMenu() {
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar dos numeros");
        System.out.println("3. Salir del sistema");
        System.out.println("Selecciona una opcion: ");
    }

    public static void calcularPotencia() {
        Scanner teclado = new Scanner(System.in);
        int base, exp;
        System.out.println("***CALCULO DE UNA POTENCIA***");
        System.out.println("Captura la base: ");
        base = teclado.nextInt();
        System.out.println("Captura el exponente: ");
        exp = teclado.nextInt();
        System.out.println(base + " elevado a " + exp + " = " + calcularPot(base, exp));
    }

    public static int calcularPot(int base, int expo) {
        int resu = 1;
        for (int i = 1; i <= expo; i++) {
            resu = resu * base;
        }
        return resu;
    }

    public static void calcularSuma() {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("***SUMA DE DOS NUMEROS***");
        System.out.println("Captura el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Cpatura el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + calcularSum(num1, num2));
    }

    public static int calcularSum(int num1, int num2) {
        int resu = num1 + num2;
        return resu;
    }
}