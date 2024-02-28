public class App {
    public static void main(String[] args) {
        double montanteInicial = 1000.0; 
        double taxaJuros = 5.0; 
        int periodoTempo = 3; 
        double montanteFinal = calcularMontanteFinal(montanteInicial, taxaJuros, periodoTempo); 
        System.out.println("Montante Inicial: R$" + montanteInicial);
        System.out.println("Taxa de Juros: " + taxaJuros + "%");
        System.out.println("Período de Tempo: " + periodoTempo + " anos");
        System.out.println("Montante Final: R$" + montanteFinal);
    }
    
    public static double calcularMontanteFinal(double montanteInicial, double taxaJuros, int periodoTempo) {
        if (montanteInicial < 0 || taxaJuros < 0 || periodoTempo < 0) {
            throw new IllegalArgumentException("Valores inválidos. O montante inicial, a taxa de juros e o período de tempo devem ser não negativos.");
        }
        
        double juros = (montanteInicial * taxaJuros * periodoTempo) / 100.0;
        double montanteFinal = montanteInicial + juros;
        
        return montanteFinal;
    }
}