import java.util.Scanner;

public class DioChallengeVetor {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] N = new int[1000];
        int pos = 0;
        while (pos < 999) {
            for (int j = 0; j < T; j++) {
                if (pos > 999) break;
                N[pos] = j;
                pos++;
            }
        }

        for (int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

    }
}
