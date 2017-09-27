package lab6;

/*Implement  a method with the following signature and return type:
    public int countWords(List<String> words, char c, char d, int len)
which counts the number of words in the input list words that have length equal to len,
that contain the character c, and that do not contain the character d. 
Create a solution that uses a lambda expression.  */

import java.util.ArrayList;
import java.util.List;

public class CountWords {
	public static void main(String[] args){
		List<String> words=new ArrayList<String>();
		words.add("abc");
		words.add("abcd");
		words.add("def");
		words.add("linche");
		words.add("ab");
		words.add("ba");
		words.add("c");
		words.add("a");
		words.add("abcd");
				
		CountWords countWords=new CountWords();
		System.out.println(countWords.countWords(words,'a','j',4));
	}
	public int countWords(List<String> words, char c, char d, int len){
		long count=words.stream()
		     .filter(s->s.length()==len)
		     .filter(s->s.contains(String.valueOf(c)))
		     .filter(s->!s.contains(String.valueOf(d)))
		     .count();	     
		return (int)count;
	}

}
