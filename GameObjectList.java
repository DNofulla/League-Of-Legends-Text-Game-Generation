package package1;

/* This class is basically a doubly linked list with only an add method and removeAll() method */
public class GameObjectList<T> implements GameObjectListInterface<T>{

	// head of the list and size
	private GameNode<T> head;
	private int size = 0;
	
	// This gets the element at a certain index in the list
	public GameNode<T> get(int index) throws Exception {
		
		GameNode<T> cur = new GameNode<T>();
		cur = getHead();
		
		if (index >= getSize()) {
			throw new Exception("Index out of Bounds!");
		}
		
		for (int i = 0; i < index; i++) {
			cur = cur.getNext();
		}
		return cur;
	}
	
	// 2 versions of add() for 2 different circumstances
	// If we are adding an element, we encapsulate it in a node and then add it
	public void add(T data) {
		GameNode<T> cur = getHead();
	    GameNode<T> node = new GameNode<T>(data); 
	    
	    node.setNext(null);
	    
	    if (getHead() == null) { 
	        node.setPrev(null); 
	        setHead(node); 
	        return; 
	    }
	    while (cur.getNext() != null) {
	    	cur = cur.getNext(); 
	    }
	    cur.setNext(node); 
	    node.setPrev(cur); 
	    this.size++;
	}
	
	// If we are adding a node directly, we just pass in the node
	public void add(GameNode<T> node) {
		GameNode<T> cur = getHead();
	    node.setNext(null);
	    
	    if (getHead() == null) { 
	        node.setPrev(null);; 
	        setHead(node);
	        return; 
	    }
	    while (cur.getNext() != null) {
	    	cur = cur.getNext(); 
	    }
	    cur.setNext(node); 
	    node.setPrev(cur);
	    this.size++;
	}
	
	// Removes all elements in the list
	public void removeAll() {
		this.head = null;
		this.size = 0;
	}
	
	// This toString() method turns all elements of the list into a neat string to make the output look better
	public String toString() {
		String str = "";
		GameNode<T> cur = new GameNode<T>(getHead());
		
		for (int i = 0; i < getSize() + 1; i++) {
			str = str + "\n\n----------------------------- " + 
						"SUMMONER " + (i + 1) + 
						" ----------------------------" + 
						cur.getData();
			cur = cur.getNext();
		}
		return str;
	}
	
	// Prints the list
	public void printList() {
		System.out.println(toString());
	}
	
	// Getter and Setter methods for the head and size
	public GameNode<T> getHead() {
		return head;
	}

	public void setHead(GameNode<T> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
