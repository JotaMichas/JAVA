import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int soma = 0;
        int contador = 0;
        
        System.out.println("Digite uma série de números inteiros (insira 0 para finalizar):");
        
        do {
            System.out.print("Digite um número (0 para finalizar): ");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
        
        scanner.close();
    }
}