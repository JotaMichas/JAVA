public class App {
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 99, 8, 7, 3}; 
        
        int maiorValor = encontrarMaiorValor(array);
        
        System.out.println("O maior valor no array é: " + maiorValor);
    }
    
    public static int encontrarMaiorValor(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode estar vazio ou nulo.");
        }
        
        int maior = array[0]; 
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i]; 
            }
        }
        
        return maior;
    }
}
