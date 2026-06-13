package tree.creatingTree;


import java.util.Scanner;

public class BinaryTreeDemo2 {

    public static Node BuildTree(){
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        if(x == -1) return null;

        Node root = new Node(x);

        System.out.println(
                "Enter the left  child of: " + x
        );

        root.left = BuildTree();

        System.out.println(
                "Enter the right child of: " + x
        );

        root.right = BuildTree();
        return root;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        //int x = sc.nextInt();
        Node root = BuildTree();

    }
}
