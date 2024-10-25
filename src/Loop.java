import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        Scanner leitura = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o FIlme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Media de avaliações" + mediaAvaliacao/3);
    }
}
