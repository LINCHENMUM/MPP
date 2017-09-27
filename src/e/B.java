package gy_test.ffinal.ab;

import java.util.Arrays;
import java.util.List;

public class B {

	public static <T extends Comparable<? super T>> T findMaxNum(List<T> list,int begin,int end) {
		if(begin > list.size()){
			return null;
		}
		if(end > list.size()){
			end = list.size();
		}
		T max = list.get(begin);
		for (int i = begin; i < end; i++) {
			T t = list.get(i);
			if (t.compareTo(max) > 0) {
				max = t;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Integer[] s = { 50, 8, 4, 9, 11, 25, 1, 19, 7, 29 };
		int a = findMaxNum(Arrays.asList(s),2,6);
		System.out.println(a);
	}
}
