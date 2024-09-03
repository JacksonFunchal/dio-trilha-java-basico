import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        // TODO: Conhecer e importar a classe scanner 
        // Exibir as mensagens para o usuário
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem final (conta criada)

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US); 

        System.out.println("Numero da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Agencia:");
        String agencia = scanner.next();

        System.out.println("Nome do Cliente:");
        String nome = scanner.next();

        System.out.println("Saldo:");
        double saldo = scanner.nextDouble();
    
        // Exibindo dados obtidos pelo usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia +
                           ", conta " + numero + " e seu saldo " + saldo + " ja esta disponível para saque.");
    }
}
