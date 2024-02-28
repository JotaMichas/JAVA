public class App {
    public static void main(String[] args) {
        int numero = 999; 
        int soma = calcularSomaDosDigitos(numero);
        
        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
    }
    
    public static int calcularSomaDosDigitos(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        
        int soma = 0;
        
        while (numero > 0) {
            int digito = numero % 10; 
            soma += digito;
            numero /= 10; 
        }
        
        return soma;
    }
}