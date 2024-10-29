package ExerciciosDeRepeticao; // Declara o pacote onde a classe está armazenada

import java.util.Random; // Importa a classe Random para gerar números aleatórios
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class AdvinhacaoCOMENTADOporIA { // Declara a classe principal Advinhacao2
    public static void main(String[] args) { // Define o método principal que inicia a execução do programa
        int numeroAleatorio = new Random().nextInt(100); // Gera um número aleatório entre 0 e 99 e armazena em numeroAleatorio
        int numeroTentativas = 0; // Inicializa o contador de tentativas do usuário
        final int MAX_TENTATIVAS = 5; // Define o número máximo de tentativas permitidas

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para receber a entrada do usuário

        // Loop que continua enquanto o número de tentativas for menor que o máximo permitido
        while (numeroTentativas < MAX_TENTATIVAS) {
            System.out.println("Advinhe o numero que está entre 0 e 100"); // Solicita ao usuário que adivinhe o número
            int numeroUsuario = scanner.nextInt(); // Lê o número digitado pelo usuário e armazena em numeroUsuario
            numeroTentativas++; // Incrementa o contador de tentativas

            // Verifica se o número digitado pelo usuário é igual ao número aleatório gerado
            if (numeroUsuario == numeroAleatorio) {
                // Exibe uma mensagem de acerto e o número de tentativas usadas
                System.out.printf("\nPARABÉNS! Você acertou o número com %d tentativas\n", numeroTentativas);
                break; // Encerra o loop caso o usuário acerte o número
            } else {
                System.out.println("Tente novamente!"); // Exibe uma mensagem de erro para o usuário tentar novamente
            }
        }

        // Verifica se o usuário atingiu o número máximo de tentativas sem acertar
        if (numeroTentativas == MAX_TENTATIVAS) {
            // Exibe uma mensagem informando o número correto após o usuário esgotar as tentativas
            System.out.printf("\nVocê atingiu o número máximo de tentativas. O número era %d.\n", numeroAleatorio);
        }

        scanner.close(); // Fecha o objeto Scanner para liberar o recurso
    }
}
