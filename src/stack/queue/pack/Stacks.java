package stack.queue.pack;

public class Stacks<T> {
	LinkedList<T> linkedList;

	/**
	 * stack constructor is used to declare linked list
	 */
	public Stacks() {
		this.linkedList = new LinkedList<>();
	}

	/**
	 * push method is used in stack operation to push the data
	 * 
	 * @param data is of generic type
	 */
	public void push(T data) {
		linkedList.add(data);
	}

	/**
	 * pop method is last in first out process where the last element is popped out
	 * first and deletes the element
	 */
	public void pop() {
		linkedList.pop();
	}

	/**
	 * peek method is to show to first element in the linked list it does not delete
	 * the node from the stack memory
	 */
	public void peek() {
		linkedList.peek();
	}

	public static void main(String[] args) {
		Stacks<Integer> stk = new Stacks<>();
		stk.push(70);
		stk.push(30);
		stk.push(56);
		stk.peek();
		stk.pop();
		stk.peek();
	}
}