/**
 * <h2>Título</h2>
 * <p>
 * Escribe un programa en Java que...<br>
 * 
 * </p>
 * @author Guido Sampaoli
 * @see <a href="https://github.com/guidosampaoli/" target="_blank">GitHub - guidosampaoli</a>
 */

public class T01_WhileFor {
    
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 3)  {
            System.out.println("Conteo externo: " + contador);
            for (int i = 1; i <= 4; i++) {
                System.out.println("  Conteo interno: " + i);
            }
            contador++;
        }
    }
}