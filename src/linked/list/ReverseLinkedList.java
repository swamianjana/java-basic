package linked.list;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
	Node root = null;
	// 1 -> 2 -> 3-> null
	
	// create linked list
	OwnLinkedListImp linkedList = new OwnLinkedListImp();
	root  =linkedList.insertEnd(root, 1);
	root  =linkedList.insertEnd(root, 2);
	root  =linkedList.insertEnd(root, 3);
	linkedList.displayLinkedList(root);
	
	// reverse linked list
	System.out.println("Reverse linked List");
//	root = reverseLinkListUsingExtraMemory(root);
	
	root = reverseLinkedListUsingWhileLoop(root);
	linkedList.displayLinkedList(root);
	}
	
	static Node reverseLinkedListUsingWhileLoop(Node root) {
		if(root == null || root.next == null) {
			return root;
		}
		Node prev = root;
		Node curr = root.next;
		prev.next = null;
		
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	static Node reverseLinkListUsingExtraMemory(Node root) {
		Node temp = root;
		Node newRoot = null;
		OwnLinkedListImp linkedList = new OwnLinkedListImp();
		while(temp !=  null)  {
			newRoot = linkedList.insertStart(newRoot, temp.val);
			temp = temp.next;
		}
		return newRoot;	
	}
}
