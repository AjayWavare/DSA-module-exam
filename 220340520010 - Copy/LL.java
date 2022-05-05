class LL
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int value)
		{
			data=value;
			next=null;
		}
	}
	
	public void Add(int value)
	{
		Node n = new Node(value);
		Node temp=head;
		if(head==null)
		{
			head=n;
		}else
		temp.next=n;
		temp=n;
		System.out.println(temp.data);
	}
	public void  reverse()
	{
		
		Node trav=head;
		Node temp=head;
		while(trav!=null)
		{
			temp=trav;
			trav=trav.next;
			
		}
		 System.out.println(temp.data);
	}
	public static void main(String[]args)
	{
		LL L = new LL();
		L.Add(1);
		L.Add(5);
		L.Add(1);
		L.Add(2);
		L.Add(3);
		L.Add(4);
		L.Add(5);
		System.out.println("reverse data");
		L.reverse();
	}
}