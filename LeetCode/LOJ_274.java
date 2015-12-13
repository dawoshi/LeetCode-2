package loj;

import java.util.Arrays;

public class LOJ_274 
{
	public int hIndex(int[] citations) 
	{
		//exceptional case: 
		if(citations == null || citations.length == 0)
		{
			return 0;
		}
		//length variable
		int n = citations.length, ans = -1;
		//sort: from small to large
		Arrays.sort(citations);
		//reverse: form large to small
		for (int i = 0; i < n / 2; i++) 
		{
			int tmp = citations[i];
			citations[i] = citations[n - 1 - i];
			citations[n - 1 - i] = tmp;
		}
		int max = n < citations[0] ? n : citations[0];
		int min = n < citations[n - 1] ? n : citations[n - 1];
		for(int i = max; i >= min; i--)
		{
			int cnt = 0;
			for(int j = 0; j <= n - 1; j++)
			{
				if(citations[j] >= i)
				{
					cnt++;
				}
				else
				{
					break;
				}
			}
			if(cnt >= i)
			{
				ans = i;
				break;
			}
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		LOJ_274 l = new LOJ_274();
		int[] a = {1};
		System.out.println(l.hIndex(a));
	}
}
