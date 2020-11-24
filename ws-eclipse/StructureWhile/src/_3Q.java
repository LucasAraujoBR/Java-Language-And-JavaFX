import java.util.Locale;
import java.util.Scanner;

public class _3Q {
	/*
	 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
	 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
	 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
	 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
	 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
	 * será encerrado quando o código informado for o número 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
	 * tipo de combustível, conforme exemplo.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Tipo de combustível: ");
		System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim");
		System.out.println("Digite sua escolha: ");
		int gasolina=0,alcool=0,diesel=0;
		int opcao = sc.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Você escolheu Álcool!");
			alcool++;
			break;
		case 2:
			System.out.println("Você escolheu Gasolina!");
			gasolina++;
			break;
		case 3:
			System.out.println("Você escolheu Diesel!");
			diesel++;
			break;
		case 4:
			break;
		}
			while(opcao != 4){
			System.out.println("Tipo de combustível: ");
			System.out.println("1.Álcool\n2.Gasolina\n3.Diesel\n4.Fim");
			System.out.println("Digite sua escolha: ");
			opcao = sc.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Você escolheu Álcool!");
				alcool++;
				break;
			case 2:
				System.out.println("Você escolheu Gasolina!");
				gasolina++;
				break;
			case 3:
				System.out.println("Você escolheu Diesel!");
				diesel++;
				break;
			case 4:
				break;
			}
			
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
