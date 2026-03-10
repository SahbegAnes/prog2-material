package algods.lecture.vl_2026_03_10.Lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ElementTest {
    @Test
    public void testList_new() {
        Element anchor = new Element();

        assertEquals(0, anchor.data);
        assertEquals(anchor, anchor.next);
        assertEquals(anchor, anchor.prev);
    }

    @Test
    public void testList_add() {
        Element anchor = new Element();

        anchor.add(42);

        assertNotEquals(anchor, anchor.next);
        assertNotEquals(anchor, anchor.prev);
        assertEquals(0, anchor.data);
        assertEquals(42, anchor.next.data);
        assertEquals(anchor, anchor.next.next);
        assertEquals(anchor, anchor.prev.prev);
    }
}
