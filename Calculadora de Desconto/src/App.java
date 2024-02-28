public class App {
    public static void main(String[] args) {
        double valorOriginal = 100.0; 
        double percentualDesconto = 20.0;
        
        double valorComDesconto = calcularValorComDesconto(valorOriginal, percentualDesconto);
        
        System.out.println("Valor original: R$" + valorOriginal);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor com desconto: R$" + valorComDesconto);
    }
    
    public static double calcularValorComDesconto(double valorOriginal, double percentualDesconto) {
        if (valorOriginal < 0 || percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Valores inválidos. O valor original deve ser não negativo, e o percentual de desconto deve estar entre 0 e 100.");
        }
        
        double valorDesconto = (percentualDesconto / 100) * valorOriginal;
        double valorComDesconto = valorOriginal - valorDesconto;
        
        return valorComDesconto;
    }
}