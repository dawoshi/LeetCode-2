package loj;

public class LOJ_225 
{
	private int[] queue = new int[10000];
	private int front = -1, rear = -1;
	
	/*
	 * only push to back, peek/pop from front, size, 
	 * and is empty operations are valid.
	 */
	
	private void push1(int x)
	{
		queue[++rear] = x;
	}
	
	private void pop1()
	{
		rear--;
	}
	
	private int peek1()
	{
		return queue[rear];
	}
	
	private int size1()
	{
		return rear - front;
	}
	
	private boolean empty1()
	{
		if(rear - front == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
    // Push element x onto stack.
    public void push(int x) 
    {
        push1(x);
    }

    // Removes the element on top of the stack.
    public void pop() 
    {
        pop1();
    }

    // Get the top element.
    public int top() 
    {
        return peek1();
    }

    // Return whether the stack is empty.
    public boolean empty() 
    {
        return empty1();
    }
}
