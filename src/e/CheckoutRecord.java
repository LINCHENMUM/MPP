package gy_test.ffinal.e;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckoutRecord {
	private List<ChecoutRecordEntry> checkoutEntries = new ArrayList();
	
	
	public CheckoutRecord (){
		
		
		Predicate predicate = new Predicate() {

			@Override
			public boolean test(Object t) {
 				return false;
			}
		};
		
	}

	public void addEntry(ChecoutRecordEntry entry){
		checkoutEntries.add(entry);
	}
	
	public String toString(){
		return checkoutEntries.toString();
	}
}
