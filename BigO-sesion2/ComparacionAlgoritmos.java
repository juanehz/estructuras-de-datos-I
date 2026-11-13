/**
 * Actividad Sesión No. 2 - Estructura de Datos I
 * ¿Cuál algoritmo escala mejor? Análisis de algoritmos y notación Big O
 *
 * Este programa compara el tiempo de ejecución de un algoritmo lineal O(n)
 * contra uno cuadrático O(n²) para diferentes tamaños de entrada.
 */
public class ComparacionAlgoritmos {

    public static void main(String[] args) {

        // Tamaños de entrada que vamos a probar
        int[] tamanos = {100, 1_000, 5_000, 10_000};

        System.out.println("n\tO(n) ns\tO(n²) ns");

        for (int n : tamanos) {

            // Medir el algoritmo lineal
            long inicioLineal = System.nanoTime();
            algoritmoLineal(n);
            long finLineal = System.nanoTime();
            long tiempoLineal = finLineal - inicioLineal;

            // Medir el algoritmo cuadrático
            long inicioCuadratico = System.nanoTime();
            algoritmoCuadratico(n);
            long finCuadratico = System.nanoTime();
            long tiempoCuadratico = finCuadratico - inicioCuadratico;

            // Mostrar los resultados en una fila
            System.out.println(
                n + "\t" + tiempoLineal + "\t" + tiempoCuadratico
            );
        }
    }

    // Algoritmo A - O(n): un solo ciclo que se repite n veces
    public static long algoritmoLineal(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            contador++;
        }
        return contador;
    }

    // Algoritmo B - O(n²): dos ciclos anidados, n x n repeticiones
    public static long algoritmoCuadratico(int n) {
        long contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                contador++;
            }
        }
        return contador;
    }
}
