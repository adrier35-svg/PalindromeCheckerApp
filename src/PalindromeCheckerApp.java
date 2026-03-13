import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    static Node head = null;

    // Insert node
    static void insert(char c) {
        Node newNode = new Node(c);

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

    // Reverse linked list
    static Node reverse(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Check palindrome
    static boolean isPalindrome() {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);
        Node firstHalf = head;

        // Compare halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            insert(str.charAt(i));
        }

        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}