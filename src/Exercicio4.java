import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        float[][] notas = new float[10][4];
        float[] medias = new float[10];

        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.println("Digite a " + (coluna+ 1) + " nota do " + (linha + 1) + " aluno");
                notas[linha][coluna] = sc.nextFloat();
                soma += notas[linha][coluna];
                if (coluna == 3) {
                    double media = soma / 4;
                    medias[linha] = (float) media;
                    soma = 0;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("%.1f ",medias[i]);
        }

    }
}


