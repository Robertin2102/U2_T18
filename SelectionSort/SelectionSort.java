import java.util.Arrays;

public class SelectionSort {
    
    public void sort(int[] arr) {

        int n = arr.length;
        int minIndex;

        // Recorremos el arreglo hasta el penúltimo elemento
        for (int i = 0; i < n - 1; i++) {

            minIndex = i; // Suponemos que el mínimo está en la posición actual

            // Buscamos el valor mínimo en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Guardamos el índice del nuevo mínimo encontrado
                }
            }

            // Intercambiamos el mínimo con la posición actual
            int temp = arr[minIndex];     // Guardamos el valor más pequeño
            arr[minIndex] = arr[i];       // Movemos el valor actual a la posición del mínimo
            arr[i] = temp;                // Colocamos el mínimo en la posición correcta
        }

        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }

    // Método auxiliar para imprimir cualquier arreglo
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
