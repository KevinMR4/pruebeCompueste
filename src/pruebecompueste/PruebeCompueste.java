package pruebecompueste;
import java.util.Scanner;
/**
 *
 * @author KEVIN
 */
public class PruebeCompueste {
    public void funcionar(){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un valor entero: ");
        numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero");
            System.out.println("Pruebe de nuevo introduciendo un número negativo");
        } else if (numero < 0) {
            System.out.println(numero + " es menor que cero");
            System.out.println("Pruebe de nuevo introduciendo un número positivo");
        } else {
            System.out.println(numero + " es igual a cero");
            System.out.println("¿Por qué no introduce un número negativo?");
        }
    }
    public static void main(String[] args) {
        PruebeCompueste fun = new PruebeCompueste();
        fun. funcionar();
    }
    
}
