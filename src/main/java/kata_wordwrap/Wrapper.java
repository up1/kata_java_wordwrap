package kata_wordwrap;

public class Wrapper {

	public String wrap(String input, int column) {
		if(input.length() <= column) {
			return input;
		} else {
			StringBuilder output = new StringBuilder();
			String[] inputArray = input.split(" ");
			int countColumn = 0;
			for (String string : inputArray) {
				countColumn += string.length();
				if(countColumn< column) {
					output.append(string).append(" ");
				} else {
					output.append(string+"\n");
				}
			}
			return output.toString();
		}
		//return input.replace(" ", "\n");
	}

}
