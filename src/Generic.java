import java.util.ArrayList;
import java.util.List;

public class Generic {
public static void main(String[] args){
	List<Apple> box= new ArrayList<Apple>();
	box.add(new Apple(10, "Red"));
	Apple apple=box.get(0);
	System.out.println(apple);
}
}
