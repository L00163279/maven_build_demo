package sample_program;

import static org.junit.Assert.*;
import org.junit.Test;
public class HelloWorldTest {
	@Test
	public void testGreetingMessage() {
		assertEquals("Hello MrJohn! Welcome to Java Programming", HelloWorld.getGreetingMessage("John"));
	}
}