import java.util.Scanner;

public class EXERCICIO1SOMAR3INTEIROS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        int soma = somar(num1, num2, num3);

        System.out.println("A soma dos três números inteiros é: " + soma);
    }
        public static int somar(int a, int b, int c) {
        return a + b + c;
    }
}
