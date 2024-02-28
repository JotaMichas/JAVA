import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: R$ ");
        double precoProduto = scanner.nextDouble();
        System.out.print("Digite o valor dado pelo cliente: R$ ");
        double valorPago = scanner.nextDouble();
        scanner.close();
        double troco = valorPago - precoProduto;
        
        if (troco < 0) {
            System.out.println("O valor pago é insuficiente. Faltam R$ " + (-troco));
        } else {
            int notas50 = (int) (troco / 50);
            troco %= 50;
            
            int notas20 = (int) (troco / 20);
            troco %= 20;
            
            int notas10 = (int) (troco / 10);
            troco %= 10;
            
            int notas5 = (int) (troco / 5);
            troco %= 5;
            
            int notas2 = (int) (troco / 2);
            troco %= 2;
            
            int moedas1 = (int) troco;
            
            System.out.println("Troco: R$ " + (valorPago - precoProduto));
            System.out.println("Notas de R$ 50: " + notas50);
            System.out.println("Notas de R$ 20: " + notas20);
            System.out.println("Notas de R$ 10: " + notas10);
            System.out.println("Notas de R$ 5: " + notas5);
            System.out.println("Notas de R$ 2: " + notas2);
            System.out.println("Moedas de R$ 1: " + moedas1);
        }
    }
}