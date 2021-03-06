package loj;

public class LOJ_75 
{
    public void sortColors(int[] nums) 
    {
    	int r = 0, w = 0, b = nums.length - 1, t = 0;		//three flags: r(red,0), w(white,1), b(blue,2) represent the positions
    	if(b <= 0)
    	{
    		return;
    	}
    	while(w <= b)
    	{
    		if(nums[w] == 1)
    		{
    			w++;
    		}
    		else if(nums[w] == 0)
    		{
    			if(nums[r] != 0)
    			{
        			t = nums[r];
        			nums[r] = nums[w];
        			nums[w] = t;
    			}
    			r++;
    			w++;
    		}
    		else if(nums[w] == 2)
    		{
    			while(w < b && nums[b] == 2)
    			{
    				b--;
    			}
    			if(nums[b] != 2)
    			{
        			t = nums[w];
        			nums[w] = nums[b];
        			nums[b] = t;
    			}
    			b--;
    		}
    	}
    }
    
    public static void main(String[] args)
    {
    	int[] a = {0, 0};			//{1, 0}; {2,1,0,1,2,2,0,1,2,1,0,0,0,1};
    	LOJ_75 l = new LOJ_75();
    	l.sortColors(a);
    	for(int i = 0; i <= a.length - 1; i++)
    	{
    		System.out.println(a[i]);
    	}
    }
}
