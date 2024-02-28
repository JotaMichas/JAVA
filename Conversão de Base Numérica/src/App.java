public class App {
    public static void main(String[] args) {
        String numeroBinario = "1101"; 
        int decimal = converterBinarioParaDecimal(numeroBinario);
        
        System.out.println("O número binário " + numeroBinario + " em decimal é: " + decimal);
    }
    
    public static int converterBinarioParaDecimal(String numeroBinario) {
        int decimal = 0;
        int expoente = 0;
        
        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            char digito = numeroBinario.charAt(i);
            if (digito == '1') {
                decimal += Math.pow(2, expoente);
            }
            expoente++;
        }
        
        return decimal;
    }
}