package java_examples;

public class SLL {
    
	// each SLL object is an SLL header,
	// This SSL is referenced by a reference to its fist node
	
	private SLLNode first;
	public SLL(){
		this.first = null;
	}
	public SLLNode getFirst(){
		return first;
	}
	public void setFirst(SLLNode sl){
		first = sl;
	}
}
