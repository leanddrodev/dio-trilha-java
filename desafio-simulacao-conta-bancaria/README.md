## Desafio - Simulação Conta Bancária

O sistema simula a criação de uma conta de banco no terminal. São digitados a conta, a agência, o nome do cliente e o saldo inicial. Ao término, são impressos no console um agradecimento e os dados de criação da conta bancária.

```java
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu Saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
```
