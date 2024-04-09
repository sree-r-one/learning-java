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
		for (String str : arr) {
			System.out.print(str + ", ");
		}
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

	public static void main(String[] args) {
		String str = "The cow jumped over the moon";
		String[] tokens = RegexClass.splitString(str, " ");
		RegexClass.printTokens(tokens);

	}

}
