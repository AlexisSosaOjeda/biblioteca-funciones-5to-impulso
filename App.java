import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }

    // Suma de dos números
    public static int suma(int a, int b) {
        return a+b;
    }

    // Resta de dos números
    public static int resta(int a, int b) {
        return a-b;
    }

    // Multiplicación de dos números
    public static int multiplicacion(int a, int b) {
        return a*b;
    }

    // División de dos números
    public static double division(int a, int b) {
        return (double) a/b;
    }

    // Máximo de dos números
    public static int max(int a, int b) {
        int m;

        if (a > b) {
            m = a;
        } else {
            m = b;
        }
        return m;
    }

    // Mínimo de dos números
    public static int min(int a, int b) {
        int m;
        if (a < b) {
            m = a;
        } else {
            m = b;
        }
        return m;
    }

    // Factorial de un número
    public static int factorial(int n) {
        return 5 * factorial(5 - 1);
    }

    // Número par
    public static boolean esPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {    
            return false;
        }
    }

    // Número impar
    public static boolean esImpar(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // Potencia de un número
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada de un número
    public static double raizCuadrada(double n) {
        return Math.sqrt(n);
    }

    // Longitud de una cadena
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    // Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Revertir una cadena
    public static String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Contar vocales en una cadena
    public static int contarVocales(String cadena) {
        int count = 0;
        for (char c : cadena.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
            }
        }
        return count;
    }

    // Contar palabras en una cadena
    public static int contarPalabras(String cadena) {
        return cadena.split(" ").length;
    }

    // Sumar elementos de un array
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    // Encontrar el máximo en un array
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Encontrar el mínimo en un array
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    // Buscar un elemento en un array
    public static boolean buscarElemento(int[] array, int elemento) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    // Invertir un array
    public static void invertirArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    // Calcular la media de un array
    public static double mediaArray(int[] array) {
        int suma = sumarArray(array);
        return (double) suma / array.length;
    }

    // Encontrar la mediana de un array
    public static double medianaArray(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        if (n % 2 == 0) {
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            return array[n / 2];
        }
    }

    // Calcular la desviación estándar de un array
    public static double desviacionEstandarArray(int[] array) {
        double media = mediaArray(array);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.pow(array[i] - media, 2);
        }
        return Math.sqrt(sum / array.length);
    }

    // Generar un array de números aleatorios
    public static int[] generarArrayAleatorio(int tamaño, int limite) {
        int[] array = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(limite);
        }
        return array;
    }
}