
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);

        //Exibir as mensagens para o o nosso usuário - Agencia
        System.out.println("Digite o numero de sua agência");

        //Obter pela scanner os valores digitados no terminal - Agencia
        var agencia = scanner.next();

        //Exibir as mensagens para o o nosso usuário - Conta
        System.out.println("Digite o numero de sua conta");

        //Obter pela scanner os valores digitados no terminal - Conta
        var conta = scanner.nextInt();

         //Exibir as mensagens para o o nosso usuário - Nome
        System.out.println("Digite seu nome completo");

        //Obter pela scanner os valores digitados no terminal - Nome
        var nomeCompleto = scanner.next();

         //Exibir as mensagens para o o nosso usuário - Saldo
        System.out.println("Digite seu saldo");

        //Obter pela scanner os valores digitados no terminal - Saldo
        var saldo = scanner.nextInt();

        //Exibir a mensagem conta criada
        //System.out.printf(nomeCompleto \n + "sua agência é:" + agencia \n + "o número da sua conta é:" + conta \n + "Seu saldo disponivél é: R$"+saldo);
        System.out.printf(nomeCompleto);
        System.out.printf(" Sua agência é: " + agencia);
        System.out.printf(" Sua conta é: " + conta);
        System.out.printf(" Seu saldo é: R$" + saldo);
        
    }
}
