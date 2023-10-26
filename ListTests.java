import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {

    @Test
    public void testFilter() {
        ListExamples examples = new ListExamples();
        List<String> inputList = Arrays.asList("apple", "banana", "cherry");
        StringChecker checker = new StringChecker() {
            public boolean checkString(String s) {
                return s.length() > 5;
            }
        };
        
        List<String> expectedOutput = Arrays.asList("banana", "cherry");
        List<String> actualOutput = examples.filter(inputList, checker);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMerge() {
        ListExamples examples = new ListExamples();
        List<String> list1 = Arrays.asList("a", "c", "e");
        List<String> list2 = Arrays.asList("b", "d", "f");

        List<String> expectedOutput = Arrays.asList("a", "b", "c", "d", "e", "f");
        List<String> actualOutput = examples.merge(list1, list2);
        assertEquals(expectedOutput, actualOutput);
    }
}