package loj;

public class LOJ_27 
{
    public int removeElement(int[] nums, int val) 
    {
        int len = nums.length;
        for(int i = 0; i <= len - 1;)
        {
        	if(nums[i] == val)
        	{
        		for(int j = i + 1; j <= len - 1; j++)
        		{
        			nums[j - 1] = nums[j];
        		}
        		len--;
        	}
        	else
        	{
        		i++;
        	}
        }
        return len;
    }
    
    public static void main(String[] args)
    {
    	LOJ_27 l = new LOJ_27();
    	int[] a = {1, 2, 3, 4, 2, 2, 1, 2, 3, 4, 5};
    	System.out.println(l.removeElement(a, 2));
    }
}
