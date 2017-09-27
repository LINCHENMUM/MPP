

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class D {

	// create a generic programming solution to the problem of finding this the
	// second
	// smallest element in an Array; In other words,devise a public static
	// method secondSmallest,SO
	// that it can handle the biggest possible range of types(such as
	// Integer,Double,Number,
	// LocaDate,etc),You only need to write the generic method,no need to create
	// test case
	/*
	 * a. 1,2,3,4,5 return 2 
	 * b. 1,1,1,2,2,3,4,4,5 return 2 
	 * c. LocatDate 1900-1-1,1950-1-1,1970-1-1,2000-1-1 return ,1950-1-1
	 */
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {

		T minNum = null;
		T secMinNum = null;

		if (list.size() < 2) {
			return null;
		}

		minNum = list.get(0);

		for (int i = 1; i < list.size(); i++) {
			T m = list.get(i);

			if (m.compareTo(minNum) == 0 || (secMinNum != null && m.compareTo(secMinNum) == 0)) {
				continue;
			}

			if (m.compareTo(minNum) < 0) {
				secMinNum = minNum;
				minNum = m;
			} else if (secMinNum == null || m.compareTo(secMinNum) < 0) {
				secMinNum = m;
			}
		}
		return secMinNum;
	}

	public static void main(String[] args) {
		// * a. 1,2,3,4,5 return 2
		// * b. 1,1,1,2,2,3,4,4,5 return 2
		// * c. LocatDate 1900-1-1,1950-1-1,1970-1-1,2000-1-1 return ,1950-1-1
		System.out.println(secondSmallest(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })));
		System.out.println(secondSmallest(Arrays.asList(new Integer[] { 1, 2, 2, 1, 0, 1, 1, 1, 3, 4, 4, 5 })));
		System.out.println(secondSmallest(Arrays.asList(new LocalDate[] { LocalDate.of(1900, 1, 1),
				LocalDate.of(1950, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(2000, 1, 1) })));

	}
}
