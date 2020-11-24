import java.util.Locale;
import java.util.Scanner;

public class _6Q {
	/* Ler um número inteiro N e calcular todos os seus divisores. */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um inteiro N: ");
		int N=sc.nextInt();
		
		for(int cont=1;cont<=N;cont++) {
			if(N%cont == 0) {
				System.out.println(cont);
			}
			
			
		}
		
		
		
		sc.close();
	}

}
