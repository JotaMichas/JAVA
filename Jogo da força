import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] palavras = {"teste", "michalski", "calderari", "joao", "gabriel"};
        String palavraEscolhida = escolherPalavraAleatoria(palavras);
        int maxTentativas = 6;
        char[] letrasAdivinhadas = new char[palavraEscolhida.length()];
        int tentativasRestantes = maxTentativas;
        boolean jogoTerminou = false;
        
        System.out.println("Bem-vindo ao Jogo da Forca!");
        
        while (!jogoTerminou) {
            System.out.println("\nPalavra: " + exibirPalavraEscondida(palavraEscolhida, letrasAdivinhadas));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite uma letra: ");
            char letra = lerLetra();
            
            if (letraJaAdivinhada(letra, letrasAdivinhadas)) {
                System.out.println("Você já adivinhou essa letra. Tente outra.");
            } else {
                boolean letraAdivinhada = adivinharLetra(palavraEscolhida, letra, letrasAdivinhadas);
                
                if (letraAdivinhada) {
                    System.out.println("Letra correta!");
                } else {
                    System.out.println("Letra incorreta.");
                    tentativasRestantes--;
                }
                
                if (tentativasRestantes == 0) {
                    System.out.println("Você perdeu. A palavra era: " + palavraEscolhida);
                    jogoTerminou = true;
                } else if (palavraAdivinhada(palavraEscolhida, letrasAdivinhadas)) {
                    System.out.println("Parabéns! Você adivinhou a palavra: " + palavraEscolhida);
                    jogoTerminou = true;
                }
            }
        }
    }
    
    public static String escolherPalavraAleatoria(String[] palavras) {
        Random random = new Random();
        int indice = random.nextInt(palavras.length);
        return palavras[indice];
    }
    
    public static String exibirPalavraEscondida(String palavra, char[] letrasAdivinhadas) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letraJaAdivinhada(letra, letrasAdivinhadas)) {
                resultado.append(letra);
            } else {
                resultado.append("_");
            }
        }
        
        return resultado.toString();
    }
    
    public static boolean letraJaAdivinhada(char letra, char[] letrasAdivinhadas) {
        for (char l : letrasAdivinhadas) {
            if (l == letra) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean adivinharLetra(String palavra, char letra, char[] letrasAdivinhadas) {
        boolean letraAdivinhada = false;
        
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                letrasAdivinhadas[i] = letra;
                letraAdivinhada = true;
            }
        }
        
        return letraAdivinhada;
    }
    
    public static boolean palavraAdivinhada(String palavra, char[] letrasAdivinhadas) {
        for (int i = 0; i < palavra.length(); i++) {
            if (!letraJaAdivinhada(palavra.charAt(i), letrasAdivinhadas)) {
                return false;
            }
        }
        return true;
    }
    
    public static char lerLetra() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
