import java.util.Scanner;

/**
 * Clase de una calculadora básica, la cual realizara las operaciones de multiplicación, division, resta, suma y división de módulo
 *
 * @author Yamid Ortiz Muñoz <yaormu@gmail.com>
 * @version 1.0.0
 */
public class Main {

    /**
     * Input para obtener dato double ingresado por el usuario
     */
    private static Scanner inputDouble = new Scanner(System.in);

    /**
     * Input para obtener dato char ingresado por el usuario
     */
    private static Scanner inputChar = new Scanner(System.in);

    /**
     * Ṕunto de entrada inicial del programa
     * @param args argumento para iniciar el ménu principal
     */
    public static void main(String[] args) {

        double constante, variable;
        String operador = "9999999";

        menu();

        constante = consultaColumna();;

        while (operador.charAt(0) != '=') {

           operador = simboloOperacion();

           if (operador.charAt(0) != '=') {

                if (operador.charAt(0) == '+') {
                    variable = numeroAOperar();
                    constante += variable;
                } else if (operador.charAt(0) == '-') {
                    variable = numeroAOperar();
                    constante -= variable;
                } else if (operador.charAt(0) == '*') {
                    variable = numeroAOperar();
                    constante *= variable;
                } else if (operador.charAt(0) == '/') {
                    variable = numeroAOperar();
                    if (variable == 0) {
                        System.out.println("No existe la división por 0");
                    } else {
                        constante /= variable;
                    }

                } else if (operador.charAt(0) == '%') {
                    variable = numeroAOperar();
                    constante %= variable;
                } else {
                    errorOperacionSimbolo();
                }
               System.out.println(resultadoOperacion(constante));
            }
        }
    }

    /**
     * Muestra el ménu de la calculadora
     */
    public static void menu() {
        System.out.println("Calculadora");
        System.out.println("-Para salir digite el signo de igual(=)");
    }

    /**
     * Muestra mensaje de error, indicando que ingrese un simbolo correcto para operacion de la calculadora
     */
    public static void errorOperacionSimbolo() {
        System.out.println("Simbolo de operación invalido, digite nuevamente un signo valido para operar +, -, *, /, % ó = para salir");
    }

    /**
     * Solicita el primer número para iniciar operaciones de calculadora
     * @return devuelve el valor indicado por el usuario double
     */
    private static Double consultaColumna () {
        System.out.println("Digite primer número");
        return inputDouble.nextDouble();
    }

    /**
     * Solicita el simbolo letra para de acuerdo a esta iniciar operacion matematica en calculadora
     * @return devuelve el valor indicado por el usuario char
     */
    private static String simboloOperacion () {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Ingrese operación a realizar:");
        System.out.println("suma '+', resta '-', multiplicacion '*', division '/', modulo division '%', salir '='");
        System.out.println("--------------------------------------------------------------------------");
        return inputChar.next();
    }

    /**
     * Solicita el segundo y siguiente número que realizara la operacion de sumar, resta, multiplicar, dividir o modulo     * @return devuelve el valor indicado por el usuario double
     * @return regresa el valor de número ingresado por el usuario
     */
    private static Double numeroAOperar () {
        System.out.println("Digite número");
        return inputDouble.nextDouble();
    }

    /**
     * Toma el valor de la operación para mostrar resultado de la calculadora
     * @return devuelve el valor de las operaciones realizadas por la calculadora
     */
    private static String resultadoOperacion (Double resultado) {
        return "Resultado operacion: " + resultado;
    }
}






