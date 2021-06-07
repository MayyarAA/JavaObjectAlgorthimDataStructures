package holder;

import java.util.*;

//class TreeNode{
//    TreeNode left,right;
//    int data;
//    TreeNode(int data){
//        this.data=data;
//        left=right=null;
//    }
//   
//    }

public class SolverPg {

	public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int T=sc.nextInt();
//         TreeNode root=null;
//         while(T-->0){
//             int data=sc.nextInt();
//             root=insert(root,data);
//         }
//         int height=getHeight(root);
//         System.out.println(height);

		TreeNode TreeNode = new TreeNode(6);
		TreeNode.left = new TreeNode(5);
		TreeNode.left.left = new TreeNode(2);
		TreeNode.left.left = new TreeNode(3);
		TreeNode.right = new TreeNode(10);
		TreeNode.right.left = new TreeNode(8);
		TreeNode.right.left.left = new TreeNode(7);
		TreeNode.right.left.right = new TreeNode(9);

//		System.out.println(getHeight(TreeNode));
//		System.out.println(getHeightV2(TreeNode));
		System.out.println(searchBSTV3(TreeNode, 3).val);
	}
	
	

	public int sumValuesBST(TreeNode root, int low, int high, int sum) {

		if (root == null)
			return sum;
		if (root.val >= low && root.val <= high) {
			sum += root.val;
		}
		int leftSum = sum;
		if (root.val >= low) {
			leftSum = sumValuesBST(root.left, low, high, sum);
		}
		int rightSum = leftSum;
		if (root.val <= high) {
			rightSum = sumValuesBST(root.right, low, high, leftSum);
		}

		return rightSum;
	}

	public static TreeNode searchBSTV3(TreeNode root, int val) {

		if (root == null) {
			return null;
		}
		if (root.val == val) {
			return root;
		}

		if (root.val < val) {
			return searchBSTV3(root.right, val);

		}

		else {
			return searchBSTV3(root.left, val);
		}

	}

	public static TreeNode searchBST(TreeNode root, int val) {

		if (root == null)
			return null;
		if (root.val == val)
			return root;

		if (root.val > val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}

	}

	public static int getHeightV2(TreeNode root) {
		int treeHeight = 0;
		if (root == null)
			return 0;

		treeHeight = counterBST(root, treeHeight);

		return treeHeight;
	}

	public static int counterBST(TreeNode root, int val) {
		if (root == null)
			return val;

		val += 1;
		int leftTreeCounter = counterBST(root.left, val);
		int rightTreeCounter = counterBST(root.right, val);
		val = Math.max(leftTreeCounter, rightTreeCounter);

		return val;
	}

	public static int getHeight(TreeNode root) {
		int treeHeight = 0;
		TreeNode currTreeNode = root;
		TreeNode temp = new TreeNode(0);
		temp = root;
		int counter = 1;

//	      while(true){
		if (currTreeNode.left != null) {
			temp = currTreeNode.left;
			counter++;
			counter = getHeightHelper(temp, counter);
			treeHeight = Math.max(treeHeight, counter);
		}

		if (currTreeNode.right != null) {
			counter = 1;
			temp = currTreeNode.right;
			counter++;
			counter = getHeightHelper(temp, counter);
			treeHeight = Math.max(treeHeight, counter);
		}

//	      }

		return treeHeight;
	}

	public static int getHeightHelper(TreeNode curr, int counter) {
		TreeNode temp = new TreeNode(0);
		if (curr.left != null) {
			temp = curr.left;
			counter++;
			getHeightHelper(temp, counter);
		}
		if (curr.right != null) {
			temp = curr.right;
			counter++;
			getHeightHelper(temp, counter);
		}
		return counter;
	}

//	    public static TreeNode insert(TreeNode root,int data){
//	        if(root==null){
//	            return new TreeNode(data);
//	        }
//	        else{
//	            TreeNode cur;
//	            if(data<=root.data){
//	                cur=insert(root.left,data);
//	                root.left=cur;
//	            }
//	            else{
//	                cur=insert(root.right,data);
//	                root.right=cur;
//	            }
//	            return root;
//	        }
//	    }
//	

}
