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
        if (head.getNextSibling() == null) {
            head = null;
            tail = null;
            return;
        }

        // Иначе просто удаляем первый элемент, сдвигая head на следующий элемент
        head = head.getNextSibling();
    }

    public void removeLast() {
        // Если список пуст, нет ничего, что нужно удалить
        if (head == null) {
            return;
        }

        // Если в списке только один элемент, очищаем список
        if (head.getNextSibling() == null) {
            head = null;

            tail = null;
            return;
        }

        // Иначе находим предпоследний элемент и обновляем его ссылку next
        Node current = head;
        while (current.getNextSibling().getNextSibling() != null) {
            current = current.getNextSibling();
        }
        // Теперь current указывает на предпоследний элемент
        current.setTextContent(null);
        tail = current; // Обновляем tail
    }


}

