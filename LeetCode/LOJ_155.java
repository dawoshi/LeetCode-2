package loj;

public class LOJ_155 
{
	private int top = -1;
	private int[] stack = new int[100000];
	
    public void push(int x) 
    {
        stack[++top] = x;
    }

    public void pop() 
    {
        top--;
    }

    public int top() 
    {
        return stack[top];
    }

    public int getMin() 
    {
    	int min = 2147483647;		//1 << 31 - 1 = 2147483648 - 1
        for(int i = 0; i <= top; i++)
        {
        	if(stack[i] < min)
        	{
        		min = stack[i];
        	}
        }
        return min;
    }
    
    public static void main(String[] args)
    {
    	System.out.println(1 << 31);			//-2147483648
    	System.out.println((1 << 31) - 1);		//2147483647
    	System.out.println(1 << 31 - 1);		//1073741824
    	System.out.println((1 << 30) - 1);		//1073741823
    	System.out.println(1 << 30 - 1);		//536870912
    	System.out.println(2147483647);			//2147483647
    }
}
