package holder;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	static void print(ListNode node) {
		while (node != null) {
			System.out.println(node.val + " ");
			node = node.next;
		}
	}

	static void addListNode(int[] list, ListNode head) {
//		ListNode curr = new ListNode(0);
//		head = head.next;
		for (int i = 0; i < list.length; i++) {
//			 curr = curr.next;
			head.next = new ListNode(list[i]);
			head = head.next;
		}
		
	}

}
