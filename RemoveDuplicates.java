import java.util.Random;
import java.util.HashMap;
//import java.util.HashTable;
public class RemoveDuplicates {

	public static void main(String[] args) {
		Node head= new Node(5);
		Random rand = new Random();
		for(int i=0;i<20;i++)
			head.appendToTail(rand.nextInt(10));
		head.printLinkedList();
		inplaceRD(head);
		System.out.println();
		head.printLinkedList();
		// TODO Auto-generated method stub
		

	}
	public static void removeDuplicates(Node head)
	{
		HashMap map= new HashMap<Integer, Boolean>();
		Node previous=null;
		while(head!=null)
		{
			if(map.containsKey(head.data))
			{
				previous.next=head.next;
				
			}else {
				map.put(head.data, true);
				previous=head;
			}
			head=head.next;
		}
		
	}
	public static void inplaceRD(Node head)
	{
		if(head==null) return;
		Node current =head;
		while(current!=null)
		{
			Node runner=current;
			while(runner.next!=null)
			{
				if(runner.next.data==current.data)
					runner.next=runner.next.next;
				else
					runner=runner.next;	
			}
			current=current.next;
		}
	}
}


public class Node {
	Node next= null;
	int data;
	public Node(int d)
	{
		data=d;
	}
	void appendToTail(int d)
	{
		Node end= new Node(d);
		Node n=this;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=end;
	}
	public Node deleteNode(Node head, int d)
	{
		Node n= head;
		if((n.data== d)){
			return head.next;
		}
		while(n.next!=null)
		{
			if( n.next.data==d)
			{
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}
	public void printLinkedList()
	{
		Node curr= this;
		while(curr.next!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

}

