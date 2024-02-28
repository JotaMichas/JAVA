import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Digite a nota (0 a 100): ");
        int nota = scanner.nextInt();

        scanner.close();

        char avaliacao;
        
        if (nota >= 90 && nota <= 100) {
            avaliacao = 'A';
        } else if (nota >= 80) {
            avaliacao = 'B';
        } else if (nota >= 70) {
            avaliacao = 'C';
        } else if (nota >= 60) {
            avaliacao = 'D';
        } else {
            avaliacao = 'F';
        }
        System.out.println("A avaliação é: " + avaliacao);
    }
}


