package singlelinked;

public class Node {
		public Node Next;
		public int Value;
		
		public Node(int value, Node next) {
			this.Next = next;
			this.Value = value;
			
	}		
}