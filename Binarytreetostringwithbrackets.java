package com.resources;

public class Binarytreetostringwithbrackets {

	public static void main(String[] args) {
		Node l2 = new Node(null, null, "left");
		Node r2 = new Node(null, null, "right");
		Node l1 = new Node(null, null, "left");
		Node r1 = new Node(l2, r2, "right");
		Node root = new Node(l1, r1, "root");
		System.out.println(convertTree(root));
	}

	public static String convertTree(Node root) {

		if (root == null)
			return "";
		String output = root.val;
		if (root.left != null)
			output += "(" + convertTree(root.left) + ")";
		if (root.right != null)
			output += "(" + convertTree(root.right) + ")";
		return output;
	}
}

class Node {
	Node left;
	Node right;

	String val;

	public Node(Node left, Node right, String val) {
		this.left = left;
		this.right = right;
		this.val = val;
	}
}
