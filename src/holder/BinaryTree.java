package holder;

public class BinaryTree {
	Node root;
	static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
			left = null;
			right = null;
		}
	}
	

	public void add(int value) {
		root = addRecursive(root, value);
	}
	public void add(Node current, int valueOfNewNode) {
		root = addRecursive(current, valueOfNewNode);
	}

	private Node addRecursive(Node current, int valueOfNewNode) {
		if(current == null) {
			return new Node(valueOfNewNode);
		}
		
		if(valueOfNewNode < current.val) {
			current.left = addRecursive(current.left,valueOfNewNode);
		}
		else if(valueOfNewNode > current.val) {
			current.right = addRecursive(current.right, valueOfNewNode);
		}
		else {
			return current;
		}
		return current;
	}
	
	
	
}
