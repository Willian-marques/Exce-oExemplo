
# Tratamento de Exceções em Java

Este projeto demonstra como lidar com **exceções** em Java. Exceções são eventos que ocorrem durante a execução do programa e interrompem seu fluxo normal quando há algum erro.

---

## 🧠 O que são exceções?

**Exceção** é um erro que acontece em tempo de execução. Quando o programa encontra um problema que o impede de continuar normalmente, uma exceção é lançada.

### Exemplos comuns:
- **ArithmeticException**: tentativa de divisão por zero.
- **ArrayIndexOutOfBoundsException**: acesso a uma posição inexistente de um array.
- **FileNotFoundException**: tentativa de abrir um arquivo que não existe.
- **InputMismatchException**: quando o tipo de entrada não é o esperado (ex: texto ao invés de número).

---

## 💻 Exemplo de Código em Java

```java
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
        }
    }
}
```

---

## 📌 Dicas Importantes

- Sempre trate as exceções **mais específicas antes** das mais genéricas (`Exception`).
- O bloco `finally` é utilizado para garantir que certos recursos sejam fechados, mesmo se um erro acontecer.
- A captura de exceções permite que o programa continue rodando ou que exiba uma mensagem amigável ao usuário ao invés de simplesmente travar.

---

## 📝 Conclusão

Tratar exceções é uma prática essencial em qualquer aplicação Java, garantindo **resiliência** e **melhor experiência para o usuário**.
