import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();
        
        double[] numeros = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        double media = calcularMedia(numeros);
        double desvioPadrao = calcularDesvioPadrao(numeros, media);
        
        System.out.println("Média: " + media);
        System.out.println("Desvio Padrão: " + desvioPadrao);
        
        scanner.close();
    }
    
    public static double calcularMedia(double[] numeros) {
        double soma = 0.0;
        
        for (double numero : numeros) {
            soma += numero;
        }
        
        return soma / numeros.length;
    }
    
    public static double calcularDesvioPadrao(double[] numeros, double media) {
        double somaDiferencasQuadradas = 0.0;
        
        for (double numero : numeros) {
            double diferenca = numero - media;
            somaDiferencasQuadradas += diferenca * diferenca;
        }
        
        double variancia = somaDiferencasQuadradas / numeros.length;
        return Math.sqrt(variancia);
    }
}
