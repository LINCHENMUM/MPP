import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTest {
	public static void main(String[] args){
		//List<Integer> input=new ArrayList<Integer>(){50,8,4,22,25,27,20};
		Integer[] input={50,8,4,22,25,27,20};
		//int[] array={1,2,3};
		System.out.println(getMaxInt(Arrays.asList(input),2,6));
	}
	
	public static <T extends Comparable<? super T>>T getMaxInt(List<T> list,int begin,int end){
		if(end>list.size()){
			end=list.size();
		}
		if (begin>list.size()){
			return null;
		}
		T max=list.get(begin);
		for (int i=begin;i<end;i++){
			T temp=list.get(i);
			if(temp.compareTo(max)>0){
				max=temp;
			}
		}
		return max;
		
	}

}
