import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort{

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);        
        
        // Ordenar usando Collections.sort() (implementa Timsort)
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
        
        // Resultado: [1, 2, 5, 8]
        // Búsqueda binaria (requiere orden previo)
        int indice2 = Collections.binarySearch(numeros, 2);
        System.out.println("Índice del 5: " + indice2);
        // Resultado: 2
    }
}
