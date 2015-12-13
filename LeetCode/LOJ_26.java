package loj;

public class LOJ_26 
{
    public int removeDuplicates(int[] nums) 
    {
    	if(nums.length == 0 || nums == null)
    	{
    		return 0;
    	}
    	if(nums.length == 1)
    	{
    		return 1;
    	}

        int p = 0, q = 1, len = nums.length;
        
        while(true)
        {
        	if(q > len - 1)
        	{
        		break;
        	}
        	if(nums[p] == nums[q])
        	{
        		for(int i = q + 1; i <= len - 1; i++)
        		{
        			nums[i - 1] = nums[i];
        		}
        		len --;
        	}
        	else
        	{
        		p++;
        		q++;
        	}
        }
        return len;
    }
    
    public static void main(String[] args)
    {
    	LOJ_26 l = new LOJ_26();
    	int[] a = new int[]{1,2,2,2,3,3,3,4,4};
    	System.out.println(l.removeDuplicates(a));
    }
}
