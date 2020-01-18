package java_examples;

public class SLLConstruction {

/*	public static void main(String[] args) {

		// TODO Auto-generated method stub
		SLLNode second = new SLLNode("SecondNode", null);
		SLLNode first = new SLLNode("firstNode", null);
		SLLNode third = new SLLNode("ThirdNode", null);
		SLLNode fourth = new SLLNode("FourthNode", null);

		first.succ = second;
		second.succ = third;
		third.succ = fourth;
		SLL header = new SLL(first);
		parseList(header);
	}

	public static void parseList(SLL header) {

		if (header.getFirst() != null) {
			System.out.println("Header: " + header.toString());
			SLLNode current = header.getFirst();
			while (current != null) {
				System.out.println("Node: " + current.element.toString());
				current = current.succ;

			}
		}

	}
	*/
	
	public static void main(String[] args){
		
//		SingleLinkedList myList = new SingleLinkedList();
//	    myList.addNode(new SLLNode("FirstNode",null));
//	    myList.addNode(new SLLNode("SecondNode",null));
//	    myList.addNode(new SLLNode("ThirdNode",null));
//	    myList.addNode(new SLLNode("FourthNode",null));
//	    myList.addNode(new SLLNode("FifthNode",null));
//	    myList.parseList();		
//	    System.out.println("Length of the List: " + myList.length);
		try {
			SingleLinkedList myList = new SingleLinkedList();
			myList.removeNode(new SLLNode("Something", null));	
			
		} catch (Exception e) {
			 System.out.print(e.getMessage());
		}
		
	}

}
