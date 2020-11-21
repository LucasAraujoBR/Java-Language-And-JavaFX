import java.util.Scanner;

public class _1Q {
/*
Faça um programa para ler dois valores inteiros,
 e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/
	public static void main(String[] args) {
		int a,b;
		System.out.println("Digite dois inteiros: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("A soma eh = " + (a+b));
		sc.close();
	}

}
