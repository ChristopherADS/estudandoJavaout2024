package AdvinhacaoExerciciosDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao5 {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 0;
        final int Max_Tentativas = 5;

        Scanner scaner = new Scanner(System.in);

        while (numeroTentativas < Max_Tentativas) {
            System.out.println("Advinhe o numero que esta entre 0 e 100");
            int numeroUsuario = scaner.nextInt();
            numeroTentativas++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("\n O numero aleatorio é menor. \n");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.printf("\n Parabens! Voce acertou o numero com %d tentativas \n", numeroTentativas);
                break;
            } else {
                System.out.println("\n O numero aleatorio é maior. \n");
            }
        }
        if (numeroTentativas == Max_Tentativas) {
            System.out.println("Voce excedeu o numero de tentativas. O numero era " + numeroAleatorio);
        }
        System.out.println("\n Fim de jogo.");
        scaner.close();
    }
}
