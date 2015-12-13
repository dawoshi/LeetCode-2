package loj;

public class LOJ_258 
{
    public int addDigits(int num) 
    {
    	if(num == 0)
    	{
    		return 0;
    	}
    	else if(num % 9 == 0)
    	{
    		return 9;
    	}
    	else
    	{
    		return num % 9;
    	}
    }
    
    public static void main(String[] args)
    {
    	LOJ_258 l = new LOJ_258();
    	System.out.println(l.addDigits(38));
    }
}
