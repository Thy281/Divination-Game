package JavaCore;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = input.nextInt();
            tentativas++;


            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número gerado é maior do que o digitado.");
            } else {
                System.out.println("O número gerado é menor do que o digitado.");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acerta o numero gerado em 05 tentativas, o número gerado era: " + numeroGerado);
        }
    }
}