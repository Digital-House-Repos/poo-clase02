import java.util.Scanner;

public class Ejercitacion03 {
    public static void main(String[] args) {
        // Retornar boolean para comparacion de dos string
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese primera palabra:");
        String textoA = scanner.nextLine();
        System.out.println("Ingrese segunda palabra:");
        String textoB = scanner.nextLine();

        String resultado = cadenasDeTextoDistintas(textoA, textoB) ? "Son iguales" : "Son distintas";
        System.out.println("Resultado: " + resultado);
    }

    public static boolean cadenasDeTextoDistintas(String _textoA, String _textoB) {
        return _textoA.equals(_textoB);
    }
}
