public class ListTester {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(3);
		sll.add(4);
		sll.add(10);
		sll.add(18);
		sll.add(1);
		sll.add(32);
		sll.printValues();
		sll.remove();
		sll.remove();
		sll.printValues();
		Node f1 = sll.find(3);
		System.out.println("Value: "+f1.value+"\nNext Node: "+f1.next);
		sll.removeAt(3);
		sll.printValues();
	}

}
