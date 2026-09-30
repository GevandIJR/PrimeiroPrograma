import java.util.Scanner;

public class EXERCICIO2MAIORVALOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        int maiorValor = Maior(num1, num2, num3);

        System.out.println("O maior valor entre os três números inteiros é: " + maiorValor);
    }

    public static int Maior(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}