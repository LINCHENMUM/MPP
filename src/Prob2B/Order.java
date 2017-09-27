package Prob2B;

import java.util.List ;  
import java.util.ArrayList ;

public class Order {
	
private String orderNum;
private List<OrderLine> allOrderLine;

public Order(){
	this.allOrderLine=new ArrayList<OrderLine>();
}

public Order(String orderNum) {
	this();
	this.orderNum=orderNum;	
}

public String getOrderNum() {
	return orderNum;
}

public void setOrderNum(String orderNum) {
	this.orderNum = orderNum;
}
public List getAllOrderLine() {
	return this.allOrderLine;
}
public String toString() {
	return "orderNum="+orderNum;
}
}
