package kata_wordwrap;

public class Wrapper {

	public String wrap(String input, int column) {
		if (input.length() <= column) {
			return input;
		}
		int space = (input.substring(0, column).lastIndexOf(' '));
		if (space != -1) {
			return breakLine(input, space, column, 1);
		} else if (input.charAt(column) == ' ') {
			return breakLine(input, column, column, 1);
		} else {
			return breakLine(input, column, column, 0);
		}
	}

	private String breakLine(String input, int position, int column, int gap) {
		return (input.substring(0, position) + "\n" + wrap(input.substring(position + gap), column));
	}

}
