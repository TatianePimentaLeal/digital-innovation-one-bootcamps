import java.util.Scanner;

public class DioChallengeValorUnitario {

    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();

        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();

        //TODO: Implemente um calculo simples.
        //Levando em consideracão sua precedência de operadores e a definição de suas casas decimais:

        double total = ((n1 * valor1) + (n2 * valor2));
        System.out.print(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
}

