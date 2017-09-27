package Prob2B;

public class OrderLine {
	private Order order;//one orderline belong one order;
	public void setOrder(Order order) {
		this.order=order;
	}
	public Order getOrder(){
		return this.order;
	}
	public OrderLine(){
		
	}
	public String toString(){
		return "OderLine has no attribute";
	}

}
