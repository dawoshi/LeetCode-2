package loj;

public class LOJ_70 
{
    public int climbStairs(int n) 
    {
    	if(n == 1)	//special case
    	{
    		return 1;
    	}
    	//a[1] = 1, a[2] = 2, a[n] = a[n - 1] + a[n - 2]
    	int a1 = 1, a2 = 2, t = 0;
    	for(int i = 3; i <= n; i++)
    	{
    		t = a2;
    		a2 = a1 + a2;
    		a1 = t;
    	}
    	return a2;
    }
    
    public static void main(String[] args)
    {
    	LOJ_70 l = new LOJ_70();
    	for(int i = 1; i <= 50; i++)
    	{
    		System.out.println(l.climbStairs(i));
    	}
    }
}
