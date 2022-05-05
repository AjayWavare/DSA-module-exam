class Stack2
{
	int max=10;
	int a[]= new int[max];
	int top1=-1;
	int top2=max-1;
	
	
	
	public void push1(int value)
	{
		a[++top1]=value;	
		
	}
	
	public void push2(int value)
	{
		a[--top2]=value;
	}
	public void pop1()
	{
		System.out.println("Poped element from stack1 is "+a[top1--]);
	}
	
	public void pop2()
	{
		
		System.out.println("Poped element from stack2 is "+a[top2++]);
	}
	
	public static void main(String[]args)
	{
		
		Stack2 S = new Stack2();
		S.push1(5);
		S.push2(10);
		S.push2(15);
		S.push1(11);
		S.push2(7);
		S.push2(40);
		S.pop1();
		S.pop2();
	}
}