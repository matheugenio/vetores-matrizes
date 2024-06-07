import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetorInteiro = {2,5,1,3,4,9,7,8,10,6};
        Scanner sc = new Scanner(System.in);
        boolean achou = false;
        System.out.println("Digite o número que você deseja encontrar");
        int num = sc.nextInt();

        for (int i = 0; i < vetorInteiro.length; i++) {
            if (vetorInteiro[i] == num){
                System.out.println("O número "+num+" foi encontrado na posição: " + i);
                achou = true;
                }
        }
        if (!achou)
            System.out.println("O número "+num+" não foi encontrado.");



        sc.close();

    }
}
