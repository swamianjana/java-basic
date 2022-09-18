package linked.list;

class Node {
	int val;
	Node next;

	// by default
	// by defalut access modifier is protected (access within package)
//	 Node(){
//		this.val = 0;
//		this.next = null;
//	}

	// it create new node with insert given value
	Node(int value) {
		this.val = value;
		this.next = null;
	}

}

public class OwnLinkedList {
	public static void main(String[] args) throws Exception {

		// insert
		// 1 4 9 22 14 16

		OwnLinkedListImp ownLinkedListImp = new OwnLinkedListImp();
		Node root = null;

		// for last
//		root = ownLinkedList.insertEnd(root, 1);
////		System.out.println(root.val);
//		root = ownLinkedList.insertEnd(root, 4);
////		System.out.println(root.val);
////		ownLinkedList.displayLinkedList(root);
//		
//		root = ownLinkedList.insertEnd(root, 9);
//		root = ownLinkedList.insertEnd(root, 22);
//		root = ownLinkedList.insertEnd(root, 14);
//		root = ownLinkedList.insertEnd(root, 16);

		// for insert at the beginning
//		root = ownLinkedList.insertStart(root, 1);
//		root = ownLinkedList.insertStart(root, 4);
//		root = ownLinkedList.insertStart(root, 9);

		// for insert at the position

		root = ownLinkedListImp.insertPosition(root, 1, 0);
		root = ownLinkedListImp.insertPosition(root, 4, 1);
		root = ownLinkedListImp.insertPosition(root, 9, 2);
		ownLinkedListImp.displayLinkedList(root);
		root = ownLinkedListImp.insertPosition(root, 3, 1);
//		root = ownLinkedList.insertPosition(root, 15, 10);  
		root = ownLinkedListImp.insertPosition(root, 15, 4);

		ownLinkedListImp.displayLinkedList(root);
		// insert at the end
		// insert in static way
//		Node root = new Node(1); // new node create
//		System.out.println(root.val);
//		
//		Node newNode = new Node(4);
//		
//		root.next = newNode;
//		
//		System.out.println(root.next.val);
//		newNode = new Node(9);
//		
//		root.next.next = newNode;

	}
}

class OwnLinkedListImp {

	// insert at the end
	public Node insertEnd(Node root, int val) {
		Node newNode = new Node(val); // create new node
		if (root == null) {
			return newNode;
		}
		// check end Node of the linked list

		/**
		 * issue with blew code is that our root node is lost. Means root node became
		 * our last node but root node should be our starting node.
		 * 
		 * while(root.next != null) { root = root.next; }
		 */

		// sol^
		Node temp = root;

		while (temp.next != null) {
			temp = temp.next; // once step ahead node
		}
		temp.next = newNode; // node linked
		return root;
	}

	// insert new node at the beginning
	public Node insertStart(Node root, int val) {
		Node newNode = new Node(val); // create new node
		if (root == null) {
			return newNode;
		}

		newNode.next = root; // put newNode.next = root
		root = newNode; // change root pointer to new node
		return root;
	}

	// insert new node at the position
	public Node insertPosition(Node root, int val, int pos) throws Exception {
		if (pos == 0) {
			return insertStart(root, val);
		}
		Node temp = root;
		for (int i = 0; i < pos - 1; i++) {
			if (temp.next == null) {
				throw new Exception(pos + " position is out of bound");
			}
			temp = temp.next;
		}
		Node newNode = new Node(val);
		// for last node
		if (temp.next == null) {
			temp.next = newNode;
		} else {
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return root;
	}

	// read
	public void displayLinkedList(Node root) {
		Node temp = root;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next; // once step ahead

		}
		System.out.println();
	}

}
