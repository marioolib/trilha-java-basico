import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta: ");
        int conta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
