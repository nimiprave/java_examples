package java_examples;

public class SingleLinkedList{

	private SLL header; // header
	private SLLNode current; // current Node
	public int length;         // length of the linked list
	private SLLNode allNodes[] ;
	
	public SingleLinkedList() {
		header = new SLL();
		length = 0;
	}

	public void addNode(SLLNode sl) {

		if (header.getFirst() == null) {
			header.setFirst(sl);
			current = sl;
			length++;
		}else{
			length++;
			current.succ = sl;
			current = sl;
		}
		
	}

	public void parseList() {

		if (header.getFirst() != null) {
			System.out.println("Header: " + header.toString());
			SLLNode sCurrent = header.getFirst();
			while (sCurrent != null) {
				System.out.println("Node: " + sCurrent.element.toString());
				sCurrent = sCurrent.succ;
			}
		}
	}
	
	public void removeNode(SLLNode sl) throws SLLException{
		if (header.getFirst() != null) {
		   SLLNode sCurrent = header.getFirst();
			while (sCurrent != sl) {
				
				System.out.println("Node: " + sCurrent.element.toString());
				sCurrent = sCurrent.succ;
			}
		}else{
			throw new SLLException("No Nodes exist to remove");
			
		}	
	}
	

	

//	public SLLNode getNode(SSLNode find){
//		//return found;
//	}
	


}
