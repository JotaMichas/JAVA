import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("O número deve ser um inteiro positivo.");
        } else {
            System.out.println("Números pares de 1 até " + numero + ":");
            int i = 2; 
            while (i <= numero) {
                System.out.print(i + " ");
                i += 2; 
            }
            System.out.println(); 

            System.out.println("Números ímpares de 1 até " + numero + ":");
            i = 1; 
            while (i <= numero) {
                System.out.print(i + " ");
                i += 2; 
            }
        }

        scanner.close();
    }
}
