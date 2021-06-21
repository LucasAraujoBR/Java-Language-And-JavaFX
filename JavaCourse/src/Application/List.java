package Application;

import java.util.ArrayList;
import java.util.Locale;

/*tamanho da lista size()
inserir elemento na lista: add(obj),add(int,obj)
remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
encontrar posição do elemento: indexOf(obj), lastIndexOf(obj)
filtrar lista com base em predicado:
list<Integer> result = list.stream().filter(x -> x > 4).collect(collectors.toList());
encontrar a primeira ocorrência com base em predicado:
Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);*/
public class List {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ArrayList<String> list = new ArrayList<>();
		list.add("Lucas");
		list.add("Izabella");
		list.add("Karol");
		list.add("Karine");

		System.out.println(list.size());

		list.remove(3);

		for (String x : list) {
			System.out.println(x);

		}
		System.out.println("----------------------------");
		list.removeIf(x -> x.charAt(0) == 'K');	//remove todos com o primeiro caracter igual a K
		for (String x : list) {
			System.out.println(x);

		}
		
		System.out.println("-------------------");
		System.out.println("Index of Lucas: " + list.indexOf("Lucas"));
		System.out.println("Index of Lucas: " + list.indexOf("Izabella"));
		System.out.println("-------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
	}

}
