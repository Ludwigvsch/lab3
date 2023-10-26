import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();
        list.prepend(10);
        list.prepend(20);
        assertEquals(2, list.length());
        assertEquals(20, list.first());
        assertEquals(10, list.last());
    }

    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        assertEquals(2, list.length());
        assertEquals(10, list.first());
        assertEquals(20, list.last());
    }

    @Test
    public void testFirstLast() {
        LinkedList list = new LinkedList();
        assertThrows(NoSuchElementException.class, list::first);
        assertThrows(NoSuchElementException.class, list::last);
        list.append(30);
        assertEquals(30, list.first());
        assertEquals(30, list.last());
    }

    @Test
    public void testToString() {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        assertEquals("10 20 ", list.toString());
    }

    @Test
    public void testLength() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.length());
        list.append(10);
        assertEquals(1, list.length());
    }
}
