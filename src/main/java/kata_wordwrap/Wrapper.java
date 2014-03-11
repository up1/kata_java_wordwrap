package kata_wordwrap;

public class Wrapper {

	public String wrap(String input, int column) {
		if(input.length() <= column)
			return input;
		return input.replace(" ", "\n");
	}

}
