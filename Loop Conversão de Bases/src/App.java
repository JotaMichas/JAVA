import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número em base decimal: ");
        int decimal = scanner.nextInt();
        
        if (decimal < 0) {
            System.out.println("O número deve ser não negativo.");
        } else if (decimal == 0) {
            System.out.println("O número em binário é: 0");
        } else {
            System.out.print("O número em binário é: ");
            String binario = "";
            while (decimal > 0) {
                int resto = decimal % 2;
                binario = resto + binario; 
                decimal /= 2;
            }
            
            System.out.println(binario);
        }
        
        scanner.close();
    }
}
