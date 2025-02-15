package repeticaoWhile;
import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] totais = contarIdades(scanner);
        
        System.out.println("Total de pessoas menores de 21 anos: " + totais[0]);
        System.out.println("Total de pessoas maiores de 50 anos: " + totais[1]);
        
        scanner.close();
    }

	/**Função que verifica se o valor digitado é um número.
	 * @param scanner - entrada do usuário
	 * @return caso seja um número, retorna o valor digitado pelo usuário. Do contrário, a função é chamada recursivamente.
	 * */
    private static int verificaInteiro(Scanner scanner) {
    	if (scanner.hasNextInt()) {
    		return scanner.nextInt();
        }
    	System.out.println("O valor digitado não é válido. Por favor, digite um número inteiro.");
    	scanner.next();
    	return verificaInteiro(scanner);
    }
    

    /**Função que conta as idades e retorna os totais.
     * @param scanner - entrada do usuário
     * @return um array com os totais de pessoas menores de 21 [0] e maiores de 50 [1].
     * */
    private static int[] contarIdades(Scanner scanner) {
        int menoresDe21 = 0;
        int maioresDe50 = 0;

        while (true) {
            System.out.print("Digite uma idade: ");
            int idade = verificaInteiro(scanner);

            if (idade < 0) return new int[]{menoresDe21, maioresDe50}; 
            if (idade < 21) menoresDe21++;
            if (idade > 50) maioresDe50++;
        }
    }
}
