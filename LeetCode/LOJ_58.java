package loj;

public class LOJ_58 
{
    public int lengthOfLastWord(String s) 
    {
    	int ls = s.length(), lt = 0, cnt = 0;
    	if(ls == 0)								//if the string s is ""
    	{
    		return 0;
    	}
    	for(int i = ls - 1; i >= 0; i--)		//consider the last several characters are ' '
    	{
    		if(s.charAt(i) != ' ')
    		{
    			lt = i;
    			break;
    		}
    	}
    	for(int i = lt; i >= 0; i--)
    	{
    		if(s.charAt(i) != ' ')
    		{
    			cnt ++;
    		}
    		else
    		{
    			return cnt;
    		}
    	}
    	return cnt;
    }
    
    public static void main(String[] args)
    {
    	LOJ_58 l = new LOJ_58();
    	System.out.println(l.lengthOfLastWord(""));
    }
}
