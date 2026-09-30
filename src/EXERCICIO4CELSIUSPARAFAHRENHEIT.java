import java.util.Scanner;

public class EXERCICIO4CELSIUSPARAFAHRENHEIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = converterParaFahrenheit(celsius);

        System.out.println(celsius + "°C é equivalente a " + fahrenheit + "°F.");
    }

    public static double converterParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}