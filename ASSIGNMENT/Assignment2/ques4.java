//Q4.Remove Nth node from end in a linked List
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class ques4 {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy, second = dummy;

        for (int i = 0; i <= n; i++) {
            if (first == null) return head;
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.print("Enter number of nodes: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            head = insert(head, sc.nextInt());
        }

        System.out.print("Enter N (position from end to remove): ");
        int n = sc.nextInt();

        head = removeNthFromEnd(head, n);

        System.out.println("Updated List:");
        printList(head);

        sc.close();
    }
}