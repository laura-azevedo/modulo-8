package repeticaoDoWhile;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int somaPositivos = calculaSomaPositivos(scanner);
        
        System.out.println("A soma dos números positivos é: " + somaPositivos);
	}
	
	/**
     * Função q lê números inteiros até que o número zero seja digitado e calcula a soma dos números positivos.
     * @param scanner - entrada do usuário.
     * @return A soma dos números positivos digitados.
     */
    private static int calculaSomaPositivos(Scanner scanner) {
        int soma = 0;
        int numero;

        do {
            numero = verificaInteiro(scanner);
            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        return soma;
    }

    /**
     * Função para verificar se o valor digitado pelo usuário é um número inteiro válido.
     * @param scanner - entrada do usuário.
     * @return Se o número for válido, então ele é retornado. Do contrário, a função é chamada recursivamente.
     */
    private static int verificaInteiro(Scanner scanner) {
        System.out.print("Digite um número: ");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }

        System.out.println("O valor digitado não é válido. Por favor, digite um número inteiro.");
        scanner.next();
 
        return verificaInteiro(scanner); 
    }
}
