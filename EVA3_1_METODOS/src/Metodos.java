public class Metodos {
    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
        // 1. Si necesito gauradar el valor de retorno
        int resu = sumarEnteros(val1, val2);
        System.out.println("Suma de 5 + 10 es " + resu);
        // 2. No necesito el valor, un solo uso
        System.out.println("Suma de 5 + 10 es " + sumarEnteros(val1, val2));
        // 3. Solo necesito ejecutar el metodo
        sumarEnteros(val1, val2);
    }
    // METODO PARA SUMAR DOS ENTEROS
    // Llamar a sus metodos usando verbos y escritura cameIcase
    // 1.Modificadores de acceso: public, protected,private.
    // 2. static --> PARA USAR LOS METODOS DENTRO DEL MAIN
    // 3. Valor de retorno: cualquier tipo de dato
    // void --> si no quieren regresar un valor
    // 4. nombre del método: miamas reglas que identificadores
    // 5. lista de parametros: pueden ser cero o N cantidad
    // 1 2 3 4 5
    public static int sumarEnteros(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
}