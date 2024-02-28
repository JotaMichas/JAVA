import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        if (idade >= 18) {
            System.out.println("Você é elegível para votar.");
        } else {
            System.out.println("Você não é elegível para votar.");
        }
    }
}