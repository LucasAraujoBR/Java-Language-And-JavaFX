package QuartoQuesito;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;


public class Datas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um dia: ");
		int dia = sc.nextInt();
		System.out.println("Digite um mês: ");
		int mes = sc.nextInt();
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();

		LocalDate minhaData = LocalDate.of(ano, mes, dia);
		DateTimeFormatter meuFormatador = DateTimeFormatter.ofPattern("dd-MM-YYYY");
		String dataFormatada = meuFormatador.format(minhaData);
		System.out.println(dataFormatada);

		LocalDate dtHoje = LocalDate.now();
		
		long diffEmMil = minhaData.toEpochDay() - dtHoje.toEpochDay();
		System.out.println("Diferença em dias da data atual: "+ Math.abs(diffEmMil));


		LocalDate somaData = minhaData.plusDays(110);
		System.out.println("Nova data obtida, após soma de 110 dias: " + somaData);
		System.out.println();
		mes = 8;
		minhaData = LocalDate.of(ano, mes, dia);
		System.out.println("Mes alterado para agosto!");
		System.out.println(minhaData);

		System.out.println();
		System.out.println("Data formatada!");
		meuFormatador = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
		dataFormatada = meuFormatador.format(minhaData);
		System.out.println(dataFormatada);
		System.out.println();

		System.out.println("Digite dia,mes e ano: ");
		int dia1 = sc.nextInt(), mes1 = sc.nextInt(), ano1 = sc.nextInt();
		System.out.println("Digite outra data dia,mes e ano: ");
		int dia2 = sc.nextInt(), mes2 = sc.nextInt(), ano2 = sc.nextInt();
		LocalDate minhaData1 = LocalDate.of(ano1, mes1, dia1);
		LocalDate minhaData2 = LocalDate.of(ano2, mes2, dia2);

		retornaData(minhaData1, minhaData2);
		System.out.println(retornaData(minhaData1, minhaData2) + " Dias úteis.");

	}

	public static int retornaData(LocalDate minhaData1, LocalDate minhaData2) {
		Period p = Period.between(minhaData1, minhaData2);
		long nuDiasExecutados = Math.abs(minhaData1.toEpochDay() - minhaData2.toEpochDay());
		int totalDiasExecutadosUteis = 0;
		Calendar cal = Calendar.getInstance();
		for (int i = 1; i <= nuDiasExecutados; i++) {

			cal.add(Calendar.DATE, 1);
			if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				totalDiasExecutadosUteis += 1;
			}
		}
		return totalDiasExecutadosUteis;

	}

}
