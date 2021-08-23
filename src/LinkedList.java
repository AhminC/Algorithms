public class LinkedList {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
}

