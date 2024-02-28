import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
     public static void main(String[] args) throws IOException {
        char operador;
        int num1, num2;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insira o primeiro valor");
        num1 = Integer.parseInt(entrada.readLine());
        System.out.println("Insira a operação");
        System.out.println("Adição [+] Subtração [-] Multiplicação [*] Divisão [/]");
        operador = (entrada.readLine()).charAt(0);
        System.out.println("Insira o segundo valor"); 
        num2 = Integer.parseInt(entrada.readLine());
        System.out.println("\nO resultado é:");
        if (operador == '+') {
            System.out.println(num1 + num2);
        } else if (operador == '-') {
            System.out.println(num1 - num2);
        } else if (operador == '*') {
            System.out.println(num1 * num2);
        } else if (operador == '/') {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operação inválida");
        }
    }
    }
