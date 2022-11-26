package singlelinked;
public class singlelinkedList {

	public static void main(String[] args) {
		
		Node n1 = new Node(2, null);
		Node n2 = new Node(6, null);
		Node n3 = new Node(4, null);
		Node n4 = new Node(9, null);
		Node n5 = new Node(5, null);
		n1.Next = n2;
		n2.Next = n3;
		n3.Next = n4;
		n4.Next = n5;
		method list = new method();
		list.Head = n1;
		Node one = new Node(1, null);
		list.Push(one);
		list.systemOut();
		list.bubbleSort();
		list.systemOut();
		
	}

}