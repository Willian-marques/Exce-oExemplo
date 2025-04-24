# 🚀 Guia Completo: Tratamento de Exceções em Java

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white" alt="Markdown">
</div>

## 📌 Índice
1. [O que são Exceções?](#-o-que-são-exceções)  
2. [Exemplo Completo](#-exemplo-completo)  
3. [Como Funciona?](#-como-funciona)  
4. [Hierarquia de Exceções](#-hierarquia-de-exceções)  
5. [Melhores Práticas](#-melhores-práticas)  
6. [Exercícios Práticos](#-exercícios-práticos)  

---

## 🧠 O que são Exceções?
Exceções são **erros em tempo de execução** que interrompem o fluxo normal do programa. Principais tipos:

| Tipo de Exceção               | Causa Típica                     |
|-------------------------------|----------------------------------|
| `ArithmeticException`         | Divisão por zero                 |
| `NullPointerException`        | Acesso a objeto `null`           |
| `ArrayIndexOutOfBoundsException` | Índice inválido em array       |
| `InputMismatchException`      | Entrada de tipo errado no Scanner|

```java
// Exemplo rápido:
int x = 10 / 0; // Lança ArithmeticException
💻 Exemplo Completo
java
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Bloco de código monitorado
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                throw new IllegalArgumentException("Zero não é permitido!");
            }
            
            int resultado = 100 / numero;
            System.out.println("Resultado: " + resultado);
            
        } catch (InputMismatchException e) {
            System.err.println("⚠️ Erro: Valor deve ser um número inteiro!");
            
        } catch (ArithmeticException e) {
            System.err.println("⚠️ Erro: Divisão por zero!");
            
        } catch (IllegalArgumentException e) {
            System.err.println("⚠️ Erro: " + e.getMessage());
            
        } finally {
            scanner.close();
            System.out.println("\n🔹 Recursos liberados com sucesso!");
        }
    }
}
⚙️ Como Funciona?
try

Bloco onde o código potencialmente problemático é executado

catch

Captura exceções específicas (ordem do mais específico para o genérico)

java
catch (TipoExceção e) {
    // Tratamento personalizado
}
finally

Sempre executado (ideal para liberar recursos como arquivos/connections)

throw

Lança manualmente uma exceção

java
throw new MinhaExcecao("Mensagem de erro");
🌳 Hierarquia de Exceções
Throwable
├── Error (Ex: OutOfMemoryError) → Não deve ser capturado
└── Exception
    ├── RuntimeException (Ex: NullPointerException)
    └── Checked Exceptions (Ex: IOException)
✅ Melhores Práticas
▶️ Capture exceções específicas antes das genéricas

▶️ Use try-with-resources para auto-fechamento (Java 7+)

java
try (Scanner sc = new Scanner(System.in)) {
    // Código aqui
} // Scanner é fechado automaticamente
▶️ Documente exceções com @throws:

java
/**
 * @throws IllegalArgumentException Se o valor for negativo
 */
public void setValor(int v) {
    if (v < 0) throw new IllegalArgumentException();
}
🏋️ Exercícios Práticos
Validador de Email
Crie um método que lança IllegalArgumentException se o email não contiver "@"

Calculadora Segura
Modifique o exemplo anterior para:

Aceitar números decimais

Tratar todas as exceções possíveis

Leitor de Arquivos
Implemente um leitor que trata FileNotFoundException
