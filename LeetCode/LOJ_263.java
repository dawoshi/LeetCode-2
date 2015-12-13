package loj;

public class LOJ_263 
{
    public boolean isUgly(int num) 
    {
    	if(num == 0)
    	{
    		return false;
    	}
    	while(num % 2 == 0)
    	{
    		num /= 2;
    	}
    	while(num % 3 == 0)
    	{
    		num /= 3;
    	}
    	while(num % 5 == 0)
    	{
    		num /= 5;
    	}
    	if(num == 1)
    	{
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args)
    {
    	LOJ_263 l = new LOJ_263 ();
    	if(l.isUgly(6))
    	{
    		System.out.println("true");
    	}
    	else
    	{
    		System.out.println("false");
    	}
    	if(l.isUgly(8))
    	{
    		System.out.println("true");
    	}
    	else
    	{
    		System.out.println("false");
    	}
    	if(l.isUgly(14))
    	{
    		System.out.println("true");
    	}
    	else
    	{
    		System.out.println("false");
    	}
    }
}
