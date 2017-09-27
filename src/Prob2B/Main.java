package Prob2B;

import java.util.Iterator;

public class Main {
public static void main(String[] args){
	Order order=new Order("Test OrderNum");
	OrderLine orderLine1=new OrderLine();
	OrderLine orderLine2=new OrderLine();
	OrderLine orderLine3=new OrderLine();
	order.getAllOrderLine().add(orderLine1);
	order.getAllOrderLine().add(orderLine2);
	order.getAllOrderLine().add(orderLine3);
	
	System.out.println(order);
	System.out.println();
	Iterator<OrderLine> iterator=order.getAllOrderLine().iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println(orderLine1.getOrder());
	System.out.println(orderLine2.getOrder());
	System.out.println(orderLine3.getOrder());
}
}
