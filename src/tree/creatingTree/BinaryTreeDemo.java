package tree.creatingTree;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeDemo {
    static Scanner sc = new Scanner(System.in);

    public static Node buildTree() {
        int x = sc.nextInt();

        if (x == -1) return null;

        Node temp = new Node(x);

        System.out.print("Enter the left child of: " + x + " ");
        temp.left = buildTree();

        System.out.print("Enter the right child of: " + x + " ");
        temp.right = buildTree();

        return temp;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        System.out.print("Enter root value: ");
        Node root = buildTree();

        System.out.println("\nInorder Traversal of Tree:");
        inorder(root);
    }
}

