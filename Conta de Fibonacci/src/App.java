public class App {
    public static void main(String[] args) {
        int n = 3; 
        long resultado = calcularFibonacci(n);
        
        System.out.println("O termo Fibonacci de índice " + n + " é: " + resultado);
    }
    
    public static long calcularFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O índice deve ser não negativo.");
        }
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long fibNMinus2 = 0;
            long fibNMinus1 = 1;
            long fibN = 0;
            
            for (int i = 2; i <= n; i++) {
                fibN = fibNMinus1 + fibNMinus2;
                fibNMinus2 = fibNMinus1;
                fibNMinus1 = fibN;
            }
            
            return fibN;
        }
    }
}
