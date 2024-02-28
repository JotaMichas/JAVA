import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à Calculadora Personalizada!");
        
        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção (1/2/3/4/5): ");
            
            int escolha = scanner.nextInt();
            
            if (escolha == 5) {
                System.out.println("Saindo da Calculadora de João. Até logo!");
                break; 
            }
            
            if (escolha < 1 || escolha > 4) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                continue; 
            }
            
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();
            
            double resultado = 0;
            
            switch (escolha) {
                case 1:
                    resultado = adicao(numero1, numero2);
                    break;
                case 2:
                    resultado = subtracao(numero1, numero2);
                    break;
                case 3:
                    resultado = multiplicacao(numero1, numero2);
                    break;
                case 4:
                    resultado = divisao(numero1, numero2);
                    break;
            }
            
            System.out.println("Resultado: " + resultado);
        }
        
        scanner.close();
    }
    
    public static double adicao(double a, double b) {
        return a + b;
    }
    
    public static double subtracao(double a, double b) {
        return a - b;
    }
    
    public static double multiplicacao(double a, double b) {
        return a * b;
    }
    
    public static double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero.");
            return 0;
        }
        return a / b;
    }
}