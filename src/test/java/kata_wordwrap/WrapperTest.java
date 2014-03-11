package kata_wordwrap;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ WrapperTest.DegenerateTests.class, WrapperTest.SplitWordTests.class })
public class WrapperTest {

	public static class DegenerateTests {
		Wrapper wrapper = new Wrapper();

		@Test
		public void emptyString() {
			String result = wrapper.wrap("", 1);
			assertEquals("", result);
		}

		@Test
		public void inputShorterThanColumn() throws Exception {
			String result = wrapper.wrap("somkiat", 10);
			assertEquals("somkiat", result);
		}

	}

	public static class SplitWordTests {
		Wrapper wrapper = new Wrapper();

		@Test
		public void splitOneWord() throws Exception {
			String result = wrapper.wrap("word", 2);
			assertEquals("wo\nrd", result);
		}

		@Test
		public void splitOneWordManyTimes() throws Exception {
			String result = wrapper.wrap("abcdefghijk", 3);
			assertEquals("abc\ndef\nghi\njk", result);
		}
	}

	public static class wrapWordsTest {
		Wrapper wrapper = new Wrapper();

		@Test
		public void wrapTwoWordAfterSpace() throws Exception {
			String result = wrapper.wrap("word word", 6);
			assertEquals("word\nword", result);
		}

		@Test
		public void wrapThreeWordAfterFirstSpace() throws Exception {
			String result = wrapper.wrap("word word word", 6);
			assertEquals("word\nword\nword", result);
		}

		@Test
		public void wrapThreeWordsAfterSecondSpace() throws Exception {
			String result = wrapper.wrap("word word word", 11);
			assertEquals("word word\nword", result);
		}
	}

}
