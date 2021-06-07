package holder;

import java.util.*;

public class SolverPEight {

	public static void main(String[] args) {
		char two = '2';

//		String[] strArr = { "foo", "bar", "baz", "foobar", "emo", "cap", "car", "cat" };
//		translateNumber("3662277", strArr);
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		System.out.println(maxDepth(root));
	}
	
	
	
	public static int maxDepth(TreeNode root) {
		int maxDepth = Integer.MIN_VALUE;
		if(root == null) return 0;
		
		int left_depth = maxDepth(root.left);
		int right_depth = maxDepth(root.right);
		
		
		return Math.max(left_depth, right_depth) + 1;
	}
	

	public static TreeNode inputTreeNode(TreeNode root , int val) {

		if(root == null) return root = new TreeNode(val);
		TreeNode currNode = root;
		
		while(true) {
			if(currNode.val <= val ) {
				if(currNode.right !=null ) {
					currNode = currNode.right;
				}else {
					 currNode.right = new TreeNode(val);
					 break;
				}
			}else {
				if(currNode.left !=null) {
					currNode = currNode.left;
				}else {
					currNode.left = new TreeNode(val);
					break;
				}
			}
			
		}
		

		
		
		return currNode;		
	}

	public static void translateNumber(String number, String[] wordArr) {
		char[] numberCharArr = number.toCharArray();
//		 char[] characterForNumberArr = new char[4];
//		 HashSet<Character> characterForNumberMap = new HashSet();
		HashMap<Character, Integer> characterForNumberMap = new HashMap<>();
		for (int i = 0; i < numberCharArr.length; i++) {
			int firstInt = Character.getNumericValue(numberCharArr[i]);
			characterForNumberMap = getCharacterForNumber(firstInt);
			for (int j = 0; j < wordArr.length; j++) {
				ArrayList<Character> charList = new ArrayList<>();
				for (int k = 0; k < wordArr[j].length(); k++) {
					charList.add(wordArr[j].charAt(k));
				}
				for (int h = 0; h < charList.size(); h++) {

					if (characterForNumberMap.containsKey(charList.get(h)) && h == charList.indexOf(charList.get(h))) {
						System.out.println(wordArr[j].charAt(h));
						int counter = 1;
						int counterForChar = 1;
						while (counterForChar < charList.size()) {

							characterForNumberMap = getCharacterForNumber(
									Character.getNumericValue(numberCharArr[counter]));
							if (characterForNumberMap.containsKey(charList.get(counterForChar))
									&& counterForChar == charList.indexOf(charList.get(counterForChar))) {
								System.out.println(wordArr[j].charAt(counterForChar));
							}
							counter++;
							counterForChar++;
						}
//						
					}
				}
//				System.out.println(charList.toString());

			}
		}

	}

	private static HashMap<Character, Integer> getCharacterForNumber(int num) {
		char[] charArrValue = new char[4];
//		HashSet<Character> charMap = new HashSet();
		HashMap<Character, Integer> charMap = new HashMap<>();
		if (num == 2) {
			charArrValue[0] = 'a';
			charArrValue[1] = 'b';
			charArrValue[2] = 'c';
		} else if (num == 3) {
			charArrValue[0] = 'd';
			charArrValue[1] = 'e';
			charArrValue[2] = 'f';
		} else if (num == 4) {
			charArrValue[0] = 'g';
			charArrValue[1] = 'h';
			charArrValue[2] = 'i';
		} else if (num == 5) {
			charArrValue[0] = 'j';
			charArrValue[1] = 'k';
			charArrValue[2] = 'l';
		} else if (num == 6) {
			charArrValue[0] = 'm';
			charArrValue[1] = 'n';
			charArrValue[2] = 'o';
		} else if (num == 7) {
			charArrValue[0] = 'p';
			charArrValue[1] = 'q';
			charArrValue[2] = 'r';
			charArrValue[3] = 's';
		} else if (num == 8) {
			charArrValue[0] = 't';
			charArrValue[1] = 'u';
			charArrValue[2] = 'v';
		} else if (num == 9) {
			charArrValue[0] = 'w';
			charArrValue[1] = 'x';
			charArrValue[2] = 'y';
			charArrValue[3] = 'z';
		}

		for (int i = 0; i < charArrValue.length; i++) {
			charMap.put(charArrValue[i], i);
		}
		return charMap;
	}

}
