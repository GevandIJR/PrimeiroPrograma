import java.util.Scanner;

public class EXERCICIO5FATORIAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int num) {
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}