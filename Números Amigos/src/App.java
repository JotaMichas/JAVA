public class App {
    public static void main(String[] args) {
        int numero1 = 220; 
        int numero2 = 284; 
        
        boolean saoAmigos = verificarNumerosAmigos(numero1, numero2);
        
        if (saoAmigos) {
            System.out.println(numero1 + " e " + numero2 + " são números amigos.");
        } else {
            System.out.println(numero1 + " e " + numero2 + " não são números amigos.");
        }
    }
    
    public static boolean verificarNumerosAmigos(int numero1, int numero2) {
        return (somaDivisoresProprios(numero1) == numero2) && (somaDivisoresProprios(numero2) == numero1);
    }
    
    public static int somaDivisoresProprios(int numero) {
        int soma = 1; 
        
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                soma += i;
                
                if (i != numero / i) {
                    soma += numero / i;
                }
            }
        }
        
        return soma;
    }
}