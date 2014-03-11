package kata_wordwrap;

import static org.junit.Assert.*;

import org.junit.Test;

public class WrapperTest {

	@Test
	public void emptyString() {
		Wrapper wrapper = new Wrapper();
		String result = wrapper.wrap("", 1);
		assertEquals("", result);
	}
	
	@Test
	public void inputShorterThanColumn() throws Exception {
		Wrapper wrapper = new Wrapper();
		String result = wrapper.wrap("somkiat", 10);
		assertEquals("somkiat", result);
	}
	
	@Test
	public void wrapTwoWordAfterSpace() throws Exception {
		Wrapper wrapper = new Wrapper();
		String result = wrapper.wrap("word word", 6);
		assertEquals("word\nword", result);
	}

}
