import java.util.Locale;
import java.util.Scanner;

public class _1Q {
	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja
	 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta é o valor 2002.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha(4 digitos): ");
		int senha = sc.nextInt(), senhaCorreta = 2002;
		while (senha != senhaCorreta) {
			System.out.println("Senha Inválida!");
			System.out.println("Tente novamente(4 digitos): ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido!");
		sc.close();
	}

}
