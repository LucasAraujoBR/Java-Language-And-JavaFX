import java.util.Locale;
import java.util.Scanner;

public class _4Q {
	/*
	 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
	 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
	 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
	 * casas decimais.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numeroDoFuncionario,horasTrabalhadas,valorRecebidoPorHora;
		System.out.println("Digite o numero do funcionairo: ");
		numeroDoFuncionario = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		System.out.println("Digite o valor recebido por hora: ");
		valorRecebidoPorHora = sc.nextDouble();
		System.out.printf("Funcionario de numero %.0f recebe R$:%.2f" ,numeroDoFuncionario,(horasTrabalhadas*valorRecebidoPorHora) );
		sc.close();
	}

}
