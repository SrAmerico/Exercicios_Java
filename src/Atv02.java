import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");

        double primeiraNota = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");

        double segundaNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        // Verifica se a média é maior ou igual a 6
        if (media >= 6) {
            System.out.println("Meus parabéns!");
        } else {
            System.out.println("Você não passou. Estude um pouco mais!");
        }
    }
}