import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        scanner.close();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Seu peso está dentro da faixa saudável.");
        } else if (imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 34.9) {
            System.out.println("Você está com obesidade grau I.");
        } else if (imc < 39.9) {
            System.out.println("Você está com obesidade severa.");
        } else {
            System.out.println("Você está com obesidade mórbida.");
        }
    }
}
