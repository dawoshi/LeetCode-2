package loj;

public class LOJ_5 
{
//    public String longestPalindrome(String s) 			//Time Limit Exceeded
//    {
//    	int count = 0, ans = -1, pos = -1, st = -1, d = 0;
//    	for(int i = 0; i <= s.length() - 1; i++)
//    	{
//    		count = 1;
//    		pos = i;
//    		d = 1;
//    		while(pos - d >= 0 && pos + d <= s.length() - 1)		//a-b-a type
//    		{
//    			if(s.charAt(pos - d) == s.charAt(pos + d))
//    			{
//    				count += 2;
//    			}
//    			else
//    			{
//    				break;
//    			}
//    			d++;
//    		}
//			if(count > ans)
//			{
//				ans = count;
//				st = pos - d + 1;
//			}
//    		count = 2;
//    		pos = i;
//    		d = 1;
//    		if(pos + 1 <= s.length() - 1 && s.charAt(pos) == s.charAt(pos + 1))							//a-b-b-a type
//    		{
//    			while(pos -d >= 0 && pos + 1 + d <= s.length() - 1)
//    			{
//    				if(s.charAt(pos - d) == s.charAt(pos + 1 + d))
//    				{
//    					count += 2;
//    				}
//    				else
//    				{
//    					break;
//    				}
//    				d++;
//    			}
//    			if(count > ans)
//    			{
//    				ans = count;
//    				st = pos - d + 1;
//    			}
//    		}
//    	}
//    	String str = "";
//    	for(int i = st; i <= st + ans - 1; i++)
//    	{
//    		str += s.charAt(i);
//    	}
//    	return str;
//    }
    
    public String longestPalindrome(String s) 
    {
    	
    	return null;
    }
    
    public static void main(String[] args)
    {
    	LOJ_5 l = new LOJ_5();
    	String ts = "1234321";
    	System.out.println(l.longestPalindrome(ts));
    }
}
