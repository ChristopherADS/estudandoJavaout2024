package AdvinhacaoExerciciosDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao2 {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 0;
        final int MAX_TENTATIVAS = 5;

        Scanner scanner = new Scanner(System.in);

        while (numeroTentativas < MAX_TENTATIVAS) {
            System.out.println("Advinhe o numero que está entre 0 e 100");
            int numeroUsuario = scanner.nextInt();
            numeroTentativas++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.printf("\nPARABÉNS! Você acertou o número com %d tentativas\n", numeroTentativas);
                break;
            } else {
                System.out.println("Tente novamente!");
            }
        }
        if (numeroTentativas == MAX_TENTATIVAS) {
            System.out.printf("\nVocê atingiu o número máximo de tentativas. O número era %d.\n", numeroAleatorio);
        }
        scanner.close();
    }
}
