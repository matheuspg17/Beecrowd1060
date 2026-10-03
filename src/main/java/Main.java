
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numeros;
        int controle = 0;

        for (int i = 0; i < 6; i++) {
            numeros = leia.nextDouble();
            if (numeros > 0) {
                controle++;
            }
        }
        System.out.println(controle + " valores positivos");
    }
}
