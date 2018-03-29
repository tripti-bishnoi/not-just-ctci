package com.resources;

public class TreeIsThisABinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(1);
		root.left.left.right = new TreeNode(2);
		root.right = new TreeNode(6);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		System.out.println(checkBST(root));
	}

	/*
	 * do a regular in-order traversal and in each recursive call, pass maximum
	 * and minimum bounds and check whether the current node's value is within
	 * the given bounds. This approach is efficient compared to the one above.
	 */
	public static boolean checkBST(TreeNode root) {
		return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean checkBSTUtil(TreeNode root, int min, int max) {
		if (root == null)
			return true;
		if (root.data < min || root.data > max)
			return false;

		return checkBSTUtil(root.left, min, root.data) && checkBSTUtil(root.right, root.data, max);
	}

}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}
}
