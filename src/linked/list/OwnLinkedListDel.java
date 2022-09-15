package linked.list;

public class OwnLinkedListDel {
	public static void main(String[] args) throws Exception {
		
		//insert
		// 1 4 9 22 14 16
		
		OwnLinkedListDelImp ownLinkedListDelImp = new OwnLinkedListDelImp();
		Node root = null;	

//		 2->5->9->1->null
		root = ownLinkedListDelImp.insertEnd(root, 2);
		root = ownLinkedListDelImp.insertEnd(root, 5);
		root = ownLinkedListDelImp.insertEnd(root, 9);
		root = ownLinkedListDelImp.insertEnd(root, 1);
		
		ownLinkedListDelImp.displayLinkedList(root); // 2 5 9 1 
		
		root = ownLinkedListDelImp.removeNode(root, 4);
//		root = ownLinkedListDelImp.removeNode(root, 2);
//		root = ownLinkedListDelImp.removeNode(root, 1);
//		root = ownLinkedListDelImp.removeNode(root, 0);
		ownLinkedListDelImp.displayLinkedList(root);
	}
}

// Inheritence - 
class OwnLinkedListDelImp extends OwnLinkedListImp{
	
	// given index and we have to remove that node
 	Node removeNode(Node root, int index) throws Exception {
		if(root == null && index > -1) {
			throw new Exception("index is out of bond");
		}
		if(index == 0) { // for stating node
			root = root.next; // 5 9 1 
		} else { // for position and last node
			Node temp = root;
			for(int i = 0; i < index - 1; i++) {
				if (temp.next == null) {
					throw new Exception(index + " position is out of bound");
				}
				temp = temp.next;
			}
			if(temp.next == null) {
				throw new Exception(index + " position is out of bound");
			}
			temp.next = temp.next.next;
		}
		return root;
	}
}



