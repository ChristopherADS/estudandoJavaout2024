package ExerciciosDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao3 {
    public static void main(String [] args){
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 0;
        final int Max_Tentativas = 5;

        Scanner scanner = new Scanner(System.in);

        while (numeroTentativas < Max_Tentativas){
            System.out.println("Advinhe o numero que está entre 0 e 100");
            int numeroUsuario = scanner.nextInt();
            numeroTentativas++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.printf("\nParabens! Voce acertou o numero com %d tentativas \n", numeroTentativas);
                break;
            } else if(numeroUsuario>numeroAleatorio){
                System.out.printf("\n O numero aleatorio é menor. \n");
            }
        }
        if(numeroTentativas == Max_Tentativas) {
            System.out.println("Voce excedeu o numero de tentativas. o numero era " + numeroAleatorio);
        }
    System.out.println("\n \n Fim do Jogo");
        scanner.close();
    }
    }