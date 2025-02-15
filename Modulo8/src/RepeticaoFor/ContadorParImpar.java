package RepeticaoFor;
import java.util.Scanner;


public class ContadorParImpar {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contagemPares = 0;
        int contagemImpares = 0;

        for (int i = 1; i <= 10; i++) { 
            int numero = verificaInteiro(scanner, i);
            if (verificaPar(numero)) {
                contagemPares++;
                continue;
            }
            contagemImpares++;
        }
        System.out.println("Total de números pares: " + contagemPares);
        System.out.println("Total de números ímpares: " + contagemImpares);
    }



	/**
     * Função recursiva q verifica se o valor digitado pelo usuário é um número inteiro válido.
     * Caso o número seja válido, ele é retornado. 
     * Caso contrário, é exibida uma mensagem de erro e a função é chamada de maneira recursiva.
     * @param scanner - O objeto Scanner usado para ler a entrada do usuário.
     * @param indice - O índice do número a ser lido, usado para exibir uma mensagem indicando qual número está sendo solicitado.
     * @return O número inteiro digitado pelo usuário, se válido.
     */

    private static int verificaInteiro(Scanner scanner, int indice) {
        System.out.print("Digite o " + indice + "º número: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }

        System.out.println("O valor digitado não é válido. Por favor, digite um número inteiro.");
        scanner.next();
        return verificaInteiro(scanner, indice); 
    }
    
    /**Função que verifica se o número é par.
     * @param numero
     * @return true se for par, false se for impar.
     */

    private static boolean verificaPar(int numero) {
        return numero % 2 == 0;
    }

}