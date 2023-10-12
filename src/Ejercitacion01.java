import java.util.ArrayList;
import java.util.List;

public class Ejercitacion01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("El numero " + i + " " + verificarPrimos(i));
        }
    }

    public static String verificarPrimos(int _numero) {
        List<Integer> listaDivisores = new ArrayList<>();

        for (int i = 1; i <= _numero; i++) {
            if (esDivisible(_numero, i)) {
                listaDivisores.add(i);
            }
        }
        if (listaDivisores.size() == 2) {
            return "es primo";
        } else {
            return "no es primo";
        }
    }

    public static boolean esDivisible(int _dividendo, int _divisor) {
        return _dividendo % _divisor == 0;
    }
}
