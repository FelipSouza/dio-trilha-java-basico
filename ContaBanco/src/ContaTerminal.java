import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Importando a classe Sacnner
        Scanner scanner = new Scanner(System.in);

        //declarando variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        //Exibindo as mensagens solicitando número da agência
        System.out.println("Por favor, digite o número da Agência !");
        
        //Obter pela scanner os valores digitados no terminal
        numeroConta = scanner.nextInt();

        //Exibindo as mensagens solicitando agência
        System.out.println("Por favor, digite sua Agência !");

        //Obter pela scanner os valores digitados no terminal
        agencia = scanner.next();
        
        //Exibindo as mensagens solicitando Nome do Cliente
        System.out.println("Por favor, digite seu nome !");

        //Obter pela scanner os valores digitados no terminal
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        //scanner.nextLine(); //Limpar o buffer após nextLine() acima

        //Exibindo as mensagens solicitando Saldo
        System.out.println("Por favor, digite seu saldo !");
        
        //Obter pela scanner os valores digitados no terminal
        saldo = scanner.nextDouble();
        
    
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma " +
        "conta em nosso banco, sua agencia é " + agencia + ", conta " + numeroConta +
        " e seu saldo " + saldo + " já está disponível para saque.");
    
    }
}
