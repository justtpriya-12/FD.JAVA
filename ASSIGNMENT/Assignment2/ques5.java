//Q5.Merge two sorted Linked List using Iteration
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class ques5 {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0), tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1; l1 = l1.next;
            } else {
                tail.next = l2; l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node l1 = null, l2 = null;

        System.out.print("Enter size of List 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n1; i++) l1 = insert(l1, sc.nextInt());

        System.out.print("Enter size of List 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n2; i++) l2 = insert(l2, sc.nextInt());

        Node merged = merge(l1, l2);
        System.out.println("Merged List:");
        print(merged);
        sc.close();
    }
}
