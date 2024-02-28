public class App {
    public static void main(String[] args) {
        int numero = 10; 
        long fatorial = calcularFatorial(numero);
        
        System.out.println(numero + "! = " + fatorial);
    }
    
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        
        if (numero == 0 || numero == 1) {
            return 1; 
        } else {
            return numero * calcularFatorial(numero - 1); 
        }
    }
}