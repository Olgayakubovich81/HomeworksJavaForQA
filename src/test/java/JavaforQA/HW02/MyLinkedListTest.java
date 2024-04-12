package JavaforQA.HW02;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class MyLinkedListTest {

    @Test
    public void testRemoveFirst_EmptyList() {
        MyLinkedList list = new MyLinkedList();
        list.removeFirst();
        assertNull(list.head);
        assertNull(list.tail);
    }

    @Test
    public void testRemoveLast_EmptyList() {
        MyLinkedList list = new MyLinkedList();
        list.removeLast();
        assertNull(list.head);
        assertNull(list.tail);
    }

}
