import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Variáveis
Cliente cliente = new Cliente();
        
        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        
     cliente.numero = scanner.nextInt();
        
        System.out.printf("Usuário: %d\n", cliente.numero);

        System.out.println("Por favor, digite o número da conta: ");
        
    cliente.agencia = scanner.next();

        System.out.println("Número da conta: " + cliente.agencia);

        System.out.println("Por favor, digite o Nome Cliente: ");

    cliente.nomeCliente = scanner.next();

        System.out.println("Nome Cliente: " + cliente.nomeCliente);

        System.out.println("Por favor, digite o Saldo: ");
        
        cliente.saldo = scanner.nextDouble();

        System.out.printf("Valor armazenado: %f\n", cliente.saldo);

        // Mensagem
        System.out.println("Olá " + cliente.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente.agencia + ", conta " + cliente.numero + " e seu saldo " + cliente.saldo + " já está disponível para saque.");
    }
}
