import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		String product1 = "Computer";
		String product2 = "Ofice Desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println(product1 + ", which price is $ " + price1);
		System.out.println(product2 + ", which price is $ " + price2);
		System.out.println("Record:" + age + " years old, code " + code + " and gender: " + gender);
		System.out.println("Measue with eight decimal places: " + measure);
		System.out.printf("Rouded (three decimal places): %.3f", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("\nUS decimal point: %.3f", measure);
		// padr�o para Scanner
		Scanner sc = new Scanner(System.in);
		// Scanner de String
		String nome;
		System.out.println("\nDigite um nome: ");
		nome = sc.next();
		System.out.println("Seu nome eh: " + nome);

		// Scanner de Int
		int inteiro;
		System.out.println("\nDigite um numero: ");
		inteiro = sc.nextInt();
		System.out.println("Seu numero eh: " + inteiro);
		// sempre que usar Scanner fica sc.next(variavel pedida)(); ex double x fica
		// sc.nextDouble();
	}
	// para char sc.next().charAT(0);
	//sc.nextLine(); para ler toda a linha digitada

}
