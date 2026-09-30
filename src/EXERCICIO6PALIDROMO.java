import java.util.Scanner;

public class EXERCICIO6PALIDROMO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String input = scanner.nextLine();

        boolean ehPalindromo = verificarPalindromo(input);

        if (ehPalindromo) {
            System.out.println("\"" + input + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + input + "\" não é um palíndromo.");
        }
    }

    public static boolean verificarPalindromo(String str) {
        String strLimpa = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String strInvertida = new StringBuilder(strLimpa).reverse().toString();
        return strLimpa.equals(strInvertida);
    }
}