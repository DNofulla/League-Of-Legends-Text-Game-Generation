package package1;

/* Generic Doubly Linked List Node class I use in my GameObjectList class (The actual doubly linked list) */
public class GameNode<T> {
	
	private GameNode<T> next;
	private GameNode<T> prev;
	private T data;
	
	
	// A bunch of constructors for all types of scenarios
	public GameNode() {
		this.next = null;
		this.prev = null;
		this.data = null;
	}
	
	public GameNode(T data){
		this.next = null;
		this.prev = null;
		this.data = data;
	}
	
	public GameNode(GameNode<T> node) {
		if (node.data != null) {
			this.data = node.data;
		}
		
		if (node.next != null) {
			this.next = node.next;
		}
		
		if (node.prev != null) {
			this.prev = node.prev;
		}
	}
	
	public GameNode(GameNode<T> nextNode, T data){
		this.prev = null;
		this.next = nextNode;
		this.data = data;
	}
	
	public GameNode(GameNode<T> nextNode, GameNode<T> prevNode, T data) {
		this.next = nextNode;
		this.prev = prevNode;
		this.data = data;
	}

	// Getters and setters for the previous Node, next Node and the data of the current node
	public GameNode<T> getNext() {
		return next;
	}

	public void setNext(GameNode<T> nextNode) {
		this.next = nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public GameNode<T> getPrev() {
		return prev;
	}

	public void setPrev(GameNode<T> prev) {
		this.prev = prev;
	}
	
	// This helps get the string form of the element in the GameNode
	public String toString() {
		return getData().toString();
	}

	
	
	
}
