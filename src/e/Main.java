package gy_test.ffinal.c;

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
	
		System.out.println("\n"+"5-----------------");
		double minValue = menu.stream().map(d -> d.getCalories()).reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(minValue);
		
		System.out.println("\n"+"6---不会写，需再次讨论-------------");

		 Filter_By_Calory.apply(menu, 400).forEach(System.out::println);;
	}
	
	
	final static BiFunction <List<Dish>, Integer, List<Dish>> Filter_By_Calory = 
			(list, c) -> list.stream()
			.filter(d -> d.getCalories() > c)
			.collect(Collectors.toList());
			
			
}
