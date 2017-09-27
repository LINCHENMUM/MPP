
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.sound.midi.SysexMessage;

public class D1 {

	/*
	 * 取第二大 a. 1,2,3,4,5 return 2 b. 1,1,1,2,2,3,4,4,5 return 2 c. LocatDate
	 * 1900-1-1,1950-1-1,1970-1-1,2000-1-1 return ,1950-1-1
	 */
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		T maxV = null;
		T secMax = null;

		if (list.size() < 2)
			return null;
		maxV = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			T temp = list.get(i);

			if (temp.compareTo(maxV) == 0 || secMax != null && temp.compareTo(secMax) == 0) {
				continue;
			}
			if (temp.compareTo(maxV) > 0) {
				secMax = maxV;
				maxV = temp;
			} else if (temp.compareTo(maxV) < 0 && secMax == null) {
				secMax = temp;
			} else {
				if (temp.compareTo(secMax) > 0) {
					secMax = temp;
				}
			}
		}
		return secMax;
	}

	/*
	 * public static <T extends Comparable<? super T>> T secondSmallest(List<T>
	 * list) {
	 * 
	 * T maxNum = null; T secMaxNum = null;
	 * 
	 * if (list.size() < 2) { return null; }
	 * 
	 * maxNum = list.get(0);
	 * 
	 * for (int i = 1; i < list.size(); i++) { T m = list.get(i);
	 * 
	 * if (m.compareTo(maxNum) == 0 || (secMaxNum != null &&
	 * m.compareTo(secMaxNum) == 0)) { continue; } if (m.compareTo(maxNum) > 0)
	 * { secMaxNum = maxNum; maxNum = m; } else if (secMaxNum == null &&
	 * m.compareTo(maxNum) < 0) { secMaxNum = m; } else { if
	 * (m.compareTo(secMaxNum) > 0) { secMaxNum = m; } } } return secMaxNum; }
	 */

	public static void main(String[] args) {
		// * a. 1,2,3,4,5 return 2
		// * b. 1,1,1,2,2,3,4,4,5 return 2
		// * c. LocatDate 1900-1-1,1950-1-1,1970-1-1,2000-1-1 return ,1950-1-1
		System.out.println(secondSmallest(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })));
		System.out.println(secondSmallest(Arrays.asList(new Integer[] { 1, 2, 2, 1, 1, 1, 3, 4, 4, 5 })));
		System.out.println(secondSmallest(Arrays.asList(new LocalDate[] { LocalDate.of(1900, 1, 1),
				LocalDate.of(1950, 1, 1), LocalDate.of(1970, 1, 1), LocalDate.of(2000, 1, 1) })));

	}
}
