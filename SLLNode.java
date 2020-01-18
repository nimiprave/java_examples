package java_examples;

public class SLLNode {
// each SLLNode object is an SLL Node, node consists of an element(element) and a link to its successor (succ).
	protected Object element; 
	protected SLLNode succ;
	
	protected SLLNode(Object elem, SLLNode succ){
		this.element = elem;
		this.succ = succ;
	}
	
	
}
