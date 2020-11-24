import java.util.Locale;
import java.util.Scanner;

public class _2Q {
	/*
	 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
	 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
	 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
	 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
	 * "out" para fora do intervalo).
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro N: ");
		int in =0,out = 0,N = sc.nextInt(),x = 0;
		for(int cont = 0;cont < N;cont++) {
			System.out.println("Digite um valor: ");
			x = sc.nextInt();
			if(x>=10 && x<=20) {
				in++;
			}else {
				out++;
			}
		}
		System.out.println(in + " IN");
		System.out.println(out + " OUT");
	sc.close();
	}

}
