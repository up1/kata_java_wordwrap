package kata_wordwrap;

public class Wrapper {

	public String wrap(String input, int column) {
		if (input.length() <= column) {
			return input;
		} else if (input.charAt(column - 1) == ' ') {
			return (input.substring(0, column-1) + "\n" + wrap(input.substring(column), column));
		} else {
			return (input.substring(0, column) + "\n" + wrap(input.substring(column), column));
		}
	}

}
