import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercitacion02 {
    public static void main(String[] args) {
        // Recibir 3 valores y retornar mayor
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        int valor3 = scanner.nextInt();

        int maximo = maximoEntreTresNumeros(valor1, valor2, valor3);
        System.out.println("El valor maximo es: " + maximo);
    }

    public static Integer maximoEntreTresNumeros(int _valor1, int _valor2, int _valor3) {
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(_valor1);
        valores.add(_valor2);
        valores.add(_valor3);

        Collections.sort(valores);
        return valores.get(2);
    }
}
