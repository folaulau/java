package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainString {
	public static void main(final String[] args) {
		final String str = "folau kinga lisa";
		MainString.longestWord(str);
		MainString.letterChange("Argument goes here");
		MainString.SimpleAdding(140);
		MainString.letterCapitalize("Argument goes here");// http://www.tutorialspoint.com/javaexamples/regular_case.htm
		MainString.factorial(8);
		final List<String> strs = new ArrayList<String>();
		strs.add("foo");
		strs.add("foo");
		strs.add("foo");
		strs.add("ba");
		strs.add("spo");
		MainString.stripEvenLength(strs);
		System.out.println(strs);
	}

	public boolean contain3(final List<String> strs) {
		final List<String> words = strs;
		final Iterator it = words.iterator();
		final Map<String, Integer> map = new HashMap<String, Integer>();
		while (it.hasNext()) {
			final String str = it.next().toString();
			final int newValue = ((map.get(str) == null) || (map.get(str) == 0)) ? 1 : map.get(str) + 1;
			map.put(str, newValue);
		}
		System.out.println(map);
		final Iterator it1 = map.values().iterator();
		while (it1.hasNext()) {
			final int num = (Integer) it1.next();
			if (num >= 3) {
				return true;
			}
		}
		return false;

	}

	private static void stripEvenLength(final List strs) {
		final List<String> words = strs;
		final Iterator it = words.iterator();
		while (it.hasNext()) {
			final String str = it.next().toString();
			if ((str.length() % 2) == 0) {
				it.remove();
			}
		}
	}

	private static void factorial(final int num) {
		int total = 1;
		for (int i = 1; i <= num; i++) {
			total *= i;
		}
		System.out.println("total: " + total);

	}

	private static void letterCapitalize(final String string) {
		final String[] words = string.split(" ");
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {

			sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1, words[i].length()) + " ");
		}
		System.out.println(sb.toString().trim());
	}

	private static void SimpleAdding(final int num) {
		int total = 0;
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		System.out.println("total: " + total);
	}

	private static void longestWord(final String str) {
		final String[] words = str.split(" ");
		int longest = 0;
		String longestWord = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longest) {
				longest = words[i].length();
				longestWord = words[i];
			}
		}
		System.out.println("Word: " + str + " --> longestword: " + longestWord);
	}

	private static void letterChange(final String str) {
		System.out.println("letter to change: " + str);
		final String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
				"x", "y", "z" };
		final String str1 = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			final int pos = Arrays.asList(alphabet).indexOf(str1.charAt(i) + "");
			if (pos >= 0) {
				sb.append(alphabet[pos + 1]);
			} else {
				sb.append(str1.charAt(i));
			}

		}

		final String str2 = sb.toString();

		final String[] vowels = { "a", "e", "i", "o", "u" };

		sb = new StringBuilder();

		for (int i = 0; i < str2.length(); i++) {
			final int pos = Arrays.asList(vowels).indexOf(str2.charAt(i) + "");
			if (pos >= 0) {
				sb.append(vowels[pos].toUpperCase());
			} else {
				sb.append(str2.charAt(i));
			}

		}
		System.out.println("letter changed: " + sb.toString());
	}

	// private static String capVowels(final String string) {
	// final String[] vowels = { "a", "e", "i", "o", "u" };
	// final StringBuilder sb = new StringBuilder();
	// for (int i = 0; i < string.length(); i++) {
	// final int pos = Arrays.asList(vowels).indexOf(string.charAt(i) + "");
	// if (pos > 0) {
	// sb.append(vowels[pos].toUpperCase());
	// } else {
	// sb.append(string.charAt(i));
	// }
	//
	// }
	// return sb.toString();
	// }
	//
	// private static String pushBackLetter(final String str) {
	// final String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
	// "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
	// "x", "y", "z" };
	// final StringBuilder sb = new StringBuilder();
	// for (int i = 0; i < str.length(); i++) {
	// final int pos = Arrays.asList(alphabet).indexOf(str.charAt(i) + "");
	// if (pos > 0) {
	// sb.append(alphabet[pos + 1]);
	// } else {
	// sb.append(str.charAt(i));
	// }
	//
	// }
	// return sb.toString();
	// }

}
