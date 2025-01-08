import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Contains various methods for parsing Strings based on regular expressions
 */
public class RegexClass {

	/**
	 * Prints a given array of Strings
	 * 
	 * @param arr to print
	 */
	public static void printTokens(String[] arr) {
		System.out.println("Printing Tokens");

		String finalS = "";

		for (String str : arr) {
			finalS += (str + ", ");
		}

		finalS = finalS.substring(0, finalS.length() - 2);
		System.out.println(finalS);
		System.out.println();
	}

	/**
	 * Splits the given string based on the given regex pattern
	 * 
	 * @param str   to split
	 * @param regex pattern to match
	 * @return String array of tokens
	 */
	public static String[] splitString(String str, String regex) {
		return str.split(regex);
	}

	/**
	 * Replace all instances of the given pattern(regex) with thte given replacement
	 * in the given string
	 * 
	 * @param str         to replace values in
	 * @param pattern     to use for replacement
	 * @param replacement for the pattern
	 * @return updated str
	 */
	public static String replaceAllWithPattern(String str, String pattern, String replacement) {
		return str.replaceAll(pattern, replacement);
	}

	/**
	 * Parses phone number and returns various parts of a given number
	 * 
	 * @param phone number to parse
	 * @param part  of the phone number to return : 1 (area code), 2 (prefix) and 3
	 *              (number)
	 * @return part of the phone number
	 */
	public static String getPhonePart(String phone, int part) {

		if (part < 1 || part > 3) {
			throw new IllegalArgumentException("Part must be 1, 2 or 3");
		}

		String regex = "\\b(\\d{3})[-.\\s]+(\\d{3})[-.\\s]+(\\d{4})\\b";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phone);

		String phonePart = "";

		while (m.find()) {
			// Get designated group
			phonePart = m.group(part);
		}

		return phonePart;
	}

	public static void main(String[] args) {
		String str = "The cow jumped over the moon";
		String[] tokens = RegexClass.splitString(str, " ");
		RegexClass.printTokens(tokens);

		tokens = RegexClass.splitString(str, "the");
		RegexClass.printTokens(tokens);

		str = "The       cow                      jumped     over the \n moon";
		tokens = RegexClass.splitString(str, "\\s+");
		RegexClass.printTokens(tokens);

		String areadCode = RegexClass.getPhonePart("123-455-6789", 2);
		System.out.println(areadCode);

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add(0, "D");
		list.add("C");
		System.out.print(list.get(0));
		System.out.print(list.get(2));

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 400);

		// Gets EntrySet view of keys and values
		Set<Map.Entry<String, Integer>> mapSet = map.entrySet();

		for (Map.Entry<String, Integer> entrance : mapSet) {
			System.out.print(entrance.getKey() + ":");
			System.out.println(entrance.getValue());
		}

	}

}
