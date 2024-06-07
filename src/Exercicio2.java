import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorInteiro = new int[10];
        int soma = 0;
        double media = 0;
        for (int i = 0; i<vetorInteiro.length ; i++) {
            System.out.println("Digite o "+(i + 1)+" número: ");
            vetorInteiro[i] = sc.nextInt();
            soma+=vetorInteiro[i];
        }
        System.out.print("Elementos nos índices impares: ");
        for (int i = 0; i <vetorInteiro.length ; i++) {
            if (i%2!=0)
                System.out.print(vetorInteiro[i]+" ");
        }
        System.out.println();
        System.out.print("Elementos nos índices pares ");
        for (int i = 0; i <vetorInteiro.length ; i++) {
            if (vetorInteiro[i]%2==0)
                System.out.print(vetorInteiro[i]+" ");
        }
        System.out.println();
        System.out.println("Soma: "+soma);
        media = (double) soma /10;
        System.out.printf("Média: %.2f", media);


        sc.close();
    }
}
