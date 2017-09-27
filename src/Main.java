

import java.text.Format;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {

	public static final List<Dish> menu =

			Arrays.asList(new Dish("pork", false, 800, Type.MEAT), 
					new Dish("beef", false, 700, Type.MEAT),
					new Dish("chicken", false, 400, Type.MEAT), 
					new Dish("french fries", false, 530, Type.OTHER),
					new Dish("rice", true, 350, Type.OTHER), 
					new Dish("season fruit", true, 120, Type.OTHER),
					new Dish("pizza", true, 550, Type.OTHER), 
					new Dish("prawns", false, 400, Type.FISH),
					new Dish("salmon", false, 450, Type.FISH));
	
	
	public static void main(String[] args) {
		
		menu.stream()
		    .filter(m->!m.isVegetarian() && m.getCalories()>400)
		    .forEach(System.out::println);
		System.out.println(".........................................");          
		menu.stream()
		    .filter(m->m.getType().equals(Type.MEAT))
		    .sorted(Comparator.comparing(Dish::getCalories))
		    .limit(3)
		    .forEach(System.out::println);
		
		System.out.println(".........................................");
		String output=menu.stream()
		    .map(m->m.getName())
		    .collect(Collectors.joining(","));
		System.out.println(output);
		    //.forEach(m->System.out.print(m.getName()););
		System.out.println(".........................................");
		String TF=menu.stream()
				      .map(m->{
				    	  String result="";
				    	  if (m.getName().equals("french fries"))
				    		  result="true";
				    	  else
				    		  result="false";
				    	  return result;
				      })
				     .toString();
		System.out.println(TF);
		
		menu.stream()
		    .filter(m->m.getName().equals("french fries"))
		    .map(m->m.isVegetarian())
		    .forEach(System.out::println);
		System.out.println(".........................................");
		int result=menu.stream()
		    .map(Dish::getCalories)
		    //.reduce(0,Integer::max)
		    .reduce(Integer.MAX_VALUE, Integer::min)
		    .intValue();
		    
		System.out.println(result);
		System.out.println(".........................................");
		Filter_By_Calory.apply(menu, 400).forEach(System.out::println);
		
		System.out.println("xxxxxxxxxxxx.........................................");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("1-----------------");
		menu.stream().filter(d -> !d.isVegetarian() && d.getCalories() > 400).forEach(System.out::println);

		System.out.println("\n"+"2-----------------");
		menu.stream().filter(d -> d.getType() == Type.MEAT).sorted(Comparator.comparing(Dish::getCalories)).limit(3)
				.forEach(System.out::println);
		
		System.out.println("\n"+"3-----------------");
		String a = menu.stream().map(d -> d.getName()).collect(Collectors.joining(","));
		System.out.println(a);
		
		System.out.println("\n"+"4-----------------");
		menu.stream().filter(d-> "french fries".equals(d.getName())).map(d -> d.isVegetarian()).forEach(System.out::println);
	     
		System.out.println("dddddddd");
		menu.stream().map(m->m.getName().equals("french fries")?"true":"false")
		             .forEach(System.out::println);

		
		System.out.println("\n"+"5-----------------");
		double minValue = menu.stream().map(d -> d.getCalories()).reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(minValue);
		
		System.out.println("\n"+"6---不会写，需再次讨论-------------");

		 Filter_By_Calory.apply(menu, 400).forEach(System.out::println);;
	}
	
	static BiFunction<List<Dish>, Integer, List<Dish>> Filter_By_Calory=
			(list,i)->list.stream().filter(m->m.getCalories()>i).collect(Collectors.toList());
			
	
	
	
	
	
	
	
	
	
	
	
	
//	final static BiFunction <List<Dish>, Integer, List<Dish>> Filter_By_Calory = 
//			(list, c) -> list.stream()
//			.filter(d -> d.getCalories() > c)
//			.collect(Collectors.toList());
			
}
