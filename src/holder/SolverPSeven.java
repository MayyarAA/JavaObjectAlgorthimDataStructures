package holder;

public class SolverPSeven {

	public static void main(String[] args) {

		int[] treeArr = { 4, 2, 7, 1, 3 };
		TreeNode root = new TreeNode(4);
//		for(int i=0;i<treeArr.length;i++) {
//			if(i%2 ==0) {

		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

//			}
//		}
//				BTreePrinter.printNode(root);
		long startTime = System.nanoTime();
		TreeNode holder = addBST(root, 5);
		long endTime = System.nanoTime();
		System.out.println("holder ran in" + (endTime - startTime));

		startTime = System.nanoTime();
		TreeNode holder2 = searchBTS(root, 2);
		endTime = System.nanoTime();

		System.out.println("holder2 ran in" + (endTime - startTime));
		
		
		TreeNode root2 = new TreeNode(2);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(3);
		
		System.out.println(isValidBST(root2));
	}

	public static boolean isValidBST(TreeNode root) {
		boolean isValidBST = false;

		TreeNode currNode = root;

		while (currNode != null) {
			if(currNode.left != null) {
				
				if (currNode.left.val < currNode.val && currNode.right.val > currNode.val) {
					currNode = currNode.left;
				} else {
					return isValidBST;
				}
			}


		}

		while (currNode != null) {
			if(currNode.right!=null) {
				
				if (currNode.left.val < currNode.val && currNode.right.val > currNode.val) {
					currNode = currNode.right;
				} else {
					return isValidBST;
				}
			}


		}
		isValidBST = true;
		return isValidBST;
	}

	public static TreeNode addBST(TreeNode root, int val) {

		if (root == null)
			return root = new TreeNode(val);

		TreeNode currNode = root;

		while (true) {
			if (currNode.val <= val) {
				if (currNode.right != null) {

					currNode = currNode.right;
				} else {
					currNode.right = new TreeNode(val);
					break;
				}
			} else {
				if (currNode.left != null) {
					currNode = currNode.left;

				} else {
					currNode.left = new TreeNode(val);
					break;
				}
			}
		}

		return root;
	}

	public static TreeNode searchBTSV2(TreeNode root, int val) {
		if (root == null)
			return null;
		if (root.val == val)
			return root;

		if (root.val > val) {
			return searchBTSV2(root.left, val);
		} else {
			return searchBTSV2(root.right, val);
		}

	}

	public static TreeNode searchBTS(TreeNode root, int val) {
		int currVal = 0;
		currVal = root.val;
		TreeNode currNode = new TreeNode();
		currNode = root;
		while (currVal != val) {
			if (currVal < currNode.val || root.val > val) {
				currNode = currNode.left;
				currVal = currNode.val;
			} else if (currNode.left == null & currNode.right == null) {
				return null;
			} else {
				currNode = currNode.right;
				currVal = currNode.val;
			}

		}

		return currNode;

	}

}
