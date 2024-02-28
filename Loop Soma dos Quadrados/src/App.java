import java.util.Scanner;

public class App {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("O número deve ser um inteiro positivo.");
        } else {
            int somaDosQuadrados = 0;
            
            for (int i = 1; i <= numero; i++) {
                int quadrado = i * i;
                somaDosQuadrados += quadrado;
            }
            
            System.out.println("A soma dos quadrados de 1 até " + numero + " é: " + somaDosQuadrados);
        }
        
        scanner.close();
    }
}