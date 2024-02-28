import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
    
        System.out.print("Digite o intervalo de contagem regressiva: ");
        int intervalo = scanner.nextInt();
        
        if (numero <= 0 || intervalo <= 0) {
            System.out.println("O número e o intervalo devem ser inteiros positivos.");
        } else {
            System.out.println("Contagem regressiva a partir de " + numero + " com intervalo de " + intervalo + ":");
            
            while (numero >= 0) {
                System.out.println(numero);
                numero -= intervalo;
            }
        }
        
        scanner.close();
    }
}