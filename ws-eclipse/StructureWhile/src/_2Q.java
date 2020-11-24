import java.util.Locale;
import java.util.Scanner;

public class _2Q {
	/*
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
	 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
	 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
	 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
	 * alguma).
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite X e Y: ");
		int x = sc.nextInt(), y = sc.nextInt();
		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if(x<0 && y>0){
				System.out.println("Segundo");
			}else {
				break;
			}
			System.out.println("Digite X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
