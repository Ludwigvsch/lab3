import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


//The two tests we wrote for you in ArrayTests.java pass, but the two implementations of reverse methods in ArrayExamples.java have bugs! Write more tests in ArrayTests.java to demonstrate that the two methods, reverseInPlace and reversed, have bugs, and identify the bugs.

// Test for reverseinplace
@Test
public void testReversedInPlace1() {
  int[] input1 = { 3, 4, 5 };
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{ 5, 4, 3 }, input1); 
}

@Test
public void testReversed1() {
  int[] input1 = { 3, 4, 5 };
  assertArrayEquals(new int[]{ 5, 4, 3 }, ArrayExamples.reversed(input1));
}
}