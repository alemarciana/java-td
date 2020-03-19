public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		this.head = null;
	}
	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		}
		else {
			Node runner = head;
			while( runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	public void remove(){
		Node aux = head;
		while ( aux.next != null) {
			if (aux.next.next == null){
				aux.next = null;
				break;
			}
			else {
				aux = aux.next;
			}
		}
	}
	public void printValues(){
		Node aux = head;
		try {
			while ( aux.next != null) {
				System.out.println(aux.value);
				aux = aux.next;
			}
			System.out.println(aux.value);
		}
		catch(NullPointerException err) {
		System.out.println("La lista no tiene valores");
		}
	}
	public Node find(int val){
		Node aux = head;
		while ( aux.next != null) {
			if ( aux.value == val ){
				break;
			}
		}
		return aux;
	}
	public void removeAt(int index){
		if ( index < 1 ){
			head = null;
		}
		else {
			Node aux = head;
			for ( int i = 0; i < index-1; i++ ){
				aux = aux.next;
			}
			aux.next = null;
		}
	}
}
