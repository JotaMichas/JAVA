import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        
        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior do que o segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número (" + numero2 + ") é maior do que o primeiro número (" + numero1 + ").");
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
