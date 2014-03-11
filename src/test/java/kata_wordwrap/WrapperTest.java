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

}
