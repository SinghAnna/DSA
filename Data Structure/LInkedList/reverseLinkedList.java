class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Corrected Name: display()
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    void reverse() {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseRecursive(head.next);
        
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}

public class reverseLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);

        l1.display(); // should print: 1 -> 2 -> 3 -> 4 -> NULL

        l1.reverse();
        l1.display(); // should print: 4 -> 3 -> 2 -> 1 -> NULL

        // Update head after recursive reverse
        l1.head = l1.reverseRecursive(l1.head);
        l1.display(); // should print: 1 -> 2 -> 3 -> 4 -> NULL
    }
}
