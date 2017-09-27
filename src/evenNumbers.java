import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class evenNumbers {
	
	public static void main(String[] args){
		evenNumbers even=new evenNumbers();
		even.evenNumbers(20);
	}
	
	public void evenNumbers(int n){
		Stream.iterate(BigInteger.ZERO,num->num.add(BigInteger.ONE).add(BigInteger.ONE))
		         .limit(n)
		         .forEach(System.out::println);
		IntStream.iterate(0, i->i+2)
		         .limit(n)
		         .forEach(System.out::println);
		List<Integer> array=Arrays.asList(1,2,3,5,6,2,3,4);
		array.stream()
		     .filter(i->i%2==0)
		     .distinct()
		     .sorted()
		     .forEach(System.out::println);
	}
}
