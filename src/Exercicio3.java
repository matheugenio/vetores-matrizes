import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizInteiro = new int[3][3];
        int somaPrincipal = 0, somaSecundaria = 0;

        for (int linha = 0; linha < matrizInteiro.length; linha++) {
            for (int coluna = 0; coluna < matrizInteiro.length; coluna++) {
                System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                matrizInteiro[linha][coluna] = sc.nextInt();
            }
        }
        System.out.print("Elementos da diagonal principal: ");
        for (int i = 0; i < matrizInteiro.length; i++) {
            System.out.print(matrizInteiro[i][i]+" ");
            somaPrincipal+=matrizInteiro[i][i];
        }
        System.out.println();

        System.out.print("Elementos da diagonal secundária: ");
        for (int i = 0; i < matrizInteiro.length; i++) {
            System.out.print(matrizInteiro[i][matrizInteiro.length-i-1]+" ");
            somaSecundaria+=matrizInteiro[i][matrizInteiro.length-i-1];
        }
        System.out.println();
        System.out.println("Soma dos elementos da diagonal principal: " +somaPrincipal);
        System.out.println("Soma dos elementos da diagonal secundária: " +somaSecundaria);



        sc.close();
    }
}

