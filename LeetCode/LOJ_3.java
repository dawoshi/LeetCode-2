package loj;
import java.util.Arrays;

public class LOJ_3 
{
	public int lengthOfLongestSubstring(String s) 
	{
		int len = s.length();
		if(len == 0)
		{
			return 0;
		}
		else if(len == 1)
		{
			return 1;
		}
		else
		{
			int ans = -1;
			boolean[] hash = new boolean[305];			//hash array, T(n) = O(n)
			Arrays.fill(hash, false);
			hash[s.charAt(0)] = true;
			for(int i = 0, j = 1; i <= len - 1 && j <= len - 1;)
			{
				if(hash[s.charAt(j)])
				{
					hash[s.charAt(i++)] = false;
				}
				else
				{
					hash[s.charAt(j++)] = true;
					if(j - i > ans)
					{
						ans = j - i;
					}
				}
			}
			return ans;
		}
	} 
	
	public static void main(String[] args)
	{
		LOJ_3 l = new LOJ_3 ();
		System.out.println(l.lengthOfLongestSubstring("abbcabcaabcabcc"));
	}
}
