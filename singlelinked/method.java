package singlelinked;

public class method {
		public Node Head;
		public void Push(Node start) {
			start.Next = Head;
			Head = start;
		}
		
		public void Swap() {
			Node current = Head;
			Node next = current.Next;
			Node nextnext = next.Next;
			Head = next;
			next.Next = current;
			current.Next = nextnext;
		}
		
		public void continueSwap(Node n, Node prev) {
			Node next = n.Next;
			Node nextnext = next.Next;
			n.Next = nextnext;
			prev.Next = next;
			next.Next = n;
		}
	
		public void bubbleSort() {
			boolean doSwap = true;
			while(doSwap) {
				Node current = Head;
				Node prev = null;
				doSwap = false;
				while(current.Next.Next != null) {
					System.out.println(current.Value);
					systemOut();
					if(current.Value > current.Next.Value) {
						if(current == Head) {
							prev = Head.Next;
							Swap();	
						}
						
						else {
							continueSwap(current, prev);
							prev = prev.Next;
						}

						doSwap = true;
					}
					
					else {
						prev = current;
						current = current.Next;	
					}
					
				}
			}
		}
		
		public void systemOut() {
			Node current = this.Head;
			do {
				System.out.print(current.Value + " ");
				current = current.Next;
			} 
			while(current != null);
			System.out.println();
		}
	}