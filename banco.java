import java.util.Scanner;
public class ProjetoContaBancaria {
	public static void main(String[] args) {
		Scanner leitura =  new Scanner(System.in);
		
		String nome = "Elem de Oliveira"; 
		String tipoDaConta = "Corrente";
		double saldo = 1599.99;
		
		System.out.println("*************************");
		System.out.println("Dados iniciais do cliente:\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: " + nome);
		System.out.println("Tipo da conta: " + tipoDaConta);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("*************************");
		System.out.println();
		
		int opcao = 0;
		
		String menu = """
				** Digite sua opção **
				
				1 - Consultar saldo
				2 - Tranferir valor
				3 - Receber valor
				4 - Sair
				
				""";
		
		while (opcao != 4) {
			System.out.println(menu);
			opcao = leitura.nextInt();

		if (opcao == 1) {
			System.out.println("O seu saldo é de: " + saldo);
			System.out.println();
			
		} else if (opcao == 2) {
			System.out.println("Qual o valor que deseja transferir?");
			double valor = leitura.nextDouble();
			
			if (valor > saldo) {
				System.out.println("Não há saldo para realizar tranfência!\n");
			
			} else {
				saldo -= valor;
				System.out.println("Tansferência realizada com sucesso!\n");
			}
			
		} else if (opcao == 3) {
				System.out.println("Valor recebido: ");
				double valor = leitura.nextDouble();
				saldo += valor;
				System.out.println("Valor recebido com sucesso!\n");
				
		}else {
			System.out.println("Obrigado pela Preferência!");
			 
		  }
	   } 
		
		System.out.println("\n*************************\n");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo da conta: " + tipoDaConta);
		System.out.println("Saldo atual: " + saldo);
		System.out.println("***************************\n");
	}
}
