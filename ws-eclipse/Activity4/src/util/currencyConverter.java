package util;

public class currencyConverter {
	public double indiceDolar;
	public double dolares;
	public final double iof = 0.06;
	public double converterDolReal() {
		return (dolares  * indiceDolar + ((dolares * indiceDolar) * iof));
	}
}
