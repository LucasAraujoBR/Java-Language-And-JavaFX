import java.util.Locale;
import java.util.Scanner;

public class _4Q {
	/*
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
	 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
	 * uma duração mínima de 1 hora e máxima de 24 horas.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double hora1, hora2, duracao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora inicial e a final do jogo: ");
		hora1 = sc.nextDouble();
		hora2 = sc.nextDouble();
		if (hora1 < hora2) {
			duracao = hora1 - hora2;
		} else {
			duracao = 24 - hora1 + hora2;
		}
		System.out.printf("\nO jogo durou: %.2f Horas!", Math.abs(duracao));

		sc.close();
	}

}
