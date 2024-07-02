import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String firstName;
        String agencyNumber;
        int accountNumber = 0;
        double balance = 1.93;

        System.out.println("");
        System.out.println("Por favor, nos informe seu nome:");
        firstName = sc.nextLine();

        System.out.println("");
        System.out.println("Informe o número da agência do seu banco:");
        agencyNumber = sc.nextLine();

        System.out.println("");
        System.out.println("Informe o número de sua conta (apenas números):");
        accountNumber = sc.nextInt();

        // Msg final
        System.out.println("");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.", firstName, agencyNumber, accountNumber, balance);
        
        sc.close();
    }
}
