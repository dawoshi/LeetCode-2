package loj;

public class LOJ_169 
{
    public int majorityElement(int[] nums) 
    {
    	int target = -1,cnt = 0;
        for(int i = 0; i <= nums.length - 1; i++)
        {
        	if(cnt == 0)
        	{
        		target = nums[i];
        		cnt = 1;
        	}
        	else
        	{
        		if(target == nums[i])
        		{
        			cnt++;
        		}
        		else
        		{
        			cnt--;
        		}
        	}
        }
        
          //This problem defaults that the majorityElement is existed.
//        int num = 0;
//        boolean flag = false;
//        for(int i = 0; i <= nums.length - 1; i++)
//        {
//        	if(target == nums[i])
//        	{
//        		num++;
//        	}
//        }
//        if(num > nums.length / 2)
//        {
//        	flag = true;
//        }

        return target;
    }
    
    public static void main(String[] args)
    {
    	LOJ_169 l = new LOJ_169();
    	int[] a = {1,1,2,2,2,2,3};
    	System.out.println(l.majorityElement(a));
    }
}
