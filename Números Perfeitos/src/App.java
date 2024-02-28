public class App {
    public static void main(String[] args) {
        int limiteSuperior = 999; 
        
        System.out.println("Números perfeitos no intervalo de 1 a " + limiteSuperior + ":");
        encontrarNumerosPerfeitos(limiteSuperior);
    }
    
    public static void encontrarNumerosPerfeitos(int limiteSuperior) {
        for (int numero = 1; numero <= limiteSuperior; numero++) {
            if (ehNumeroPerfeito(numero)) {
                System.out.print(numero + " ");
            }
        }
    }
    
    public static boolean ehNumeroPerfeito(int numero) {
        if (numero <= 1) {
            return false; 
        }
        
        int somaDivisores = 1; 
        
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
                if (i != numero / i) {
                    somaDivisores += numero / i;
                }
            }
        }
        
        return somaDivisores == numero;
    }
}
