//Q7.Consider a Linked List with head given, reverse nodes in group of k.
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ques7 {
    // Reverse k nodes
    public static Node reverseKGroup(Node head, int k) {
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        // Check if there are at least k nodes
        Node temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) return head;
            temp = temp.next;
        }

        // Reverse first k nodes
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Recursively reverse remaining list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }

    // Print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Input node values
        System.out.println("Enter node values:");
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Input group size k
        System.out.print("Enter group size k: ");
        int k = sc.nextInt();

        System.out.println("Original list:");
        printList(head);

        head = reverseKGroup(head, k);

        System.out.println("Reversed list in groups of " + k + ":");
        printList(head);
    }
} 
