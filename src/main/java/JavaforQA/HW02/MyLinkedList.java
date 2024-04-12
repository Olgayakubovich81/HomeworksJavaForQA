package JavaforQA.HW02;

import org.w3c.dom.Node;

public class MyLinkedList {

    Node head;
    Node tail;

    public void removeFirst() {
        // Если список пуст, нет ничего, что нужно удалить
        if (head == null) {
            return;
        }

        // Если в списке только один элемент, очищаем список
        if (head.getNext() == null) {
            head = null;
            tail = null;
            return;
        }

        // Иначе просто удаляем первый элемент, сдвигая head на следующий элемент
        head = head.getNext();
    }

    public void removeLast() {
        // Если список пуст, нет ничего, что нужно удалить
        if (head == null) {
            return;
        }

        // Если в списке только один элемент, очищаем список
        if (head.getNext() == null) {
            head = null;
            tail = null;
            return;
        }

        // Иначе находим предпоследний элемент и обновляем его ссылку next
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        // Теперь current указывает на предпоследний элемент
        current.setNext(null);
        tail = current; // Обновляем tail
    }


}

