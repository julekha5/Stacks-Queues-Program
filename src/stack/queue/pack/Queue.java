package stack.queue.pack;

public class Queue<T> {

	LinkedList<T> linkedList;

	/*
	 * Queue constructor is used to declare linked list
	 */
	public Queue() {
		this.linkedList = new LinkedList<>();
	}

	/*
	 * enqueue method appends the data in form of linked list
	 * 
	 * @param data is a T type data which is added to list
	 */
	public void enqueue(T data) {
		linkedList.append(data);
	}

	/*
	 * dequeue method has ability to remove the last data used popLast method from
	 * linked list for dequeue
	 */
	public void dequeue() {
		linkedList.popLast();
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
	}
}