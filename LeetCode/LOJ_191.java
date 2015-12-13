package loj;

public class LOJ_191 
{
    public int hammingWeight(int n) 
    {
    	String str = Integer.toBinaryString(n);
    	//System.out.println(str);
    	int l = str.length(), cnt = 0;
    	for(int i = 0; i <= l - 1; i++)
    	{
    		if(str.charAt(i) == '1')
    		{
    			cnt++;
    		}
    	}
    	return cnt;
    }
    
    public static void main(String[] args)
    {
    	LOJ_191 l = new LOJ_191();
    	System.out.println(l.hammingWeight(-11));
    }
}
