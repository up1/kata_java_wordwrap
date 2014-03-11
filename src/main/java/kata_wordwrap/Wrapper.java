package kata_wordwrap;

public class Wrapper {

	public String wrap(String input, int column) {
		if(input.length() <= column) {
			return input;
		} else {
			return (input.substring(0, column) + "\n" + wrap(input.substring(column), column));
		}
	}

}
