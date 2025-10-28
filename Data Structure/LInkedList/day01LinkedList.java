class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class day01LinkedList {

    Node head;
    Node tail;

    public day01LinkedList() {
        head = tail = null;
    }

    void addFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    void popFront() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        Node temp = head;
        head = head.next;
        if (head == null) tail = null;
        temp = null;
    }

    void popBack() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    void insert(int val, int pos) {
        if (pos < 0) {
            System.out.println("Invalid Position!");
            return;
        }
        if (pos == 0) {
            addFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid Position!");
                return;
            }
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    int search(int val) {
        Node temp = head;
        int pos = 0;
        while (temp != null) {
            if (temp.val == val) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    void reverse() {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }


    int middle(){

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {
        day01LinkedList l1 = new day01LinkedList();
        day01LinkedList l2 = new day01LinkedList();
        // l1.addFirst(0);
        // l1.addFirst(1);
        // l1.addFirst(2);
        // l1.addFirst(3);

        // l1.insert(-1, 2);
        // int rs = l1.search(3);
        // System.out.println("3 at position " + rs);

        // l1.display();
        // l1.reverse();
        // l1.display();

        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);

        l1.display();

        int midd = l1.middle();
        System.out.println(midd);

        l2.addLast(1);
        l2.addLast(2);
        l2.addLast(3);
        l2.addLast(4);
        l2.addLast(5);
        l2.addLast(6);

        l2.display();

        int midd2 = l2.middle();
        System.out.println(midd2);
    }
}
