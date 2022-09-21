package linked.list;

public class OwnLinkedListDel {
	public static void main(String[] args) throws Exception {

		// logic behind remove root suppose hme 9 remove krna h to hm 1 se 4 pe jaege then 4 se hm sida 22 pe jaege then
// 22 se 14 then 4 se 16 ( 1 4 22 14 16 )
//		hm to remove krna h uski link hta dege or baki sbi roots ko jod dege
		
//		4 se sida hme 22 pr jana h
		
		// insert
		// 1 4 9 22 14 16

		OwnLinkedListDelImp ownLinkedListDelImp = new OwnLinkedListDelImp();
		Node root = null;

//		 2->5->9->1->null
		root = ownLinkedListDelImp.insertEnd(root, 2);
		root = ownLinkedListDelImp.insertEnd(root, 5);
		root = ownLinkedListDelImp.insertEnd(root, 9);
		root = ownLinkedListDelImp.insertEnd(root, 1);

		ownLinkedListDelImp.displayLinkedList(root); // 2 5 9 1

//		root = ownLinkedListDelImp.removeNode(root, 4);
//		root = ownLinkedListDelImp.removeNode(root, 2);
//		root = ownLinkedListDelImp.removeNode(root, 1);
//		root = ownLinkedListDelImp.removeNode(root, 0);

		root = ownLinkedListDelImp.removeNodeByVal(root, 9);  // use for remove val
		ownLinkedListDelImp.displayLinkedList(root);
	}
}

// Inheritence - 
class OwnLinkedListDelImp extends OwnLinkedListImp {

	// given index and we have to remove that node
	Node removeNode(Node root, int index) throws Exception {
		if (root == null && index > -1) {
			throw new Exception("index is out of bond");
		}
		if (index == 0) { // for stating node
			root = root.next; // 5 9 1
		} else { // for position and last node
			Node temp = root;
			for (int i = 0; i < index - 1; i++) {
				if (temp.next == null) {
					throw new Exception(index + " position is out of bound");
				}
				temp = temp.next;
			}
			if (temp.next == null) {
				throw new Exception(index + " position is out of bound");
			}
			temp.next = temp.next.next;
		}
		return root;
	}

	/////////////////// remove by val /////////////////// //////////////////////////////////////////

	
//	https://leetcode.com/problems/remove-linked-list-elements/  		this is a question of remove node by val
	
	
	Node removeNodeByVal(Node root, int val) {
// APPROACH 
		if (root == null) { 			//  1 is root  AND root equal nhi h null k to hm line 70 pe jaege
			return root;
		}
        Node temp = root;				// 	1 is temp / root both  
        while (temp != null && temp.next != null ) {	// this condition is true so our code go to line 72
            if(temp.next.val == val) { 	// temp is 1 -> then temp.next.val it is 2 
            //if first node == val e.g [1,2,6,3,4,5,6] and val=6
            temp.next = temp.next.next;							// 2 is temp.next then 3 is temp.next.next
            } else{
             temp = temp.next;		// this condition work only when line 71 is false means galt ho
            }
        }
        if(root != null && root.val == val ) {		
            return root.next;
        }
			
		return root;
	} 	
}
