import java.util.Random;
import java.util.Scanner;

public class AdvinhacaoJogo {
        public static void main(String[] args) {
            int numeroAleatorio = new Random().nextInt(100);
            int numeroTentativas = 0;
            final int MAX_TENTATIVAS = 5;

            Scanner scanner = new Scanner(System.in);

            while (numeroTentativas < MAX_TENTATIVAS) {
                System.out.println("Adivinhe o número que está entre 0 e 100");
                int numeroUsuario = scanner.nextInt();
                numeroTentativas++;

                if (numeroUsuario == numeroAleatorio) {
                    System.out.printf("\nParabéns! Você acertou o número com %d tentativa(s)\n", numeroTentativas);
                    break;
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("\nO número aleatório é menor.\n");
                } else {
                    System.out.println("\nO número aleatório é maior.\n");
                }
            }

            if (numeroTentativas == MAX_TENTATIVAS) {
                System.out.println("Você excedeu o número de tentativas. O número era " + numeroAleatorio);
            }

            System.out.println("\n\nFim de jogo.");
            scanner.close();
        }
    }

