// o que sao exceçoes?
// Exceção: erro que acontece em tempo de execução
// quando o programa encontra um problema que interrompe seu fluxo normal
// Exemplos comuns de exceções:
// - Divisão por zero (arithmeticException)
// - Acesso a posição inexistente de array (ArrayIndexOutOfBoundsException)
// - Tentar abrir um arquivo que não existe (FileNotFoundException)
// - Entrada de tipo errado com Scanner (InputMismatchException)

// EXEMPLO
import java.util.InputMismatchException;
import java.util.Scanner;

public class excecaoExemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            int resultado = 100 / numero;
            System.out.println("100 divididos por " + numero + " é igual a " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor digitado nao pode ser convertido para numero");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Execução finalizada");
        } //se der algum erro, capture esse erro e me de acesso a ele atraves da variavel e.
    }     //o catch mais especifico vem antes do Exception (que é o mais generico).
}         // se colocar catch (Exception e) primeiro, os outros nunca serão alcançados.
