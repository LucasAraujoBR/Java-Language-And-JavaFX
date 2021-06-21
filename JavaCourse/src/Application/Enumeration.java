package Application;

import java.util.Date;

import entities.Order;
import entities.OrderStatus;

public class Enumeration {

	public static void main(String[] args) {
		Order order = new Order(01, new Date(), OrderStatus.PEDING_PAYMENT);
		System.out.println(order);

	// conversão de string para enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);	
	
	
	
	
	}

}
