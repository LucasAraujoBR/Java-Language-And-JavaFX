

public class maintesta {

	public static void main(String[] args) {
		int tamanho = 6;
		BilDLoteria bl = new BilDLoteria(tamanho);
		BilDLoteria bl2 = new BilDLoteria(tamanho);
		bl.executaLoteria(tamanho);
		System.out.println(bl.toString());
		//System.out.println(bl.toString());

	}

}
