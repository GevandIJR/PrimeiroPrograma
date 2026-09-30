import java.util.Scanner;

public class EXERCICIO3EHPAR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPar = EHPAR(numero);

        if (ehPar) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }

    public static boolean EHPAR(int num) {
        return num % 2 == 0;
    }
}