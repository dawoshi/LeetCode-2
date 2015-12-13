package loj;

public class LOJ_232 
{
	//two stacks's declaration
	int[] stack1 = new int[10000];
	int[] stack2 = new int[10000];
	int top1 = -1;
	int top2 = -1;
	
	/*
	 * only push to top, peek/pop from top, 
	 * size, and is empty operations for stack 
	 * are valid.
	 */
	
	private void push1(int x)
	{
		stack1[++top1] = x;
	}
	
	private void push2(int x)
	{
		stack2[++top2] = x;
	}
	
	private void pop1()
	{
		top1--;
	}
	
	private void pop2()
	{
		top2--;
	}
	
	private int peek1()
	{
		return stack1[top1];
	}
	
	private int peek2()
	{
		return stack2[top2];
	}
	
	private int size1()
	{
		return top1 + 1;
	}
	
	private int size2()
	{
		return top2 + 1;
	}
	
	private boolean empty1()
	{
		if(top1 == -1)
		{
			return true;
		}
		else return false;
	}
	
	private boolean empty2()
	{
		if(top2 == -1)
		{
			return true;
		}
		else return false;
	}
	
    // Push element x to the back of queue.
    public void push(int x) 
    {
        push1(x);
    }

    // Removes the element from in front of queue.
    public void pop() 
    {
    	int t = 0;
    	while(!empty1())
    	{
    		t = peek1();
    		push2(t);
    		pop1();
    	}
    	pop2();
    	while(!empty2())
    	{
    		t = peek2();
    		push1(t);
    		pop2();
    	}
    }

    // Get the front element.
    public int peek() 
    {    	
    	int t = 0;
    	while(!empty1())
    	{
    		t = peek1();
    		push2(t);
    		pop1();
    	}
	    int ans = peek2();
	    while(!empty2())
	    {
	    	t = peek2();
	    	push1(t);
	    	pop2();
	    }
    	return ans;
    }

    // Return whether the queue is empty.
    public boolean empty() 
    {
        return empty1();
    }
    
    public static void main(String[] args)
    {
    	LOJ_232 l = new LOJ_232();
    	l.push(1);
    	l.push(2);
    	l.pop();
    	System.out.println(l.peek());
    }
}
