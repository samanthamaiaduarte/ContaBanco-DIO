import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a conta: ");
		int numero = sc.nextInt();		
		System.out.print("Informe a agência: ");
		sc.nextLine();
		String agencia = sc.nextLine();
		System.out.print("Informe o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Informe o saldo inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        
		sc.close();
    }
}
