import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
       //Exibir as mensagens para o nosso usuário
              
        System.out.println("Por favor, digite seu usuario");
        int usuario = scanner.nextInt();

        System.out.println("Por favor,digite o número da agencia");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();

       //Obter pela scanner os valores digitados no terminal
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + usuario + " e seu saldo " + saldo + " já está disponível para saque.");
       //Exibri a mensagem conta criada
    }
}
