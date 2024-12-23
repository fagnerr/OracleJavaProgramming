package br.dev.fagner;

public class NodeDriver {
	  public static void main(String[] args) {

	    // Testing tree traversals-----------------------------------------------------------------------------------------
	    Node root = new Node(1);
	    Node node2 = new Node(2);
	    Node node3 = new Node(3);
	    Node node4 = new Node(4);
	    Node node5 = new Node(5);
	    Node node6 = new Node(6);
	    Node node7 = new Node(7);

	    root.setLeft(node2);
	    node2.setLeft(node4);
	    node2.setRight(node5);
	    node5.setLeft(node7);
	    root.setRight(node3);
	    node3.setRight(node6);
	    root.printInorder(root);
	    System.out.println();
	    root.printPostorder(root);
	    System.out.println();
	    root.printPreorder(root);

	    System.out.println();
	    root.print();
	    // ----------------------------------------------------------------------------------------------------------------
	  }

	}