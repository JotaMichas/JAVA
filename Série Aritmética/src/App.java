public class App {
    public static void main(String[] args) {
        int n = 10; 
        int soma = calcularSomaSerieAritmetica(n);
        
        System.out.println("A soma dos primeiros " + n + " termos da série aritmética é: " + soma);
    }
    
    public static int calcularSomaSerieAritmetica(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("O valor de n deve ser maior ou igual a 1.");
        }
        
        int soma = 0;
        
        for (int i = 1; i <= n; i++) {
            soma += i; 
        }
        
        return soma;
    }
}