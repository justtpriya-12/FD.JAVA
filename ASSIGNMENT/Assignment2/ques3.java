//Q3.Find Intersection node of two linked list.
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class ques3 {
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node getIntersectionNode(Node headA, Node headB) {
        Node a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    static Node findNode(Node head, int value) {
        while (head != null) {
            if (head.data == value) return head;
            head = head.next;
        }
        return null;
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
        Node headA = null, headB = null;

        System.out.print("Enter number of nodes in List A: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of List A:");
        for (int i = 0; i < n1; i++) headA = insert(headA, sc.nextInt());

        System.out.print("Enter number of nodes in List B: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of List B:");
        for (int i = 0; i < n2; i++) headB = insert(headB, sc.nextInt());

        System.out.print("Enter value where lists should intersect (must exist in List A): ");
        int intersectVal = sc.nextInt();
        Node intersectNode = findNode(headA, intersectVal);

        if (intersectNode == null) {
            System.out.println("Value not found in List A. No intersection created.");
        } else {
            // Attach intersection node to end of List B
            Node temp = headB;
            while (temp.next != null) temp = temp.next;
            temp.next = intersectNode;

            Node result = getIntersectionNode(headA, headB);
            System.out.println("Intersection at node with data: " + result.data);
        }

        sc.close();
    }
}