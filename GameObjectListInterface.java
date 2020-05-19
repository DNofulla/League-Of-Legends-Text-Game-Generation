package package1;

/* Please read the comments in the GameObjectList.java class for all the details */
public interface GameObjectListInterface<T> {
	public GameNode<T> get(int i) throws Exception;
	public String toString();
	public void printList();
	public void add(GameNode<T> node);
	public void add(T data);
	public void removeAll();
	public GameNode<T> getHead();
	public void setHead(GameNode<T> head);
	public int getSize();
	public void setSize(int size);
}
