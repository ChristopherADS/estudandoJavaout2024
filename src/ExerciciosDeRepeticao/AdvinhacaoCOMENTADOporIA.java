package ExerciciosDeRepeticao; // Declara o pacote do código, que é um agrupamento de classes.

import java.util.Random; // Importa a classe Random, que permite gerar números aleatórios.
import java.util.Scanner; // Importa a classe Scanner, que permite a entrada de dados pelo usuário.

public class AdvinhacaoCOMENTADOporIA { // Declara a classe pública Advinhacao1.
    public static void main(String[] args){ // Método principal, ponto de entrada do programa.
        int numeroAleatorio = new Random().nextInt(100); // Gera um número aleatório entre 0 e 99 e o atribui a numeroAleatorio.
        int numeroTentativas = 0; // Inicializa o contador de tentativas em 0.
        final int MAX_TENTATIVAS = 5; // Define o número máximo de tentativas como 5.

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário.

        while (numeroTentativas < MAX_TENTATIVAS){ // Inicia um loop que continua enquanto o número de tentativas for menor que o máximo permitido.
            System.out.println("Advinhe o numero que está entre 0 e 100"); // Solicita que o usuário adivinhe o número.
            int numeroUsuario = scanner.nextInt(); // Lê o número fornecido pelo usuário.
            numeroTentativas++; // Incrementa o contador de tentativas.

            if(numeroUsuario == numeroAleatorio){ // Verifica se o número do usuário é igual ao número aleatório.
                System.out.printf("\n Parabens! Voce acertou o numero com %d tentativas \n", numeroTentativas); // Exibe uma mensagem de sucesso e o número de tentativas.
                break; // Sai do loop caso o usuário acerte o número.
            } else if (numeroUsuario > numeroAleatorio) { // Verifica se o número do usuário é maior que o número aleatório.
                System.out.println("\n O numero aleatorio é menor. \n"); // Informa que o número aleatório é menor.
            } else { // Caso o número do usuário seja menor que o número aleatório.
                System.out.println ("\n O numero aleatorio é maior. \n"); // Informa que o número aleatório é maior.
            }
        }
        if (numeroTentativas == MAX_TENTATIVAS){ // Verifica se o número de tentativas atingiu o máximo.
            System.out.println("Voce excedeu o numero de tentativas. O numero era " + numeroAleatorio); // Informa ao usuário que ele excedeu o número de tentativas e revela o número aleatório.
        }

        System.out.println("\n \n Fim de jogo."); // Exibe uma mensagem de fim de jogo.
        scanner.close(); // Fecha o objeto Scanner para liberar os recursos.
    }
}
